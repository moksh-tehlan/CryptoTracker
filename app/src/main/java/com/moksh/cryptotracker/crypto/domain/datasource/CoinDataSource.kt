package com.moksh.cryptotracker.crypto.domain.datasource

import com.moksh.cryptotracker.core.domain.util.NetworkError
import com.moksh.cryptotracker.core.domain.util.Result
import com.moksh.cryptotracker.crypto.domain.model.Coin
import com.moksh.cryptotracker.crypto.domain.model.CoinPrice
import java.time.ZonedDateTime

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>,NetworkError>
    suspend fun getCoinHistory(
        coinId:String,
        start:ZonedDateTime,
        end:ZonedDateTime
    ):Result<List<CoinPrice>,NetworkError>
}