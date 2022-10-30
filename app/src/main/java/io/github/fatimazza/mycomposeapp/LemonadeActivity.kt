package io.github.fatimazza.mycomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.fatimazza.mycomposeapp.ui.theme.MyComposeAppTheme

class LemonadeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeAppTheme {
                LemonadeApp()
            }
        }
    }
}

@Composable
fun LemonadeApp() {
    // A surface container using the 'background' color from the theme
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(stringResource(R.string.lemon_tree))
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                painter = painterResource(R.drawable.lemon_tree),
                contentDescription = stringResource(
                    R.string.lemon_content_description),
                modifier = Modifier
                    .wrapContentSize()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LemonadePreview() {
    MyComposeAppTheme {
        LemonadeApp()
    }
}
