package com.jslee.data.remote.dto.common

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/17
 */
@Serializable
internal data class Main(
    @SerialName("temp")
    val temperature: Double = 0.0,
    @SerialName("feels_like")
    val feelsLike: Double = 0.0,
    @SerialName("temp_min")
    val temperatureMin: Double = 0.0,
    @SerialName("temp_max")
    val temperatureMax: Double = 0.0,
    @SerialName("pressure")
    val pressure: Int = 0,
    @SerialName("sea_level")
    val seaLevel: Int = 0,
    @SerialName("grnd_level")
    val groundLevel: Int = 0,
    @SerialName("humidity")
    val humidity: Int = 0,
    @SerialName("temp_kf")
    val temperatureKf: Int? = 0,
)
