package io.github.fatimazza.mycomposeapp.ui.inventory.item

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import io.github.fatimazza.mycomposeapp.data.inventory.InventoryItem
import io.github.fatimazza.mycomposeapp.data.inventory.InventoryItemsRepository
import java.text.NumberFormat

/**
 * ViewModel to validate and insert items in the Room database.
 */
class InventoryItemEntryViewModel(private val itemsRepository: InventoryItemsRepository) : ViewModel() {
    /**
     * Holds current item ui state
     */
    var itemUiState by mutableStateOf(InventoryItemUiState())
        private set

    /**
     * Update the item in the [ItemsRepository]'s data source
     */
    suspend fun updateItem() {
        if (validateInput(itemUiState.itemDetails)) {
            itemsRepository.updateItem(itemUiState.itemDetails.toItem())
        }
    }

    /**
     * Updates the [itemUiState] with the value provided in the argument. This method also triggers
     * a validation for input values.
     */
    fun updateUiState(itemDetails: InventoryItemDetails) {
        itemUiState =
            InventoryItemUiState(
                itemDetails = itemDetails,
                isEntryValid = validateInput(itemDetails)
            )
    }

    suspend fun saveItem() {
        if (validateInput()) {
            itemsRepository.insertItem(itemUiState.itemDetails.toItem())
        }
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

/**
 * Extension function to convert [ItemDetails] to [Item]. If the value of [ItemDetails.price] is
 * not a valid [Double], then the price will be set to 0.0. Similarly if the value of
 * [ItemDetails.quantity] is not a valid [Int], then the quantity will be set to 0
 */
fun InventoryItemDetails.toItem(): InventoryItem = InventoryItem(
    id = id,
    name = name,
    price = price.toDoubleOrNull() ?: 0.0,
    quantity = quantity.toIntOrNull() ?: 0
)

fun InventoryItem.formatedPrice(): String {
    return NumberFormat.getCurrencyInstance().format(price)
}

/**
 * Extension function to convert [Item] to [ItemUiState]
 */
fun InventoryItem.toItemUiState(isEntryValid: Boolean = false): InventoryItemUiState =
    InventoryItemUiState(
        itemDetails = this.toItemDetails(),
        isEntryValid = isEntryValid
    )

/**
 * Extension function to convert [Item] to [ItemDetails]
 */
fun InventoryItem.toItemDetails(): InventoryItemDetails = InventoryItemDetails(
    id = id,
    name = name,
    price = price.toString(),
    quantity = quantity.toString()
)
