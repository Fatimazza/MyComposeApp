package io.github.fatimazza.mycomposeapp.ui.inventory.home

import androidx.lifecycle.ViewModel
import io.github.fatimazza.mycomposeapp.data.inventory.InventoryItem

/**
 * ViewModel to retrieve all items in the Room database.
 */
class InventoryHomeViewModel : ViewModel() {
    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
}

/**
 * Ui State for InventoryHomeScreen
 */
data class InventoryHomeUiState(val itemList: List<InventoryItem> = listOf())
