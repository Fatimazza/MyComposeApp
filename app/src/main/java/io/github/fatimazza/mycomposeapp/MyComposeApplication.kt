package io.github.fatimazza.mycomposeapp

import android.app.Application
import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import io.github.fatimazza.mycomposeapp.data.drelease.DessertReleaseUserPreferencesRepository
import io.github.fatimazza.mycomposeapp.data.inventory.InventoryAppContainer
import io.github.fatimazza.mycomposeapp.data.inventory.InventoryAppDataContainer

private const val LAYOUT_PREFERENCE_NAME = "layout_preferences"
private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(
    name = LAYOUT_PREFERENCE_NAME
)

class MyComposeApplication: Application() {

    lateinit var myInventoryContainer: InventoryAppContainer
    lateinit var myUserPreferencesRepository: DessertReleaseUserPreferencesRepository

    override fun onCreate() {
        super.onCreate()

        myInventoryContainer = InventoryAppDataContainer(this)
        myUserPreferencesRepository = DessertReleaseUserPreferencesRepository(dataStore)
    }
}
