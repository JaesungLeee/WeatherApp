package com.jslee.data.remote.dto.common

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/17
 */
@Serializable
internal data class Wind(
    @SerialName("speed")
    val windSpeed: Double = 0.0,
    @SerialName("deg")
    val windDegree: Int = 0,  // 바람 방향(각도)
    @SerialName("gust")
    val gustSpeed: Double? = 0.0,  // 돌풍 속도
)
