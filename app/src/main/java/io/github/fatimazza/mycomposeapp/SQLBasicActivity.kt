package io.github.fatimazza.mycomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import io.github.fatimazza.mycomposeapp.database.SQLBasicAppDatabase
import io.github.fatimazza.mycomposeapp.ui.theme.MyComposeAppTheme
import kotlinx.coroutines.launch

class SQLBasicActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycleScope.launch {
            SQLBasicAppDatabase
                .getDatabase(applicationContext).emailDao().getAll()
        }
        setContent {
            MyComposeAppTheme {
                SQLBasic()
            }
        }
    }
}

@Composable
fun SQLBasic() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("The database is ready!")
    }
}

@Preview(showBackground = true)
@Composable
fun SQLBasicPreview() {
    MyComposeAppTheme {
        SQLBasic()
    }
}
