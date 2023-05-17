package com.jslee.data.remote.datasource

import com.jslee.data.remote.dto.GeocodingResponse
import kotlinx.coroutines.flow.Flow

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/16
 */
internal interface GeocodingDataSource {

    fun getLocationName(query: String): Flow<List<GeocodingResponse>>
}
