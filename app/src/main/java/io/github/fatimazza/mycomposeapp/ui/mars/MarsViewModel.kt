package io.github.fatimazza.mycomposeapp.ui.mars

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MarsViewModel : ViewModel() {

    /** The mutable State that stores the status of the most recent request */
    var marsUiState: String by mutableStateOf("")
        private set
}
