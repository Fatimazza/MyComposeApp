package io.github.fatimazza.mycomposeapp.ui.cupcake

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import io.github.fatimazza.mycomposeapp.R

/**
 * This composable expects [orderUiState] that represents the order state, [onCancelButtonClicked]
 * lambda that triggers canceling the order and passes the final order to [onSendButtonClicked]
 * lambda
 */
@Composable
fun OrderSummaryScreen(
    modifier: Modifier = Modifier
) {
    //Create a list of order summary to display
    val items = listOf(
        // Summary line 1: display selected quantity
        Pair(stringResource(R.string.cupcake_quantity), "0"),
        // Summary line 2: display selected flavor
        Pair(stringResource(R.string.cupcake_flavor), "chocolate"),
        // Summary line 3: display selected pickup date
        Pair(stringResource(R.string.cupcake_pickup_date), "01-02-2023")
    )

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium)),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
        ) {
            items.forEach { item ->
                Text(item.first.uppercase())
                Text(text = item.second, fontWeight = FontWeight.Bold)
                Divider(thickness = dimensionResource(R.dimen.thickness_divider))
            }
        }
    }
}

@Preview
@Composable
fun OrderSummaryPreview() {
    OrderSummaryScreen(
        modifier = Modifier.fillMaxHeight()
    )
}
