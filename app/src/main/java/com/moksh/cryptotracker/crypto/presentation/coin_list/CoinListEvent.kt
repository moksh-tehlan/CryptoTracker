package com.moksh.cryptotracker.crypto.presentation.coin_list

import com.moksh.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val message: NetworkError) : CoinListEvent
}