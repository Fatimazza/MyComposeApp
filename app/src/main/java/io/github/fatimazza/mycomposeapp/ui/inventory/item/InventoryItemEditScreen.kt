package io.github.fatimazza.mycomposeapp.ui.inventory.item

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


object InventoryItemEditDestination : InventoryNavDestination {
    override val route = "item_edit"
    override val titleRes = R.string.inventory_edit_item_title
    const val itemIdArg = "itemId"
    val routeWithArgs = "$route/{$itemIdArg}"
}
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun InventoryItemEditScreen(
    navigateBack: () -> Unit,
    onNavigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            InventoryTopAppBar(
                title = "Item Edit Screen",
                canNavigateBack = true,
                navigateUp = onNavigateUp
            )
        },
        modifier = modifier
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun InventoryItemEditScreenPreview() {
    MyComposeAppTheme {
        InventoryItemEditScreen(
            navigateBack = { },
            onNavigateUp = { }
        )
    }
}
