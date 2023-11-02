package io.github.fatimazza.mycomposeapp.data.drelease

import androidx.datastore.preferences.core.booleanPreferencesKey

/*
 * Concrete class implementation to access data store
 */
class DessertReleaseUserPreferencesRepository() {
    private companion object {
        val IS_LINEAR_LAYOUT = booleanPreferencesKey("is_linear_layout")
        const val TAG = "UserPreferencesRepo"
    }
}
