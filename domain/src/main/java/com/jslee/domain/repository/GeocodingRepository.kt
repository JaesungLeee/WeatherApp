package com.jslee.domain.repository

import com.jslee.domain.model.LocationCoordinate
import kotlinx.coroutines.flow.Flow

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/17
 */
interface GeocodingRepository {

    fun getLocationName(query: String): Flow<List<LocationCoordinate>>
}
