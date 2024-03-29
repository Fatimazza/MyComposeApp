package io.github.fatimazza.mycomposeapp

import android.app.Application
import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import io.github.fatimazza.mycomposeapp.data.drelease.DessertReleaseUserPreferencesRepository

private const val LAYOUT_PREFERENCE_NAME = "layout_preferences"
private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(
    name = LAYOUT_PREFERENCE_NAME
)

/*
 * Custom app entry point for manual dependency injection
 */
class DessertReleaseApplication: Application() {
    lateinit var userPreferencesRepository: DessertReleaseUserPreferencesRepository

    override fun onCreate() {
        super.onCreate()
        userPreferencesRepository = DessertReleaseUserPreferencesRepository(dataStore)
    }
}
