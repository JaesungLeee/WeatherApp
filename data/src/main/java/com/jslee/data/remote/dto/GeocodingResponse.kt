package com.jslee.data.remote.dto

import com.jslee.domain.model.LocationCoordinate
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
    @SerialName("state")
    val state: String? = "",
) {
    @Serializable
    data class LocalNamesResponse(
        @SerialName("ko")
        val nameKr: String = "",
        @SerialName("en")
        val nameEn: String = "",
    )

    fun toDomain(): LocationCoordinate = LocationCoordinate(
        locationName = name,
        latitude = latitude,
        longitude = longitude,
    )
}
