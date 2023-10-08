package io.github.fatimazza.mycomposeapp.ui.cupcake

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/**
 * This composable expects [orderUiState] that represents the order state, [onCancelButtonClicked]
 * lambda that triggers canceling the order and passes the final order to [onSendButtonClicked]
 * lambda
 */
@Composable
fun OrderSummaryScreen(
    modifier: Modifier = Modifier
) {

}

@Preview
@Composable
fun OrderSummaryPreview() {
    OrderSummaryScreen(
        modifier = Modifier.fillMaxHeight()
    )
}
