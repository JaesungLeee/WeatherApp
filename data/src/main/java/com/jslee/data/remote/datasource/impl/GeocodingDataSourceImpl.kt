package com.jslee.data.remote.datasource.impl

import com.jslee.data.remote.datasource.GeocodingDataSource
import com.jslee.data.remote.dto.GeocodingResponse
import com.jslee.data.remote.service.WeatherService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/16
 */
internal class GeocodingDataSourceImpl @Inject constructor(
    private val weatherService: WeatherService
) : GeocodingDataSource {
    override fun getLocationName(
        query: String
    ): Flow<List<GeocodingResponse>> = flow {
        runCatching {
            weatherService.getLocationName(query = "$query, KR")
        }.getOrDefault(emptyList())
    }
}