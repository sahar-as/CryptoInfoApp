package ir.saharapps.cryptoinfoapp.presentaion.coin_detail

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import ir.saharapps.cryptoinfoapp.common.Constants
import ir.saharapps.cryptoinfoapp.common.Resource
import ir.saharapps.cryptoinfoapp.domain.use_case.GetCoinDetailsUseCase
import ir.saharapps.cryptoinfoapp.presentaion.CoinDetailState
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class CoinDetailViewModel @Inject constructor(
    private val coinDetailsUseCase: GetCoinDetailsUseCase,
    savedStateHandle: SavedStateHandle
): ViewModel() {

    private val _state = mutableStateOf(CoinDetailState())
    var state: State<CoinDetailState> = _state

    init {
        savedStateHandle.get<String>(Constants.COIN_ID)?.let { coinId ->
            getCoinDetail(coinId)
        }
    }

    private fun getCoinDetail(coinId: String){
        coinDetailsUseCase(coinId).onEach { result ->
            when(result){
                is Resource.Success ->{
                    _state.value = CoinDetailState(coin = result.data)
                }
                is Resource.Loading ->{
                    _state.value = CoinDetailState(isLoading = true)
                }
                is Resource.Error ->{
                    _state.value = CoinDetailState(error = result.message ?: "An unexpected error occurred")
                }
            }
        }.launchIn(viewModelScope)
    }
}