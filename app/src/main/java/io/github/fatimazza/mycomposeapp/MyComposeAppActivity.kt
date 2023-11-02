package io.github.fatimazza.mycomposeapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.fatimazza.mycomposeapp.ui.theme.MyComposeAppTheme

class MyComposeAppActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeApp()
        }
    }
}

@Composable
fun MyComposeApp() {
    MyComposeAppTheme {
        val context = LocalContext.current

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp, 16.dp),
        ) {
            Text(
                text = stringResource(R.string.app_name),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineMedium
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    context.startActivity(Intent(context, MainActivity::class.java))
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.title_hello_compose))
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    context.startActivity(Intent(context, BirthdayCardActivity::class.java))
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.title_birthday_card))
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    context.startActivity(Intent(context, LemonadeActivity::class.java))
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.title_lemonade))
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    context.startActivity(Intent(context, DiceRollerActivity::class.java))
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.title_dice_roller))
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    context.startActivity(Intent(context, TipTimeActivity::class.java))
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.title_tip_time))
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    context.startActivity(Intent(context, AffirmationActivity::class.java))
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.title_affirmation))
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    context.startActivity(Intent(context, WoofActivity::class.java))
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.title_woof))
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    context.startActivity(Intent(context, DessertClickerActivity::class.java))
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.title_dessert_clicker))
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    context.startActivity(Intent(context, UnscrambleActivity::class.java))
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.title_unscramble))
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    context.startActivity(Intent(context, CupcakeActivity::class.java))
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.title_cupcake))
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    context.startActivity(Intent(context, ReplyActivity::class.java))
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.title_reply))
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    context.startActivity(Intent(context, RaceTrackerActivity::class.java))
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.title_race_tracker))
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    context.startActivity(Intent(context, MarsPhotosActivity::class.java))
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.title_mars_photos))
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    context.startActivity(Intent(context, SQLBasicActivity::class.java))
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.title_sql_basic))
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    context.startActivity(Intent(context, InventoryActivity::class.java))
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.title_inventory_app))
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    context.startActivity(Intent(context, DessertReleaseActivity::class.java))
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.title_dessert_release))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyComposeAppPreview() {
    MyComposeApp()
}
