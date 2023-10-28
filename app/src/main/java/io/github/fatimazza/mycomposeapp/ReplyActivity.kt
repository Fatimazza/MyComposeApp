package io.github.fatimazza.mycomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.github.fatimazza.mycomposeapp.ui.reply.ReplyApp
import io.github.fatimazza.mycomposeapp.ui.theme.MyComposeAppTheme

class ReplyActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeAppTheme {
                Surface {
                    val windowSize = calculateWindowSizeClass(this)
                    ReplyApp(
                        windowSize = windowSize.widthSizeClass
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ReplyAppCompatPreview() {
    MyComposeAppTheme {
        Surface {
            ReplyApp(
                windowSize = WindowWidthSizeClass.Medium,
            )
        }
    }
}
