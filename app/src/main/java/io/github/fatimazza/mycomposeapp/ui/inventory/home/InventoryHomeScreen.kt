package io.github.fatimazza.mycomposeapp.ui.inventory.home

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.github.fatimazza.mycomposeapp.R
import io.github.fatimazza.mycomposeapp.ui.inventory.InventoryTopAppBar
import io.github.fatimazza.mycomposeapp.ui.inventory.navigation.InventoryNavDestination
import io.github.fatimazza.mycomposeapp.ui.theme.MyComposeAppTheme


object HomeDestination : InventoryNavDestination {
    override val route = "home"
    override val titleRes = R.string.title_inventory_app
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InventoryHomeScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            InventoryTopAppBar()
        }) {
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    MyComposeAppTheme {
        InventoryHomeScreen()
    }
}
