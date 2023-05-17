package com.jslee.data.remote.dto

import com.jslee.data.remote.dto.common.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/16
 */
@Serializable
internal data class CurrentWeatherResponse(
    @SerialName("coord")
    val coordinate: Coordinate = Coordinate(),
    @SerialName("weather")
    val weather: List<Weather> = listOf(),
    @SerialName("base")
    val base: String = "",
    @SerialName("main")
    val main: Main = Main(),
    @SerialName("visibility")
    val visibility: Int = 0,  // 가시거리 : max 10km
    @SerialName("wind")
    val wind: Wind = Wind(),
    @SerialName("clouds")
    val clouds: Cloud = Cloud(),
    @SerialName("rain")
    val rain: Rain = Rain(),
    @SerialName("snow")
    val snow: Snow = Snow(),
    @SerialName("dt")
    val forecastTime: Int = 0,
    @SerialName("sys")
    val sys: Sys = Sys(),
    @SerialName("timezone")
    val timezone: Int = 0,
    @SerialName("id")
    val id: Int = 0,
    @SerialName("name")
    val name: String = "",
    @SerialName("cod")
    val code: Int,
) {

}
