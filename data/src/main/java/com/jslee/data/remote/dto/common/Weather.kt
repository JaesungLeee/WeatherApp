package com.jslee.data.remote.dto.common

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/17
 */
@Serializable
internal data class Weather(
    @SerialName("id")
    val id: Int = 0,
    @SerialName("main")
    val weatherStatus: String = "",  // Rain | Snow | Extreme | ...
    @SerialName("description")
    val description: String = "",
    @SerialName("icon")
    val icon: String = "",
)