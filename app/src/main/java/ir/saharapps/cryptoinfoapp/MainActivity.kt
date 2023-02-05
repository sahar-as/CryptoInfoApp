package ir.saharapps.cryptoinfoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import ir.saharapps.cryptoinfoapp.presentaion.navigation.Navigation
import ir.saharapps.cryptoinfoapp.presentaion.ui.theme.CryptoInfoAppTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptoInfoAppTheme {
                Navigation()
            }
        }
    }
}

