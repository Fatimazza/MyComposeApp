package io.github.fatimazza.mycomposeapp.ui.drelease

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory

/*
 * View model of Dessert Release components
 */
class DessertReleaseViewModel() : ViewModel() {
    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                DessertReleaseViewModel()
            }
        }
    }
}
