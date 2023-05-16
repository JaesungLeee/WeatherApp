package com.jslee.data.remote.dto

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
    val visibility: Int = 0,
    @SerialName("wind")
    val wind: Wind = Wind(),
    @SerialName("clouds")
    val clouds: Cloud = Cloud(),
    @SerialName("dt")
    val dt: Int = 0,
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
    @Serializable
    data class Coordinate(
        @SerialName("lon")
        val longitude: Double = 0.0,
        @SerialName("lat")
        val latitude: Double = 0.0,
    )

    @Serializable
    data class Weather(
        @SerialName("id")
        val id: Int = 0,
        @SerialName("main")
        val main: String = "",
        @SerialName("description")
        val description: String = "",
        @SerialName("icon")
        val icon: String = "",
    )

    @Serializable
    data class Main(
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
        @SerialName("humidity")
        val humidity: Int = 0,
    )

    @Serializable
    data class Wind(
        @SerialName("speed")
        val speed: Double = 0.0,
        @SerialName("deg")
        val deg: Int = 0,
    )

    @Serializable
    data class Cloud(
        @SerialName("all")
        val all: Int = 0,
    )

    @Serializable
    data class Sys(
        @SerialName("type")
        val type: Int = 0,
        @SerialName("id")
        val id: Int = 0,
        @SerialName("country")
        val country: String = "",
        @SerialName("sunrise")
        val sunrise: Int = 0,
        @SerialName("sunset")
        val sunset: Int = 0,
    )
}
