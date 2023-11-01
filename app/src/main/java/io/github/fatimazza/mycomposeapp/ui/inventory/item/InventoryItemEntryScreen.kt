package io.github.fatimazza.mycomposeapp.ui.inventory.item

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import io.github.fatimazza.mycomposeapp.R
import io.github.fatimazza.mycomposeapp.ui.inventory.InventoryTopAppBar
import io.github.fatimazza.mycomposeapp.ui.inventory.navigation.InventoryNavDestination

object InventoryItemEntryDestination : InventoryNavDestination {
    override val route = "item_entry"
    override val titleRes = R.string.inventory_item_entry_title
}

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
