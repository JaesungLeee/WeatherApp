package com.jslee.data.remote.dto.common

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/17
 */
@Serializable
data class Sys(
    @SerialName("type")
    val type: Int? = 0,
    @SerialName("id")
    val id: Int? = 0,
    @SerialName("message")
    val message: String? = "",
    @SerialName("country")
    val country: String? = "",
    @SerialName("sunrise")
    val sunrise: Int? = 0,
    @SerialName("sunset")
    val sunset: Int? = 0,
    @SerialName("pod")
    val dayNight: String? = "", // d: Day | n: Night
)
