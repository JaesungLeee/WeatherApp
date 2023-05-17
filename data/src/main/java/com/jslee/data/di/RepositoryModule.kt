package com.jslee.data.di

import com.jslee.data.repository.GeocodingRepositoryImpl
import com.jslee.data.repository.WeatherRepositoryImpl
import com.jslee.domain.repository.GeocodingRepository
import com.jslee.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/16
 */
@Module
@InstallIn(ViewModelComponent::class)
internal abstract class RepositoryModule {
    @Binds
    @ViewModelScoped
    abstract fun bindWeatherRepository(weatherRepositoryImpl: WeatherRepositoryImpl): WeatherRepository

    @Binds
    @ViewModelScoped
    abstract fun bindGeocodingRepository(geocodingRepositoryImpl: GeocodingRepositoryImpl): GeocodingRepository

}