package com.jslee.data.repository

import com.jslee.data.remote.datasource.GeocodingDataSource
import com.jslee.domain.model.LocationCoordinate
import com.jslee.domain.repository.GeocodingRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/17
 */
internal class GeocodingRepositoryImpl @Inject constructor(
    private val geocodingDataSource: GeocodingDataSource,
) : GeocodingRepository {

    override fun getLocationName(query: String): Flow<List<LocationCoordinate>> = flow {
        geocodingDataSource.getLocationName(query = query).collect { geocodingList ->
            emit(geocodingList.map { it.toDomain() })
        }
    }
}
