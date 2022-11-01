package io.github.fatimazza.mycomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.fatimazza.mycomposeapp.ui.theme.MyComposeAppTheme
import java.text.NumberFormat

class TipTimeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TipTimeScreen()
                }
            }
        }
    }
}

@Composable
fun TipTimeScreen() {
    var amountInput by remember { mutableStateOf("0") }
    val amount = amountInput.toDoubleOrNull() ?: 0.0

    var tipInput by remember { mutableStateOf("") }
    val tipPercent = tipInput.toDoubleOrNull() ?: 0.0

    val tip = calculateTip(amount, tipPercent)

    Column(
        modifier = Modifier.padding(32.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = stringResource(R.string.tip_calculate),
            fontSize = 24.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(Modifier.height(16.dp))
        EditNumberField(
            label = R.string.tip_bill_amount,
            value = amountInput,
            onValueChange = { amountInput = it }
        )
        EditNumberField(
            label = R.string.tip_how_was_the_service,
            value = tipInput,
            onValueChange = { tipInput = it }
        )
        Spacer(Modifier.height(24.dp))
        Text(
            text = stringResource(R.string.tip_amount, tip),
            modifier = Modifier.align(Alignment.CenterHorizontally),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun EditNumberField(
    @StringRes label: Int,
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
){
    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(stringResource(label)) },
        modifier = Modifier.fillMaxWidth(),
        singleLine = true,
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Number,
            imeAction = ImeAction.Next)
    )
}

/**
 * Calculates the tip based on the user input and format the tip amount
 * according to the local currency and display it onscreen.
 * Example would be "$10.00".
 */
private fun calculateTip(
    amount: Double,
    tipPercent: Double = 15.0
): String {
    val tip = tipPercent / 100 * amount
    return NumberFormat.getCurrencyInstance().format(tip)
}

@Preview(showBackground = true)
@Composable
fun TipTimePreview() {
    MyComposeAppTheme {
        TipTimeScreen()
    }
}
