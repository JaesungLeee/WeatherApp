package com.jslee.data.di

import com.jslee.data.remote.datasource.GeocodingDataSource
import com.jslee.data.remote.datasource.WeatherDataSource
import com.jslee.data.remote.datasource.impl.GeocodingDataSourceImpl
import com.jslee.data.remote.datasource.impl.WeatherDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/16
 */
@Module
@InstallIn(SingletonComponent::class)
internal abstract class DatasourceModule {

    @Binds
    @Singleton
    abstract fun bindGeocodingDataSource(geocodingDataSourceImpl: GeocodingDataSourceImpl): GeocodingDataSource

    @Binds
    @Singleton
    abstract fun bindWeatherDataSource(weatherDataSourceImpl: WeatherDataSourceImpl): WeatherDataSource
}
