package ir.saharapps.cryptoinfoapp.data.repository

import ir.saharapps.cryptoinfoapp.data.remote.PaprikaSiteApi
import ir.saharapps.cryptoinfoapp.data.remote.dto.CoinDetailDto
import ir.saharapps.cryptoinfoapp.data.remote.dto.CoinDto
import ir.saharapps.cryptoinfoapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImp @Inject constructor(
    private val api: PaprikaSiteApi
): CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}