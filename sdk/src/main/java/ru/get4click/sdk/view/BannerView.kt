package ru.get4click.sdk.view

import android.content.Context
import android.util.AttributeSet
import android.webkit.WebView
import ru.get4click.sdk.models.Banner

  class BannerView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : WebView(context, attrs, defStyleAttr) {


    init {
        settings.javaScriptEnabled = true
        settings.useWideViewPort = true
    }

    override fun canScrollVertically(direction: Int): Boolean {
        return false
    }

    override fun canScrollHorizontally(direction: Int): Boolean {
        return false
    }

     fun showBanner(banner: Banner?, scale: Double) {
        val string = banner?.getScript(scale) ?: ""
        loadData(string, "text/html", "UTF-8")
    }

    private fun showDebugBanner(banner: Banner?, scale: Double=1.0){
        val string = banner?.getDebugScript(scale) ?: ""
        loadData(string, "text/html", "UTF-8")
    }


}