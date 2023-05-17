package com.jslee.data.remote.dto

import com.jslee.data.remote.dto.common.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/17
 */
@Serializable
internal data class ForecastResponse(
    @SerialName("cod")
    val code: String = "",
    @SerialName("message")
    val message: Int = 0,
    @SerialName("cnt")
    val count: Int? = 0,
    @SerialName("list")
    val list: List<Forecast> = listOf(),
    @SerialName("city")
    val city: City = City(),
) {
    @Serializable
    data class Forecast(
        @SerialName("dt")
        val forecastTime: Int = 0,
        @SerialName("main")
        val main: Main = Main(),
        @SerialName("weather")
        val weather: List<Weather> = listOf(),
        @SerialName("clouds")
        val clouds: Cloud = Cloud(),
        @SerialName("wind")
        val wind: Wind = Wind(),
        @SerialName("visibility")
        val visibility: Int = 0,  // 평균 가시거리: max 10km
        @SerialName("pop")
        val precipitationRate: Int = 0,  // 강수 확률
        @SerialName("rain")
        val rain: Rain = Rain(),
        @SerialName("snow")
        val snow: Snow = Snow(),
        @SerialName("sys")
        val sys: Sys = Sys(),
        @SerialName("dt_txt")
        val dateTimeText: String = ""
    )

    @Serializable
    data class City(
        @SerialName("id")
        val id: Int = 0,
        @SerialName("name")
        val name: String = "",
        @SerialName("coord")
        val coordinate: Coordinate = Coordinate(),
        @SerialName("country")
        val country: String = "",
        @SerialName("population")
        val population: Int = 0,
        @SerialName("timezone")
        val timeZone: Int = 0,
        @SerialName("sunrise")
        val sunrise: Int = 0,
        @SerialName("sunset")
        val sunset: Int = 0,
    )
}
