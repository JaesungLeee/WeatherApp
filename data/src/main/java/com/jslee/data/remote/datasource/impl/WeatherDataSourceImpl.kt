package com.jslee.data.remote.datasource.impl

import com.jslee.data.remote.datasource.WeatherDataSource
import com.jslee.data.remote.dto.CurrentWeatherResponse
import com.jslee.data.remote.dto.ForecastResponse
import com.jslee.data.remote.service.WeatherService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/16
 */
internal class WeatherDataSourceImpl @Inject constructor(
    private val weatherService: WeatherService,
) : WeatherDataSource {

    override fun getCurrentWeather(
        latitude: Double,
        longitude: Double
    ): Flow<CurrentWeatherResponse> = flow {
        runCatching {
            weatherService.getCurrentWeather(latitude = latitude, longitude = longitude)
        }.getOrNull()
    }

    override fun getWeatherForecast(
        latitude: Double,
        longitude: Double
    ): Flow<ForecastResponse> = flow {
        runCatching {
            weatherService.getForecast(latitude = latitude, longitude = longitude)
        }.getOrNull()
    }
}