package io.github.fatimazza.mycomposeapp.ui.inventory.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import io.github.fatimazza.mycomposeapp.ui.inventory.home.HomeDestination
import io.github.fatimazza.mycomposeapp.ui.inventory.home.InventoryHomeScreen
import io.github.fatimazza.mycomposeapp.ui.inventory.item.ItemDetailsDestination

/**
 * Provides Navigation graph for the application.
 */
@Composable
fun InventoryNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = HomeDestination.route,
        modifier = modifier
    ) {
        composable(route = HomeDestination.route) {
            InventoryHomeScreen(
                navigateToItemUpdate = {
                    navController.navigate("${ItemDetailsDestination.route}/${it}")
                }
            )
        }
    }
}
