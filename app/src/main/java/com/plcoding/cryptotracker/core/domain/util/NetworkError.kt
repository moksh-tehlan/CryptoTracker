package com.plcoding.cryptotracker.core.domain.util

enum class NetworkError : Error {
    REQUEST_TIMEOUT,
    TOO_MANY_REQUESTS,
    NO_INTERNET_CONNECTION_ERROR,
    SERVER_ERROR,
    UNKNOWN_ERROR,
    SERIALIZATION_ERROR
}