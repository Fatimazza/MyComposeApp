package io.github.fatimazza.mycomposeapp.data.cupcake

import io.github.fatimazza.mycomposeapp.R

object CupcakeDataSource {
    val flavors = listOf(
        R.string.cupcake_vanilla,
        R.string.cupcake_chocolate,
        R.string.cupcake_red_velvet,
        R.string.cupcake_salted_caramel,
        R.string.cupcake_coffee
    )

    val quantityOptions = listOf(
        Pair(R.string.cupcake_one, 1),
        Pair(R.string.cupcake_six, 6),
        Pair(R.string.cupcake_twelve, 12)
    )
}
