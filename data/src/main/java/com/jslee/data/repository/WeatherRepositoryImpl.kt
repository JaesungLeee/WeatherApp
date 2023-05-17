package com.jslee.data.repository

import com.jslee.data.remote.datasource.WeatherDataSource
import com.jslee.domain.repository.WeatherRepository
import javax.inject.Inject

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/16
 */
internal class WeatherRepositoryImpl @Inject constructor(
    private val weatherDataSource: WeatherDataSource,
) : WeatherRepository
