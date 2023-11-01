package io.github.fatimazza.mycomposeapp.ui.inventory.item

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

/**
 * ViewModel to retrieve and update an item from the [ItemsRepository]'s data source.
 */
class InventoryItemEditViewModel(
    savedStateHandle: SavedStateHandle,
) : ViewModel() {

    /**
     * Holds current item ui state
     */
    var itemUiState by mutableStateOf(InventoryItemUiState())
        private set

    private val itemId: Int = checkNotNull(savedStateHandle[InventoryItemEditDestination.itemIdArg])

    private fun validateInput(uiState: InventoryItemDetails = itemUiState.itemDetails): Boolean {
        return with(uiState) {
            name.isNotBlank() && price.isNotBlank() && quantity.isNotBlank()
        }
    }
}
