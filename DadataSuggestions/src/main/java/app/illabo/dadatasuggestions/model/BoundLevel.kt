package app.illabo.dadatasuggestions.model

enum class BoundLevel(val level: String) {
    COUNTRY("country"),
    REGION("region"),
    AREA("area"),
    CITY("city"),
    SETTLEMENT("settlement"),
    STREET("street"),
    HOUSE("house")
}