package io.github.fatimazza.mycomposeapp.ui.cupcake

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/**
 * Composable that displays the list of items as [RadioButton] options,
 * [onSelectionChanged] lambda that notifies the parent composable when a new value is selected,
 * [onCancelButtonClicked] lambda that cancels the order when user clicks cancel and
 * [onNextButtonClicked] lambda that triggers the navigation to next screen
 */
@Composable
fun SelectOptionScreen(
    modifier: Modifier
) {

}

@Preview
@Composable
fun SelectOptionPreview() {
    SelectOptionScreen(
        modifier = Modifier.fillMaxHeight()
    )
}

