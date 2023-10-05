package io.github.fatimazza.mycomposeapp

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.fatimazza.mycomposeapp.ui.theme.MyComposeAppTheme

class DessertClickerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DesertClickerApp()
                }
            }
        }
    }
}

@Composable
fun DesertClickerApp() {
    Scaffold(topBar = {
        val intentContext = LocalContext.current
        DessertClickerAppBar(
            onShareButtonClicked = { shareSoldDessertsInformation(intentContext) },
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.primary)
        )
    }) { contentPadding ->
        DessertClickerScreen(
            modifier = Modifier.padding(contentPadding)
        )
    }
}

@Composable
private fun DessertClickerAppBar(
    onShareButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = stringResource(R.string.app_name),
            modifier = Modifier.padding(start = 16.dp),
            color = MaterialTheme.colorScheme.onPrimary,
            style = MaterialTheme.typography.titleLarge,
        )
        IconButton(
            onClick = onShareButtonClicked,
            modifier = Modifier.padding(end = 16.dp),
        ) {
            Icon(
                imageVector = Icons.Filled.Share,
                contentDescription = stringResource(R.string.dessert_share),
                tint = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}

@Composable
fun DessertClickerScreen(
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Image(
            painter = painterResource(R.drawable.dessert_bakery_back),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Column {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
            ) {
                Image(
                    painter = painterResource(R.drawable.dessert_froyo),
                    contentDescription = null,
                    modifier = Modifier
                        .width(dimensionResource(R.dimen.dessert_image_size))
                        .height(dimensionResource(R.dimen.dessert_image_size))
                        .align(Alignment.Center)
                        .clickable { },
                    contentScale = ContentScale.Crop,
                )
            }
        }
    }
}

/**
 * Share desserts sold information using ACTION_SEND intent
 */
private fun shareSoldDessertsInformation(intentContext: Context) {
    Toast.makeText(
        intentContext,
        intentContext.getString(R.string.title_dessert_clicker),
        Toast.LENGTH_LONG
    ).show()
}

@Preview(showBackground = true)
@Composable
fun DesertClickerAppPreview() {
    MyComposeAppTheme {
        DesertClickerApp()
    }
}
