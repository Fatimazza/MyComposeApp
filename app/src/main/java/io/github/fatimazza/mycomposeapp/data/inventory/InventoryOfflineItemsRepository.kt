package io.github.fatimazza.mycomposeapp.data.inventory

import kotlinx.coroutines.flow.Flow

class InventoryOfflineItemsRepository : InventoryItemsRepository {
    override fun getAllItemsStream(): Flow<List<InventoryItem>> {
        TODO("Not yet implemented")
    }

    override fun getItemStream(id: Int): Flow<InventoryItem?> {
        TODO("Not yet implemented")
    }

    override suspend fun insertItem(item: InventoryItem) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteItem(item: InventoryItem) {
        TODO("Not yet implemented")
    }

    override suspend fun updateItem(item: InventoryItem) {
        TODO("Not yet implemented")
    }
}
