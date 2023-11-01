package io.github.fatimazza.mycomposeapp

import android.app.Application
import io.github.fatimazza.mycomposeapp.data.inventory.InventoryAppDataContainer
import io.github.fatimazza.mycomposeapp.data.inventory.InventoryAppContainer

class InventoryApplication : Application() {

    /**
     * AppContainer instance used by the rest of classes to obtain dependencies
     */
    lateinit var container: InventoryAppContainer

    override fun onCreate() {
        super.onCreate()
        container = InventoryAppDataContainer(this)
    }
}
