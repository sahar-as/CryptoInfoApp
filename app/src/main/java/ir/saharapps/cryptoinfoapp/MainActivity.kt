package ir.saharapps.cryptoinfoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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

@Composable
fun TestPage() {
    Box(modifier = Modifier.fillMaxSize()){
        Text(text = "Hello")
    }
}

