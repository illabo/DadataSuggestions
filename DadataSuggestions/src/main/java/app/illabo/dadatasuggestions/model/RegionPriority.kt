package app.illabo.dadatasuggestions.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RegionPriority(
        @SerializedName("kladr_id")
        @Expose
        val kladrId: String
)