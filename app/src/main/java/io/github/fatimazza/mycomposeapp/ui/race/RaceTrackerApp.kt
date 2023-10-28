package io.github.fatimazza.mycomposeapp.ui.race

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import io.github.fatimazza.mycomposeapp.R
import io.github.fatimazza.mycomposeapp.ui.theme.MyComposeAppTheme

@Composable
fun RaceTrackerApp() {
    RaceTrackerScreen()
}

@Composable
private fun RaceTrackerScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(dimensionResource(R.dimen.padding_medium)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.race_run),
            style = MaterialTheme.typography.headlineLarge,
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Icon(
                painter = painterResource(R.drawable.race_walk),
                contentDescription = null,
                modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_medium)),
            )
        }
    }
}

@Preview
@Composable
fun RaceTrackerAppPreview() {
    MyComposeAppTheme {
        RaceTrackerApp()
    }
}
