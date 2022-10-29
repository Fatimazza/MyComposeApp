package io.github.fatimazza.mycomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import io.github.fatimazza.mycomposeapp.ui.theme.MyComposeAppTheme

class BirthdayCardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingWithText(message = "Happy birthday, Za!", " - from Fatima")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(message: String, from: String){
    Column {
        Text(
            text = message,
            fontSize = 36.sp
        )
        Text(
            text = from,
            fontSize = 24.sp
        )
    }
}

@Composable
fun BirthdayGreetingWithImage(message: String, from: String){
    val image = painterResource(id = R.drawable.androidparty)
    Image(painter = image, contentDescription = null)
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    MyComposeAppTheme {
        BirthdayGreetingWithText(message = "Happy birthday, Za!", " - from Fatima")
        BirthdayGreetingWithImage(message = "Happy birthday, Za!", " - from Fatima")
    }
}
