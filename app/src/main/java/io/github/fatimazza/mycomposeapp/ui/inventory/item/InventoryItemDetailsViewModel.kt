package io.github.fatimazza.mycomposeapp.ui.inventory.item

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.github.fatimazza.mycomposeapp.data.inventory.InventoryItemsRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

/**
 * ViewModel to retrieve, update and delete an item from the [ItemsRepository]'s data source.
 */
class InventoryItemDetailsViewModel(
    savedStateHandle: SavedStateHandle,
    private val itemsRepository: InventoryItemsRepository,
) : ViewModel() {

    private val itemId: Int = checkNotNull(savedStateHandle[InventoryItemDetailsDestination.itemIdArg])

    /**
     * Holds the item details ui state. The data is retrieved from [ItemsRepository] and mapped to
     * the UI state.
     */
    val uiState: StateFlow<InventoryItemDetailsUiState> =
        itemsRepository.getItemStream(itemId)
            .filterNotNull()
            .map {
                InventoryItemDetailsUiState(outOfStock = it.quantity <= 0, itemDetails = it.toItemDetails())
            }.stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(TIMEOUT_MILLIS),
                initialValue = InventoryItemDetailsUiState()
            )

    /**
     * Reduces the item quantity by one and update the [ItemsRepository]'s data source.
     */
    fun reduceQuantityByOne() {
        viewModelScope.launch {
            val itemDetails = uiState.value.itemDetails
            val currentItem = uiState.value.itemDetails.toItem()
            val quantity = currentItem.quantity - 1
            if (currentItem.quantity > 0) {
                // itemsRepository.updateItem(currentItem.copy(quantity = currentItem.quantity - 1))
                itemsRepository.updateItem(itemDetails.copy(quantity = quantity.toString()).toItem())
            }
        }
    }

    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
}

/**
 * UI state for ItemDetailsScreen
 */
data class InventoryItemDetailsUiState(
    val outOfStock: Boolean = true,
    val itemDetails: InventoryItemDetails = InventoryItemDetails()
)
