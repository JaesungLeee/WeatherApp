package com.jslee.domain.usecase

import com.jslee.domain.model.LocationCoordinate
import com.jslee.domain.repository.GeocodingRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/17
 */
class GetCoordinateUseCase @Inject constructor(
    private val geocodingRepository: GeocodingRepository,
) {
    operator fun invoke(query: String): Flow<List<LocationCoordinate>> =
        geocodingRepository.getLocationName(query = query)
}
