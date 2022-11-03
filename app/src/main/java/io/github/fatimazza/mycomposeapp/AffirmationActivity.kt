package io.github.fatimazza.mycomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.github.fatimazza.mycomposeapp.ui.theme.MyComposeAppTheme

class AffirmationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AffirmationApp()
        }
    }
}

@Composable
fun AffirmationApp() {
    MyComposeAppTheme {
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    MyComposeAppTheme {
    }
}
