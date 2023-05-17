package com.jslee.data.remote.service

import com.jslee.data.BuildConfig
import com.jslee.data.remote.dto.GeocodingResponse
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/17
 */
internal interface GeocodingService {

    @GET("geo/1.0/direct")
    fun getLocationName(
        @Query("q") query: String,
        @Query("limit") limit: Int = 10,
        @Query("appid") apiKey: String = BuildConfig.API_KEY,
    ): List<GeocodingResponse>
}
