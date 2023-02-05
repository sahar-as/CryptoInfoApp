package ir.saharapps.cryptoinfoapp.presentaion.coin_list

import ir.saharapps.cryptoinfoapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
