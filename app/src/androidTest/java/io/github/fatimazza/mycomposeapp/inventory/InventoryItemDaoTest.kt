package io.github.fatimazza.mycomposeapp.inventory

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import io.github.fatimazza.mycomposeapp.data.inventory.InventoryDatabase
import io.github.fatimazza.mycomposeapp.data.inventory.InventoryItem
import io.github.fatimazza.mycomposeapp.data.inventory.InventoryItemDao
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
class InventoryItemDaoTest {

    private lateinit var itemDao: InventoryItemDao
    private lateinit var inventoryDatabase: InventoryDatabase
    private val item1 = InventoryItem(1, "Apples", 10.0, 20)

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

    @After
    @Throws(IOException::class)
    fun closeDb() {
        inventoryDatabase.close()
    }

    @Test
    @Throws(Exception::class)
    fun daoInsert_insertsItemIntoDB() = runBlocking {
        addOneItemToDb()
        val allItems = itemDao.getAllItems().first()
        assertEquals(allItems[0], item1)
    }

    private suspend fun addOneItemToDb() {
        itemDao.insert(item1)
    }

}
