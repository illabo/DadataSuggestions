package app.illabo.dadatadroidexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import app.illabo.dadatasuggestions.DadataSuggestions
import app.illabo.dadatasuggestions.model.AddressSuggestionRequest
import app.illabo.dadatasuggestions.model.ReverseGeocodeRequest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dadataClient = DadataSuggestions("")
        dadataClient.suggest(AddressSuggestionRequest(
            "Новая москва",
            3,
            "ru"
        )
        ) {
            Log.d("DADATA ADDR RES", it.suggestions.first().unrestricted_value)
        }

        dadataClient.reverseGeocode(ReverseGeocodeRequest(43.115141,131.885341,1)
        ) {
            Log.d("DADATA REVGEO RES", it.suggestions.first().unrestricted_value)
        }
    }
}