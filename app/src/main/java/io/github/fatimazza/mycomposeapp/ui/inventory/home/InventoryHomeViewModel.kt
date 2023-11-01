package io.github.fatimazza.mycomposeapp.ui.inventory.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.github.fatimazza.mycomposeapp.data.inventory.InventoryItem
import io.github.fatimazza.mycomposeapp.data.inventory.InventoryItemsRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

/**
 * ViewModel to retrieve all items in the Room database.
 */
class InventoryHomeViewModel(itemsRepository: InventoryItemsRepository) : ViewModel() {

    /**
     * Holds home ui state. The list of items are retrieved from [ItemsRepository] and mapped to
     * [HomeUiState]
     */
    val homeUiState: StateFlow<InventoryHomeUiState> =
        itemsRepository.getAllItemsStream().map { InventoryHomeUiState(it) }
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(TIMEOUT_MILLIS),
                initialValue = InventoryHomeUiState()
            )

    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
}

/**
 * Ui State for InventoryHomeScreen
 */
data class InventoryHomeUiState(val itemList: List<InventoryItem> = listOf())
