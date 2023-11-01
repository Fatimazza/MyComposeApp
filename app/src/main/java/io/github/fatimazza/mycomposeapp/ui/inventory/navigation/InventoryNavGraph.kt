package io.github.fatimazza.mycomposeapp.ui.inventory.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import io.github.fatimazza.mycomposeapp.ui.inventory.home.HomeDestination
import io.github.fatimazza.mycomposeapp.ui.inventory.home.InventoryHomeScreen
import io.github.fatimazza.mycomposeapp.ui.inventory.item.InventoryItemDetailsScreen
import io.github.fatimazza.mycomposeapp.ui.inventory.item.InventoryItemDetailsDestination
import io.github.fatimazza.mycomposeapp.ui.inventory.item.InventoryItemEntryDestination
import io.github.fatimazza.mycomposeapp.ui.inventory.item.InventoryItemEntryScreen

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
                    navController.navigate("${InventoryItemDetailsDestination.route}/${it}")
                }
            )
        }
        composable(route = InventoryItemEntryDestination.route) {
            InventoryItemEntryScreen(
                navigateBack = { navController.popBackStack() },
                onNavigateUp = { navController.navigateUp() }
            )
        }
        composable(
            route = InventoryItemDetailsDestination.routeWithArgs,
            arguments = listOf(navArgument(InventoryItemDetailsDestination.itemIdArg) {
                type = NavType.IntType
            })
        ) {
            InventoryItemDetailsScreen(
                navigateBack = { navController.navigateUp() }
            )
        }
    }
}
