package com.jslee.data.remote.dto.common

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/17
 */
@Serializable
internal data class Rain(
    @SerialName("3h")
    val rainVolume: Double = 0.0,  // 이전 3시간 강수량
)