package io.github.fatimazza.mycomposeapp.ui.dessert

import androidx.annotation.DrawableRes
import io.github.fatimazza.mycomposeapp.data.DessertDatasource.dessertList

data class DessertUiState(
    val currentDessertIndex: Int = 0,
    val dessertsSold: Int = 0,
    val revenue: Int = 0,
    val currentDessertPrice: Int = dessertList[currentDessertIndex].price,
    @DrawableRes val currentDessertImageId: Int = dessertList[currentDessertIndex].imageId
)
