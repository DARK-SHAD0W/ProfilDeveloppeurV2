package com.example.profildeveloppeurv2.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = PrimaireClair,
    onPrimary = OnPrimaireClair,
    secondary = SecondaireClair,
    background = FondClair,
    onBackground = OnFondClair,
    surface = SurfaceClaire,
    onSurface = OnSurfaceClaire
)

private val DarkColorScheme = darkColorScheme(
    primary = PrimaireSombre,
    onPrimary = OnPrimaireSombre,
    secondary = SecondaireSombre,
    background = FondSombre,
    onBackground = OnFondSombre,
    surface = SurfaceSombre,
    onSurface = OnSurfaceSombre
)

@Composable
fun ProfilDeveloppeurV2Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
