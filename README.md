[![](https://jitpack.io/v/illabo/DadataSuggestions.svg)](https://jitpack.io/#illabo/DadataSuggestions)

## DadataSuggestions

It is a dumbed-down Android port of my [iOS library of same purpose](https://github.com/illabo/IIDadata). Made it to have the ability of convenient reuse of this code.
It is primarily intended to be used as a geocoder (forward and reverse) for addresses within Russia.

### Usage

There are three methods available `suggest`, `geocode`, `reverseGeocode`.
```Kotlin
val dadataClient = DadataSuggestions("YOUR DADATA API TOKEN HERE") 

dadataClient.suggest(
    AddressSuggestionRequest("Новая москва", 3, "ru")
) { Log.d(
    "DADATA ADDR RES",
    it.suggestions.first().unrestricted_value
) } 

dadataClient.reverseGeocode(
    ReverseGeocodeRequest(43.115141, 131.885341, 1)
) { Log.d(
    "DADATA REVGEO RES",
    it.suggestions.first().unrestricted_value
) }
```
You may also want to add `-keepclassmembers class app.illabo.dadatasuggestions.** {*;}` to your project's proguard-rules.pro. Sometimes a crash may be occurred if minification is enabled for this library. It happens when the `completion` passed on calls to `DadataSuggestions` class' methods [raises a NullPointerException in coroutine](https://github.com/Kotlin/kotlinx.coroutines/issues/910).