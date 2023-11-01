package io.github.fatimazza.mycomposeapp.inventory

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import io.github.fatimazza.mycomposeapp.data.inventory.InventoryDatabase
import io.github.fatimazza.mycomposeapp.data.inventory.InventoryItemDao
import org.junit.Before
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class InventoryItemDaoTest {

    private lateinit var itemDao: InventoryItemDao
    private lateinit var inventoryDatabase: InventoryDatabase

    @Before
    fun createDb() {
        val context: Context = ApplicationProvider.getApplicationContext()
        // Using an in-memory database because the information stored here disappears when the
        // process is killed.
        inventoryDatabase = Room.inMemoryDatabaseBuilder(context, InventoryDatabase::class.java)
            // Allowing main thread queries, just for testing.
            .allowMainThreadQueries()
            .build()
        itemDao = inventoryDatabase.itemDao()
    }
}
