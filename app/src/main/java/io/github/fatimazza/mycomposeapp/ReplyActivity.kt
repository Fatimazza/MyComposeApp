package io.github.fatimazza.mycomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.github.fatimazza.mycomposeapp.ui.reply.ReplyApp
import io.github.fatimazza.mycomposeapp.ui.theme.MyComposeAppTheme

class ReplyActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeAppTheme {
                Surface {
                    ReplyApp()
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
            ReplyApp()
        }
    }
}
