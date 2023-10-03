package io.github.fatimazza.mycomposeapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColorScheme(
    primary = Purple200,
    inversePrimary = Purple700,
    secondary = Teal200
)

private val LightColorPalette = lightColorScheme(
    primary = Purple500,
    inversePrimary = Purple700,
    secondary = Teal200

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

private val WoofLightColorPalette = lightColorScheme(
    background = Green100,
    surface = Green50,
    onSurface = Grey900,
    primary = Grey50,
    onPrimary = Grey900,
    secondary = Grey700
)

private val WoofDarkColorPalette = darkColorScheme(
    background = Cyan900,
    surface = Cyan700,
    onSurface = White,
    primary = Grey900,
    onPrimary = White,
    secondary = Grey100
)

@Composable
fun MyComposeAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}

@Composable
fun WoofTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        WoofDarkColorPalette
    } else {
        WoofLightColorPalette
    }

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
