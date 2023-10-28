package io.github.fatimazza.mycomposeapp.ui.mars

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MarsPhotosApp() {
    Scaffold(
        modifier = Modifier,
        topBar = { MarsTopAppBar() }
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {

        }
    }
}

@Composable
fun MarsTopAppBar() {

}

@Preview(showBackground = true)
@Composable
fun ResultScreenPreview() {
    fun MarsPhotosApp() {
    }
}
