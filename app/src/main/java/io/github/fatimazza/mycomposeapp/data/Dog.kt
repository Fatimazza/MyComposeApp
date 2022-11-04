package io.github.fatimazza.mycomposeapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import io.github.fatimazza.mycomposeapp.R

/**
 * A data class to represent the information presented in the dog card
 */
data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    Dog(R.drawable.woof_koda, R.string.woof_dog_name_1, 2, R.string.woof_dog_description_1),
    Dog(R.drawable.woof_lola, R.string.woof_dog_name_2, 16, R.string.woof_dog_description_2),
    Dog(R.drawable.woof_frankie, R.string.woof_dog_name_3, 2, R.string.woof_dog_description_3),
    Dog(R.drawable.woof_nox, R.string.woof_dog_name_4, 8, R.string.woof_dog_description_4),
    Dog(R.drawable.woof_faye, R.string.woof_dog_name_5, 8, R.string.woof_dog_description_5),
    Dog(R.drawable.woof_bella, R.string.woof_dog_name_6, 14, R.string.woof_dog_description_6),
    Dog(R.drawable.woof_moana, R.string.woof_dog_name_7, 2, R.string.woof_dog_description_7),
    Dog(R.drawable.woof_tzeitel, R.string.woof_dog_name_8, 7, R.string.woof_dog_description_8),
    Dog(R.drawable.woof_leroy, R.string.woof_dog_name_9, 4, R.string.woof_dog_description_9)
)
