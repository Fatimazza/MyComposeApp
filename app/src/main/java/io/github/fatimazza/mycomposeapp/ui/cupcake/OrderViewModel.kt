package io.github.fatimazza.mycomposeapp.ui.cupcake

import androidx.lifecycle.ViewModel
import io.github.fatimazza.mycomposeapp.data.cupcake.OrderUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * [OrderViewModel] holds information about a cupcake order in terms of quantity, flavor, and
 * pickup date. It also knows how to calculate the total price based on these order details.
 */
class OrderViewModel : ViewModel() {

    /**
     * Cupcake state for this order
     */
    private val _uiState = MutableStateFlow(OrderUiState())
    val uiState: StateFlow<OrderUiState> = _uiState.asStateFlow()
}
