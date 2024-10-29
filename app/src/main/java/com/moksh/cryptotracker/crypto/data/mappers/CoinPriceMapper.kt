package com.moksh.cryptotracker.crypto.data.mappers

import com.moksh.cryptotracker.crypto.data.networking.dto.CoinPriceDto
import com.moksh.cryptotracker.crypto.domain.model.CoinPrice
import java.time.Instant
import java.time.ZoneId

fun CoinPriceDto.toCoinPrice() = CoinPrice(
    priceUsd = priceUsd,
    dateTime = Instant.ofEpochMilli(time)
        .atZone(ZoneId.systemDefault())
)