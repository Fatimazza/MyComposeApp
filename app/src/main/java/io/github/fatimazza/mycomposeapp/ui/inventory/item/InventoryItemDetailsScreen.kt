package io.github.fatimazza.mycomposeapp.ui.inventory.item

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.github.fatimazza.mycomposeapp.ui.inventory.InventoryTopAppBar

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun InventoryItemDetailsScreen(
    navigateBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            InventoryTopAppBar(
                title = "Item Destination",
                canNavigateBack = true,
                navigateUp = navigateBack
            )
        }
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun InventoryItemDetailsScreenPreview() {
    InventoryItemDetailsScreen(
        navigateBack = { }
    )
}
