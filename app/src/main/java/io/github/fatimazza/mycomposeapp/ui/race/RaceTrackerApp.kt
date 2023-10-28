package io.github.fatimazza.mycomposeapp.ui.race

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
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
            StatusIndicator()
            Spacer(modifier = Modifier.size(dimensionResource(R.dimen.padding_large)))
            StatusIndicator()
            Spacer(modifier = Modifier.size(dimensionResource(R.dimen.padding_large)))
            RaceControls(
            )
        }
    }
}

@Composable
private fun StatusIndicator(
    modifier: Modifier = Modifier
) {
    Row {
        Text("participant", Modifier.padding(end = dimensionResource(R.dimen.padding_small)))
        Column(
            modifier = modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
        ) {
            LinearProgressIndicator(
                progress = 0.3f,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(dimensionResource(R.dimen.race_progress_indicator_height))
                    .clip(RoundedCornerShape(dimensionResource(R.dimen.race_progress_indicator_corner_radius)))
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = stringResource(R.string.race_progress_percentage, 0),
                    textAlign = TextAlign.Start,
                    modifier = Modifier.weight(1f)
                )
                Text(
                    text = "100",
                    textAlign = TextAlign.End,
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}

@Composable
private fun RaceControls(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Button(onClick = { }) {
            Text(if (true) stringResource(R.string.race_pause) else stringResource(R.string.race_start))
        }

        Button(onClick = { }) {
            Text(stringResource(R.string.race_reset))
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
