package io.github.fatimazza.mycomposeapp.ui.drelease

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import io.github.fatimazza.mycomposeapp.R
import io.github.fatimazza.mycomposeapp.ui.theme.MyComposeAppTheme

/*
 * Screen level composable
 */
@Composable
fun DessertReleaseApp() {
    DessertReleaseScreen()
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
private fun DessertReleaseScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.release_top_bar_name)) },
                actions = {
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_release_linear_layout),
                            contentDescription = "",
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    }
                },
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.inversePrimary
                )
            )
        }
    ) {

    }
}

@Preview
@Composable
fun DessertReleaseAppPreview() {
    MyComposeAppTheme {
        DessertReleaseScreen()
    }
}
