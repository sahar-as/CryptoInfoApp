package ir.saharapps.cryptoinfoapp.presentaion

import ir.saharapps.cryptoinfoapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
