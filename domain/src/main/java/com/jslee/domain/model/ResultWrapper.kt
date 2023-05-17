package com.jslee.domain.model

/**
 * WeatherApp
 * @author jaesung
 * @created 2023/05/17
 */
sealed class ResultWrapper<out S, out E> {
    data class Success<out S>(val data: S) : ResultWrapper<S, Nothing>()
    data class Failure<out E>(val error: E) : ResultWrapper<Nothing, E>()
    object Initial : ResultWrapper<Nothing, Nothing>()
}
