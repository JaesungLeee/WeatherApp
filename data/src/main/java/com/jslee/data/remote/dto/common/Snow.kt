package com.jslee.data.remote.dto.common

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/17
 */
@Serializable
internal data class Snow(
    @SerialName("3h")
    val snowVolume: Double = 0.0,  // 이전 3시간 강설량
)
