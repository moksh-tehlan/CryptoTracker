package com.moksh.cryptotracker.crypto.presentation.coin_list

import com.moksh.cryptotracker.crypto.presentation.model.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi) : CoinListAction
    data object OnRefresh : CoinListAction
}