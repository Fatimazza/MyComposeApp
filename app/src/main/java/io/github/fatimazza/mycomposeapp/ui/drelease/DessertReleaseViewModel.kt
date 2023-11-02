package io.github.fatimazza.mycomposeapp.ui.drelease

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import io.github.fatimazza.mycomposeapp.DessertReleaseApplication
import io.github.fatimazza.mycomposeapp.MyComposeApplication
import io.github.fatimazza.mycomposeapp.R
import io.github.fatimazza.mycomposeapp.data.drelease.DessertReleaseUserPreferencesRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

/*
 * View model of Dessert Release components
 */
class DessertReleaseViewModel(
    private val userPreferencesRepository: DessertReleaseUserPreferencesRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(DessertReleaseUiState())

    // UI states access for various [DessertReleaseUiState]
    val uiState: StateFlow<DessertReleaseUiState> =
        userPreferencesRepository.isLinearLayout.map { isLinearLayout ->
            DessertReleaseUiState(isLinearLayout)
        }
            .stateIn(
                scope = viewModelScope,
                // Flow is set to emits value for when app is on the foreground
                // 5 seconds stop delay is added to ensure it flows continuously
                // for cases such as configuration change
                started = SharingStarted.WhileSubscribed(5_000),
                initialValue = DessertReleaseUiState()
            )

    /*
     * [selectLayout] change the layout and icons accordingly and
     * save the selection in DataStore through [userPreferencesRepository]
     */
    fun selectLayout(isLinearLayout: Boolean) {
        viewModelScope.launch {
            userPreferencesRepository.saveLayoutPreference(isLinearLayout)
        }
    }
    
    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as MyComposeApplication)
                DessertReleaseViewModel(application.myUserPreferencesRepository)
            }
        }
    }
}

/*
 * Data class containing various UI States for Dessert Release screens
 */
data class DessertReleaseUiState(
    val isLinearLayout: Boolean = true,
    val toggleContentDescription: Int =
        if (isLinearLayout) R.string.release_grid_layout_toggle else R.string.release_linear_layout_toggle,
    val toggleIcon: Int =
        if (isLinearLayout) R.drawable.ic_release_grid_layout else R.drawable.ic_release_linear_layout
)
