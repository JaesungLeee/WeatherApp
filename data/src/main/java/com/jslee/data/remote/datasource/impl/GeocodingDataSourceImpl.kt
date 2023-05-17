package com.jslee.data.remote.datasource.impl

import com.jslee.data.remote.datasource.GeocodingDataSource
import com.jslee.data.remote.dto.GeocodingResponse
import com.jslee.data.remote.service.GeocodingService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/16
 */
internal class GeocodingDataSourceImpl @Inject constructor(
    private val geocodingService: GeocodingService,
) : GeocodingDataSource {
    override fun getLocationName(query: String): Flow<List<GeocodingResponse>> = flow {
        runCatching {
            geocodingService.getLocationName(query = "$query, KR")
        }.getOrDefault(emptyList())
    }
}
