package io.github.fatimazza.mycomposeapp.data

import io.github.fatimazza.mycomposeapp.R
import io.github.fatimazza.mycomposeapp.model.Dessert

object DessertDatasource {
    val dessertList = listOf(
        Dessert(R.drawable.dessert_cupcake, 5, 0),
        Dessert(R.drawable.dessert_donut, 10, 5),
        Dessert(R.drawable.dessert_eclair, 15, 20),
        Dessert(R.drawable.dessert_froyo, 30, 50),
        Dessert(R.drawable.dessert_gingerbread, 50, 100),
        Dessert(R.drawable.dessert_honeycomb, 100, 200),
        Dessert(R.drawable.dessert_icecreamsandwich, 500, 500),
        Dessert(R.drawable.dessert_jellybean, 1000, 1000),
        Dessert(R.drawable.dessert_kitkat, 2000, 2000),
        Dessert(R.drawable.dessert_lollipop, 3000, 4000),
        Dessert(R.drawable.dessert_marshmallow, 4000, 8000),
        Dessert(R.drawable.dessert_nougat, 5000, 16000),
        Dessert(R.drawable.dessert_oreo, 6000, 20000)
    )
}
