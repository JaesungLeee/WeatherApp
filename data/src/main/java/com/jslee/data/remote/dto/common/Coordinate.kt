package com.jslee.data.remote.dto.common

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/17
 */
@Serializable
internal data class Coordinate(
    @SerialName("lat")
    val latitude: Double = 0.0,
    @SerialName("lon")
    val longitude: Double = 0.0,
)
