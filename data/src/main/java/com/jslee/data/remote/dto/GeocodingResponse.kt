package com.jslee.data.remote.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/16
 */
// List<GeocodingResponse> or emptyList()
@Serializable
internal data class GeocodingResponse(
    @SerialName("name")
    val name: String = "",
    @SerialName("local_names")
    val localNames: LocalNamesResponse,
    @SerialName("lat")
    val latitude: Double = 0.0,
    @SerialName("lon")
    val longitude: Double = 0.0,
    @SerialName("country")
    val country: String = "",
) {
    @Serializable
    data class LocalNamesResponse(
        @SerialName("ko")
        val nameKr: String = "",
        @SerialName("en")
        val nameEn: String = "",
    )
}
