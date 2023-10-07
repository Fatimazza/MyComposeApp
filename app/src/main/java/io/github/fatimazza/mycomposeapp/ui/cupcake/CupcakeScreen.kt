package io.github.fatimazza.mycomposeapp.ui.cupcake

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import io.github.fatimazza.mycomposeapp.R
import io.github.fatimazza.mycomposeapp.ui.theme.MyComposeAppTheme

@Composable
fun CupcakeApp() {
    Scaffold(
        topBar = {
            Text(text = stringResource(id = R.string.title_cupcake))
        }
    ) {
        Column (modifier = Modifier.padding(it)) {
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GameScreenPreview() {
    MyComposeAppTheme {
        CupcakeApp()
    }
}
