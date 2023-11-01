package io.github.fatimazza.mycomposeapp.ui.inventory.item

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

/**
 * ViewModel to validate and insert items in the Room database.
 */
class InventoryItemEntryViewModel : ViewModel() {
    /**
     * Holds current item ui state
     */
    var itemUiState by mutableStateOf(InventoryItemUiState())
        private set

    /**
     * Updates the [itemUiState] with the value provided in the argument. This method also triggers
     * a validation for input values.
     */
    fun updateUiState(itemDetails: InventoryItemDetails) {
        itemUiState =
            InventoryItemUiState(itemDetails = itemDetails, isEntryValid = validateInput(itemDetails))
    }

    private fun validateInput(uiState: InventoryItemDetails = itemUiState.itemDetails): Boolean {
        return with(uiState) {
            name.isNotBlank() && price.isNotBlank() && quantity.isNotBlank()
        }
    }
}

/**
 * Represents Ui State for an Item.
 */
data class InventoryItemUiState(
    val itemDetails: InventoryItemDetails = InventoryItemDetails(),
    val isEntryValid: Boolean = false
)

data class InventoryItemDetails(
    val id: Int = 0,
    val name: String = "",
    val price: String = "",
    val quantity: String = "",
)
