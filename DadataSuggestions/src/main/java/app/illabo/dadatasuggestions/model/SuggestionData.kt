package app.illabo.dadatasuggestions.model

import com.google.gson.annotations.SerializedName

/*
Copyright (c) 2020 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */


data class SuggestionData(
		// Metro is removed, as I don't need it.
		@SerializedName("area") val area: String?,
		@SerializedName("area_fias_id") val area_fias_id: String?,
		@SerializedName("area_kladr_id") val area_kladr_id: String?,
		@SerializedName("area_type") val area_type: String?,
		@SerializedName("area_type_full") val area_type_full: String?,
		@SerializedName("area_with_type") val area_with_type: String?,
		@SerializedName("beltway_distance") val beltway_distance: String?,
		@SerializedName("beltway_hit") val beltway_hit: String?,
		@SerializedName("block") val block: String?,
		@SerializedName("block_type") val block_type: String?,
		@SerializedName("block_type_full") val block_type_full: String?,
		@SerializedName("capital_marker") val capital_marker: String?,
		@SerializedName("city") val city: String?,
		@SerializedName("city_area") val city_area: String?,
		@SerializedName("city_district") val city_district: String?,
		@SerializedName("city_district_fias_id") val city_district_fias_id: String?,
		@SerializedName("city_district_kladr_id") val city_district_kladr_id: String?,
		@SerializedName("city_district_type") val city_district_type: String?,
		@SerializedName("city_district_type_full") val city_district_type_full: String?,
		@SerializedName("city_district_with_type") val city_district_with_type: String?,
		@SerializedName("city_fias_id") val city_fias_id: String?,
		@SerializedName("city_kladr_id") val city_kladr_id: String?,
		@SerializedName("city_type") val city_type: String?,
		@SerializedName("city_type_full") val city_type_full: String?,
		@SerializedName("city_with_type") val city_with_type: String?,
		@SerializedName("country") val country: String?,
		@SerializedName("country_iso_code") val country_iso_code: String?,
		@SerializedName("federal_district") val federal_district: String?,
		@SerializedName("fias_actuality_state") val fias_actuality_state: String?,
		@SerializedName("fias_code") val fias_code: String?,
		@SerializedName("fias_id") val fias_id: String?,
		@SerializedName("fias_level") val fias_level: String?,
		@SerializedName("flat") val flat: String?,
		@SerializedName("flat_fias_id") val flat_fias_id: String?,
		@SerializedName("flat_area") val flat_area: String?,
		@SerializedName("flat_price") val flat_price: String?,
		@SerializedName("flat_type") val flat_type: String?,
		@SerializedName("flat_type_full") val flat_type_full: String?,
		@SerializedName("geo_lat") val geo_lat: Double?,
		@SerializedName("geo_lon") val geo_lon: Double?,
		@SerializedName("geoname_id") val geoname_id: String?,
		@SerializedName("history_values") val history_values: Array<String>?,
		@SerializedName("house") val house: String?,
		@SerializedName("house_fias_id") val house_fias_id: String?,
		@SerializedName("house_kladr_id") val house_kladr_id: String?,
		@SerializedName("house_type") val house_type: String?,
		@SerializedName("house_type_full") val house_type_full: String?,
		@SerializedName("kladr_id") val kladr_id: String?,
		@SerializedName("okato") val okato: String?,
		@SerializedName("oktmo") val oktmo: String?,
		@SerializedName("postal_box") val postal_box: String?,
		@SerializedName("postal_code") val postal_code: String?,
		@SerializedName("qc") val qc: String?,
		@SerializedName("qc_complete") val qc_complete: String?,
		@SerializedName("qc_geo") val qc_geo: String?,
		@SerializedName("qc_house") val qc_house: String?,
		@SerializedName("region") val region: String?,
		@SerializedName("region_fias_id") val region_fias_id: String?,
		@SerializedName("region_iso_code") val region_iso_code: String?,
		@SerializedName("region_kladr_id") val region_kladr_id: String?,
		@SerializedName("region_type") val region_type: String?,
		@SerializedName("region_type_full") val region_type_full: String?,
		@SerializedName("region_with_type") val region_with_type: String?,
		@SerializedName("settlement") val settlement: String?,
		@SerializedName("settlement_fias_id") val settlement_fias_id: String?,
		@SerializedName("settlement_kladr_id") val settlement_kladr_id: String?,
		@SerializedName("settlement_type") val settlement_type: String?,
		@SerializedName("settlement_type_full") val settlement_type_full: String?,
		@SerializedName("settlement_with_type") val settlement_with_type: String?,
		@SerializedName("source") val source: String?,
		@SerializedName("square_meter_price") val square_meter_price: String?,
		@SerializedName("street") val street: String?,
		@SerializedName("street_fias_id") val street_fias_id: String?,
		@SerializedName("street_kladr_id") val street_kladr_id: String?,
		@SerializedName("street_type") val street_type: String?,
		@SerializedName("street_type_full") val street_type_full: String?,
		@SerializedName("street_with_type") val street_with_type: String?,
		@SerializedName("tax_office") val tax_office: String?,
		@SerializedName("tax_office_legal") val tax_office_legal: String?,
		@SerializedName("timezone") val timezone: String?,
		@SerializedName("unparsed_parts") val unparsed_parts: String?
)