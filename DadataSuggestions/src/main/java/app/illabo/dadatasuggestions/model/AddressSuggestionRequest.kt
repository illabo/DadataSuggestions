package app.illabo.dadatasuggestions.model

import app.illabo.dadatasuggestions.networking.ApiService
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import retrofit2.Call

class AddressSuggestionRequest(query: String,
                               count: Int = 10,
                               language: String? = null): DadataRequest<DadataAddressResponse> {
    @SerializedName("query")
    @Expose
    private var query: String = query

    @SerializedName("count")
    @Expose
    private var count: Int = count

    @SerializedName("language")
    @Expose
    private var language: String? = language

    fun setQuery(query: String): AddressSuggestionRequest {
        this.query = query
        return this
    }

    fun setCount(count: Int): AddressSuggestionRequest {
        this.count = count
        return this
    }

    fun setLanguage(language: String?): AddressSuggestionRequest {
        if (language != null && listOf("en","ru").contains(language)) {
            this.language = language
        }
        return this
    }

    fun getQuery() = query
    fun getCount() = count
    fun getLanguage() = language

    override fun buildCall(forClient: ApiService): Call<DadataAddressResponse>
            = forClient.getSuggestions(this)
}