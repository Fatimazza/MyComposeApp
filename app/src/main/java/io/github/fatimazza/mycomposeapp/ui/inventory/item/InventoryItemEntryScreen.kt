package io.github.fatimazza.mycomposeapp.ui.inventory.item

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import io.github.fatimazza.mycomposeapp.ui.inventory.InventoryTopAppBar


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun InventoryItemEntryScreen(
    navigateBack: () -> Unit,
    onNavigateUp: () -> Unit,
    canNavigateBack: Boolean = true,
) {
    Scaffold(
        topBar = {
            InventoryTopAppBar(
                title = "Inventory Item Entry",
                canNavigateBack = canNavigateBack,
                navigateUp = onNavigateUp
            )
        }
    ) {

    }
}
