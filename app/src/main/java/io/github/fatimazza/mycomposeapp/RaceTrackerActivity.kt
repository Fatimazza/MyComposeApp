package io.github.fatimazza.mycomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import io.github.fatimazza.mycomposeapp.ui.race.RaceTrackerApp
import io.github.fatimazza.mycomposeapp.ui.theme.MyComposeAppTheme

class RaceTrackerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeAppTheme {
                RaceTrackerApp()
            }
        }
    }
}

