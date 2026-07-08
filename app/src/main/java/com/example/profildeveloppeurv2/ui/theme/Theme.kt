package com.example.profildeveloppeurv2.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

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

private val ProfilShapes = Shapes(
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(24.dp),
    extraLarge = RoundedCornerShape(32.dp)
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
        shapes = ProfilShapes,
        content = content
    )
}
