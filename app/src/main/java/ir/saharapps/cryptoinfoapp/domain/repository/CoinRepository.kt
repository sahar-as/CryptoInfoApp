package ir.saharapps.cryptoinfoapp.domain.repository

import ir.saharapps.cryptoinfoapp.data.remote.dto.CoinDetailDto
import ir.saharapps.cryptoinfoapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}