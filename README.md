# GET4Click SDK Android
Это SDK для GET4Click , язык Kotlin (Android ) , Swift(IOS) в будущем релизе возможен переход на Kotlin Multiplatform

## Установка  

Установка происходит через maven репозиторий  или скачав get4clickSdk.aar 

Сначала включите JitPack в  repositories list,

```groovy
repositories {
    maven { url "https://jitpack.io" }
}
```

Чтобы импортировать GET4Click sdk импортируйте зависимость,

```groovy
dependencies {
     implementation 'com.github.getforclick:Android-SDK:1.0'
}
```

## Быстрый старт

В начале (перед созданием  заказа )инициализируйте SDK , методом initSDK(shopId : Int) задав ваш shopId 

```kotlin
   GET4ClickSDK.initSDK(863)
```


Чтобы собрать параметры для заказа воспользуйтесь паттерном builder для обьекта order 

```kotlin
    GET4ClickSDK.getCurrentOrder().
					setCustomerFirstName('name').
					setCustomerLastName('lastname')...

 ```

Возможные параметры для обьекта Order :


    Gender {
        male,
        female
    }

     customerFirstName: String
     customerLastName: String
     customerEmail: String
     customerPhone: String
     customerGender: Gender
     orderId: String
     orderValue: String
     orderCurrency: Currency
     usedPromoCode: String
     usedCategory : String




Есть возможность добавить несколько обьектов Order, для последующего выбора и вставки в BannerView


```kotlin
    GET4ClickSDK.addOrder("NewOne")
	
	 GET4ClickSDK.getOrder("NewOne").
					setCustomerFirstName('name').
					setCustomerLastName('lastname')...

 ```
 
Добавьте BannerView в разметку xml , или создайте программно 

```xml
    <ru.get4click.sdk.view.BannerView
            android:layout_width="match_parent"
            android:id="@+id/bannerView"
            android:layout_height="150dp"/>

 ```
Создайте обьект Banner , передав ему bannerId  и Order 

```kotlin
val banner = Banner(bannerId, order)
 ```
 
для удобства есть метод формирования обькета Banner для текущего Order в GET4ClickSDK.getBannerWithCurrentOrder(bannerId)


Вызовите метод showBanner(banner) у BannerView когда будете готовы 

```kotlin
BannerView.showBanner(banner)
 ```


У метода showBanner() есть не обязательный параметр scale : Double - можно уменьшить или увеличить баннер (по умолчанию 1.0)

Вызовите метод  GET4ClickSDK.resetCurrentOrder() для сброса текущего Order

Полный код выглядит так :
```kotlin
        Get4ClickSDK.initSdk(863)

     
        Get4ClickSDK.getCurrentOrder().customerFirstName = "FirstName"
        Get4ClickSDK.getCurrentOrder().setCustomerLastName("LastName")
									  .setCustomerGender(Order.Gender.male)


        val bannerView: BannerView = findViewById(R.id.bannerView)
        val banner = Get4ClickSDK.getBannerWithCurrentOrder(2804)
        bannerView.showBanner(banner, 0.8)
 ```


