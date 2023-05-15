package com.jslee.weather

import android.app.Application
import com.jslee.weather.util.CustomDebugTree
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import javax.inject.Inject

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/15
 */
@HiltAndroidApp
class WeatherApplication : Application() {

    @Inject
    lateinit var customDebugTree: CustomDebugTree

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(customDebugTree)
        }
    }
}