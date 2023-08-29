package ru.get4click.sdk

import androidx.activity.ComponentActivity
import ru.get4click.sdk.api.WheelOfFortune
import kotlinx.coroutines.MainScope
import ru.get4click.sdk.api.*
import ru.get4click.sdk.api.SimpleBannerPromoCode
import ru.get4click.sdk.api.WheelOfFortuneImpl
import ru.get4click.sdk.data.BannerPromoCodeService
import ru.get4click.sdk.data.CrossMailService
import ru.get4click.sdk.data.WheelOfFortuneService
import ru.get4click.sdk.api.BannerPromoCode
import ru.get4click.sdk.data.PreCheckoutService
import ru.get4click.sdk.data.models.Email
import ru.get4click.sdk.models.Banner
import ru.get4click.sdk.models.BannerPromoCodeStaticConfig
import ru.get4click.sdk.models.Order
import ru.get4click.sdk.ui.bannerpromocode.PromoCodeCreds
import ru.get4click.sdk.utils.isEmail

object Get4ClickSDK {

    internal const val TAG = "Get4Click"

    private var shopId = 0
    private var orderMap: MutableMap<String, Order> = HashMap<String, Order>()

    private val sdkScope = MainScope()

    private var _crossMail: CrossMail? = null

    /**
     * Returns the [CrossMail] singleton that can be used across the app
     */
    fun getCrossMail(apiKey: String): CrossMail {
        return _crossMail ?: CrossMailImpl(CrossMailService(), sdkScope, apiKey)
            .also { _crossMail = it }
    }

    fun getShopId(): Int {
        return shopId
    }


    private fun intSDKErrors() {
        shopIdError()
    }

    private fun shopIdError() {
        if (getShopId() == 0) {
            throw IllegalArgumentException("You have to set shopId first in initSDK() method")
        }
    }


    fun getBannerWithCurrentOrder(bannerId: Int): Banner {
        intSDKErrors()
        return Banner(bannerId, getCurrentOrder())
    }


    fun getCurrentOrder(): Order {
        return orderMap.get("current")!!
    }

    fun addOrder(name: String, id: Order) {
        orderMap.put(name, id)
    }

    fun resetCurrentOrder() {
        orderMap.put("current", Order())
    }

    fun removeOrder(name: String) {
        orderMap.remove(name)
    }

    fun getOrderBy(name: String): Order? {
        return orderMap.get(name)
    }

    fun clearOrders() {
        orderMap.clear()
    }


    fun initSdk(shopId: Int) {
        this.shopId = shopId
        orderMap.put("current", Order())
    }

    /**
     * Creates an instance of [WheelOfFortune]
     *
     * @param activity the host activity
     * @param apiKey user's API key
     * @param wheelOfFortuneListener listens for WOF events
     */
    fun createWheelOfFortune(
        activity: ComponentActivity,
        apiKey: String,
        wheelOfFortuneListener: WheelOfFortuneListener = object : WheelOfFortuneListener {}
    ): WheelOfFortune {
        return WheelOfFortuneImpl(
            activity = activity,
            apiKey = apiKey,
            wheelOfFortuneApi = WheelOfFortuneService(),
            wheelOfFortuneListener = wheelOfFortuneListener
        )
    }

    /**
     * Creates an instance of simple implementation of [BannerPromoCode]
     *
     * @param activity
     * @param apiKey user's API Key
     * @param email user email
     * @param viewType defines what type of banner view to use
     * @param config configure promo code banner view
     * @param promoCodeListener listens for Banner Promo Code events
     */
    fun createSimpleBannerPromoCode(
        activity: ComponentActivity,
        apiKey: String,
        email: String,
        viewType: BannerPromoCodeViewType = BannerPromoCodeViewType.Simple,
        config: BannerPromoCodeStaticConfig = BannerPromoCodeStaticConfig(),
        promoCodeListener: BannerPromoCodeListener = object : BannerPromoCodeListener {}
    ): BannerPromoCode {
        require(email.isEmail()) { "[email] is not correct" }

        return SimpleBannerPromoCode(
            activity = activity,
            promoCodeCreds = PromoCodeCreds(Email(email), apiKey),
            config = config,
            viewType = viewType,
            bannerPromoCodeApi = BannerPromoCodeService(),
            promoCodeListener = promoCodeListener
        )
    }

    /**
     * Creates an instance of [PreCheckoutBanner]
     *
     * @param activity host activity
     * @param apiKey user's API Key
     * @param shopId user's shop id
     */
    fun createPreCheckoutBanner(
        activity: ComponentActivity,
        apiKey: String,
        preCheckoutListener: PreCheckoutListener = object : PreCheckoutListener { }
    ): PreCheckoutBanner {
        return PreCheckoutBannerImpl(
            activity = activity,
            apiKey = apiKey,
            preCheckoutApi = PreCheckoutService(),
            preCheckoutListener = preCheckoutListener
        )
    }
}