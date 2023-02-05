package ir.saharapps.cryptoinfoapp.presentaion.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ir.saharapps.cryptoinfoapp.presentaion.coin_detail.CoinDetailScreen
import ir.saharapps.cryptoinfoapp.presentaion.coin_list.CoinListScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.CoinListScreen.route){
        composable(route = Screen.CoinListScreen.route){
            CoinListScreen(navController)
        }
        composable(route = Screen.CoinDetailScreen.route + "/{coinId}"){
            CoinDetailScreen()
        }
    }
}