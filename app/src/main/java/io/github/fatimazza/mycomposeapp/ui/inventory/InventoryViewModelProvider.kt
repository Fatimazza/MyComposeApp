package io.github.fatimazza.mycomposeapp.ui.inventory

import android.app.Application
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import io.github.fatimazza.mycomposeapp.InventoryApplication
import io.github.fatimazza.mycomposeapp.MyComposeApplication
import io.github.fatimazza.mycomposeapp.ui.inventory.home.InventoryHomeViewModel
import io.github.fatimazza.mycomposeapp.ui.inventory.item.InventoryItemDetailsViewModel
import io.github.fatimazza.mycomposeapp.ui.inventory.item.InventoryItemEditViewModel
import io.github.fatimazza.mycomposeapp.ui.inventory.item.InventoryItemEntryViewModel


/**
 * Provides Factory to create instance of ViewModel for the entire Inventory app
 */
object InventoryAppViewModelProvider {
    val Factory = viewModelFactory {
        // Initializer for HomeViewModel
        initializer {
            InventoryHomeViewModel(inventoryApplication().myInventoryContainer.itemsRepository)
        }
        // Initializer for ItemDetailsViewModel
        initializer {
            InventoryItemDetailsViewModel(
                this.createSavedStateHandle(),
                inventoryApplication().myInventoryContainer.itemsRepository
            )
        }
        // Initializer for ItemEntryViewModel
        initializer {
            InventoryItemEntryViewModel(inventoryApplication().myInventoryContainer.itemsRepository)
        }
        // Initializer for ItemEditViewModel
        initializer {
            InventoryItemEditViewModel(
                this.createSavedStateHandle(),
                inventoryApplication().myInventoryContainer.itemsRepository
            )
        }
    }
}

/**
 * Extension function to queries for [Application] object and returns an instance of
 * [InventoryApplication].
 */
fun CreationExtras.inventoryApplication(): MyComposeApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MyComposeApplication)

