package app.illabo.dadatasuggestions.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class BoundConstraint(
    @SerializedName("value")
    @Expose
    val level: BoundLevel
)