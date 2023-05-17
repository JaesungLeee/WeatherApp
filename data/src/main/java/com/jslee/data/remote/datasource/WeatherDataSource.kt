package com.jslee.data.remote.datasource

import com.jslee.data.remote.dto.CurrentWeatherResponse
import com.jslee.data.remote.dto.ForecastResponse
import kotlinx.coroutines.flow.Flow

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/16
 */
internal interface WeatherDataSource {

    fun getCurrentWeather(latitude: Double, longitude: Double): Flow<CurrentWeatherResponse>

    fun getWeatherForecast(latitude: Double, longitude: Double): Flow<ForecastResponse>
}
