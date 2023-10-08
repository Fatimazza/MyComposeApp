package io.github.fatimazza.mycomposeapp.cupcake

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import io.github.fatimazza.mycomposeapp.ui.cupcake.CupcakeApp
import org.junit.Before
import org.junit.Rule

class CupcakeScreenNavigationTest {
    /**
     * Note: To access to an empty activity, the code uses ComponentActivity instead of
     * MainActivity.
     */
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Before
    fun setupCupcakeNavHost() {
        composeTestRule.setContent {
            CupcakeApp()
        }
    }
}
