package ir.saharapps.cryptoinfoapp.domain.model

import ir.saharapps.cryptoinfoapp.data.remote.dto.TeamMember

data class CoinDetail(
    val coinId: String = "",
    val name: String,
    val description: String = "",
    val symbol: String = "",
    val rank: Int,
    val isActive: Boolean = false,
    val tags: List<String> = emptyList(),
    val team: List<TeamMember> = emptyList()
)
