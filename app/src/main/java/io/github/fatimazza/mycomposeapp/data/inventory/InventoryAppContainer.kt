package io.github.fatimazza.mycomposeapp.data.inventory

import android.content.Context

/**
 * App container for Dependency injection.
 */
interface InventoryAppContainer {
    val itemsRepository: InventoryItemsRepository
}

/**
 * [AppContainer] implementation that provides instance of [OfflineItemsRepository]
 */
class InventoryAppDataContainer(private val context: Context) : InventoryAppContainer {
    /**
     * Implementation for [InventoryItemsRepository]
     */
    override val itemsRepository: InventoryItemsRepository by lazy {
        InventoryOfflineItemsRepository(
            InventoryDatabase.getDatabase(context).itemDao()
        )
    }
}
