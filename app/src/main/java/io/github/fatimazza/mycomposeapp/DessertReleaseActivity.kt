package io.github.fatimazza.mycomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import io.github.fatimazza.mycomposeapp.ui.drelease.DessertReleaseApp
import io.github.fatimazza.mycomposeapp.ui.theme.MyComposeAppTheme

class DessertReleaseActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeAppTheme {
                DessertReleaseApp()
            }
        }
    }
}
