package com.jslee.weather.util

import timber.log.Timber
import javax.inject.Inject

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/15
 */
class CustomDebugTree @Inject constructor() : Timber.DebugTree() {
    override fun createStackElementTag(element: StackTraceElement): String? {
        return "${element.className}:${element.lineNumber}#${element.methodName}"
    }
}