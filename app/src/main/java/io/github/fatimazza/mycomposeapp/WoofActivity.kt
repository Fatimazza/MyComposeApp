package io.github.fatimazza.mycomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.github.fatimazza.mycomposeapp.ui.theme.MyComposeAppTheme

class WoofActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeAppTheme {
                WoofApp()
            }
        }
    }
}

@Composable
fun WoofApp() {

}

@Preview(showBackground = true)
@Composable
fun WoofPreview() {
    MyComposeAppTheme {
        WoofApp()
    }
}
