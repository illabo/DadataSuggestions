package app.illabo.dadatasuggestions.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class BoundConstraint(
    @SerializedName("value")
    @Expose
    val level: BoundLevel
)