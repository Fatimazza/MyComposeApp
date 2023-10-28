package io.github.fatimazza.mycomposeapp.ui.mars

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import io.github.fatimazza.mycomposeapp.R
import io.github.fatimazza.mycomposeapp.ui.theme.MyComposeAppTheme

@Composable
fun MarsHomeScreen(
    modifier: Modifier = Modifier
) {
    ResultScreen(stringResource(R.string.mars_placeholder_result))
}

/**
 * ResultScreen displaying number of photos retrieved.
 */
@Composable
fun ResultScreen(
    photos: String,
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
    ) {
        Text(text = photos)
    }
}

@Preview(showBackground = true)
@Composable
fun MarsHomeScreenPreview() {
    MyComposeAppTheme {
        ResultScreen(stringResource(R.string.mars_placeholder_result))
    }
}
