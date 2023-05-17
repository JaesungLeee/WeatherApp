package com.jslee.data.remote.service

import com.jslee.data.BuildConfig
import com.jslee.data.remote.dto.CurrentWeatherResponse
import com.jslee.data.remote.dto.ForecastResponse
import com.jslee.data.remote.dto.GeocodingResponse
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/16
 */
internal interface WeatherService {
    @GET("data/2.5/weather")
    fun getCurrentWeather(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double,
        @Query("appid") apiKey: String = BuildConfig.API_KEY,
        @Query("lang") language: String = "kr",
        @Query("units") units: String = "metric",
    ): CurrentWeatherResponse

    @GET("data/2.5/forecast")
    fun getForecast(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double,
        @Query("appid") apiKey: String = BuildConfig.API_KEY,
        @Query("lang") language: String = "kr",
        @Query("units") units: String = "metric",
    ): ForecastResponse
}