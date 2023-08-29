package ru.get4click.sdk.api

import android.util.Log
import androidx.activity.ComponentActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import ru.get4click.sdk.data.PreCheckoutApi
import ru.get4click.sdk.models.PreCheckoutModel
import ru.get4click.sdk.ui.precheckout.PreCheckoutViewWrapper

internal class PreCheckoutBannerImpl(
    private val activity: ComponentActivity,
    private val apiKey: String,
    private val preCheckoutApi: PreCheckoutApi,
    private val preCheckoutListener: PreCheckoutListener
) : PreCheckoutBanner {
    private var preCheckoutModel: PreCheckoutModel? = null

    private var preCheckoutViewWrapper: PreCheckoutViewWrapper? = null

    private val scope = activity.lifecycleScope

    init {
        scope.launch(Dispatchers.IO) {
            preCheckoutApi.getPreCheckoutData(apiKey).onSuccess { preCheckoutModel ->
                this@PreCheckoutBannerImpl.preCheckoutModel = PreCheckoutModel(
                    widgetId = preCheckoutModel.widgetId,
                    baseColor = preCheckoutModel.baseColour,
                    messages = preCheckoutModel.messages,
                    hiding_time = preCheckoutModel.hidingTime * ONE_SECOND_IN_MILLISECONDS,
                    sessionId = preCheckoutModel.sessionId
                )
                withContext(Dispatchers.Main) {
                    preCheckoutListener.onInit()
                    this@PreCheckoutBannerImpl.preCheckoutModel?.let { data ->
                        preCheckoutViewWrapper = PreCheckoutViewWrapper.make(
                            activity.window.decorView.rootView,
                            data
                        ) { close() }
                        preCheckoutViewWrapper?.show()
                    }
                }
            }.onFailure { e ->
                withContext(Dispatchers.Main) { preCheckoutListener.onInitFailed() }
                Log.e(TAG, e.message ?: "")
            }
        }
    }

    private fun close() {
        scope.launch(Dispatchers.IO) {
            if (preCheckoutModel != null)
                preCheckoutApi.sendNotifyClose(
                    apiKey,
                    preCheckoutModel?.widgetId ?: 1,
                    preCheckoutModel?.sessionId ?: "",
                    ACTION_CLOSE
                ).onSuccess { /* no-op */ }.onFailure { Log.e(REQUEST_FOR_CLOSE, ERROR_MESSAGE) }
            withContext(Dispatchers.Main) {
                restartShowWidget(preCheckoutModel?.hiding_time ?: ONE_SECOND_IN_MILLISECONDS)
            }
        }
    }

    override fun show() {
        preCheckoutViewWrapper?.show()
    }

    private suspend fun restartShowWidget(time: Long) {
        delay(time)
        preCheckoutViewWrapper?.show()
    }

    companion object {
        private const val TAG = "Precheckout"
        private const val ACTION_CLOSE = "close"
        private const val ONE_SECOND_IN_MILLISECONDS: Long = 1000
        private const val REQUEST_FOR_CLOSE = "request for close"
        private const val ERROR_MESSAGE = "the request has not been sent"
    }
}