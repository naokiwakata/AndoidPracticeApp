package com.example.androidpracticeapp.screen.main

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun AppTheme(
    content: @Composable () -> Unit
){
    val lightColorPalette = lightColorScheme(
        primary = md_theme_light_primary,
        onPrimary = md_theme_light_onPrimary,
        primaryContainer = md_theme_light_primaryContainer,
        onPrimaryContainer = md_theme_light_onPrimaryContainer,
        secondary = md_theme_light_secondary,
        onSecondary = md_theme_light_onSecondary,
        secondaryContainer = md_theme_light_secondaryContainer,
        onSecondaryContainer = md_theme_light_onSecondaryContainer,
        tertiary = md_theme_light_tertiary,
        onTertiary = md_theme_light_onTertiary,
        tertiaryContainer = md_theme_light_tertiaryContainer,
        onTertiaryContainer = md_theme_light_onTertiaryContainer,
        error = md_theme_light_error,
        errorContainer = md_theme_light_errorContainer,
        onError = md_theme_light_onError,
        onErrorContainer = md_theme_light_onErrorContainer,
        background = md_theme_light_background,
        onBackground = md_theme_light_onBackground,
        surface = md_theme_light_surface,
        onSurface = md_theme_light_onSurface,
        surfaceVariant = md_theme_light_surfaceVariant,
        onSurfaceVariant = md_theme_light_onSurfaceVariant,
        outline = md_theme_light_outline,
        inverseOnSurface = md_theme_light_inverseOnSurface,
        inverseSurface = md_theme_light_inverseSurface,
        inversePrimary = md_theme_light_inversePrimary,
    )

    val darkColorPalette = darkColorScheme(
        primary = md_theme_dark_primary,
        onPrimary = md_theme_dark_onPrimary,
        primaryContainer = md_theme_dark_primaryContainer,
        onPrimaryContainer = md_theme_dark_onPrimaryContainer,
        secondary = md_theme_dark_secondary,
        onSecondary = md_theme_dark_onSecondary,
        secondaryContainer = md_theme_dark_secondaryContainer,
        onSecondaryContainer = md_theme_dark_onSecondaryContainer,
        tertiary = md_theme_dark_tertiary,
        onTertiary = md_theme_dark_onTertiary,
        tertiaryContainer = md_theme_dark_tertiaryContainer,
        onTertiaryContainer = md_theme_dark_onTertiaryContainer,
        error = md_theme_dark_error,
        errorContainer = md_theme_dark_errorContainer,
        onError = md_theme_dark_onError,
        onErrorContainer = md_theme_dark_onErrorContainer,
        background = md_theme_dark_background,
        onBackground = md_theme_dark_onBackground,
        surface = md_theme_dark_surface,
        onSurface = md_theme_dark_onSurface,
        surfaceVariant = md_theme_dark_surfaceVariant,
        onSurfaceVariant = md_theme_dark_onSurfaceVariant,
        outline = md_theme_dark_outline,
        inverseOnSurface = md_theme_dark_inverseOnSurface,
        inverseSurface = md_theme_dark_inverseSurface,
        inversePrimary = md_theme_dark_inversePrimary,
    )

    val colors = if (isSystemInDarkTheme()) {
        darkColorPalette
    } else {
        lightColorPalette
    }
    MaterialTheme(
        colorScheme = colors
    ) {
        content()
    }
}


val md_theme_light_primary = Color(0xFF166d21)
val md_theme_light_onPrimary = Color(0xFFffffff)
val md_theme_light_primaryContainer = Color(0xFFa0f799)
val md_theme_light_onPrimaryContainer = Color(0xFF002202)
val md_theme_light_secondary = Color(0xFF52634e)
val md_theme_light_onSecondary = Color(0xFFffffff)
val md_theme_light_secondaryContainer = Color(0xFFd5e8ce)
val md_theme_light_onSecondaryContainer = Color(0xFF101f0f)
val md_theme_light_tertiary = Color(0xFF38656a)
val md_theme_light_onTertiary = Color(0xFFffffff)
val md_theme_light_tertiaryContainer = Color(0xFFbcebf0)
val md_theme_light_onTertiaryContainer = Color(0xFF011f22)
val md_theme_light_error = Color(0xFFba1b1b)
val md_theme_light_errorContainer = Color(0xFFffdad4)
val md_theme_light_onError = Color(0xFFffffff)
val md_theme_light_onErrorContainer = Color(0xFF410001)
val md_theme_light_background = Color(0xFFfcfdf6)
val md_theme_light_onBackground = Color(0xFF1a1c19)
val md_theme_light_surface = Color(0xFFfcfdf6)
val md_theme_light_onSurface = Color(0xFF1a1c19)
val md_theme_light_surfaceVariant = Color(0xFFdee5d8)
val md_theme_light_onSurfaceVariant = Color(0xFF424840)
val md_theme_light_outline = Color(0xFF73796f)
val md_theme_light_inverseOnSurface = Color(0xFFf1f1eb)
val md_theme_light_inverseSurface = Color(0xFF2f312d)
val md_theme_light_inversePrimary = Color(0xFF85da80)
val md_theme_light_shadow = Color(0xFF000000)

val md_theme_dark_primary = Color(0xFF85da80)
val md_theme_dark_onPrimary = Color(0xFF003907)
val md_theme_dark_primaryContainer = Color(0xFF00530d)
val md_theme_dark_onPrimaryContainer = Color(0xFFa0f799)
val md_theme_dark_secondary = Color(0xFFbaccb3)
val md_theme_dark_onSecondary = Color(0xFF253423)
val md_theme_dark_secondaryContainer = Color(0xFF3c4b39)
val md_theme_dark_onSecondaryContainer = Color(0xFFd5e8ce)
val md_theme_dark_tertiary = Color(0xFFa1cfd4)
val md_theme_dark_onTertiary = Color(0xFF00363b)
val md_theme_dark_tertiaryContainer = Color(0xFF1e4d52)
val md_theme_dark_onTertiaryContainer = Color(0xFFbcebf0)
val md_theme_dark_error = Color(0xFFffb4a9)
val md_theme_dark_errorContainer = Color(0xFF930006)
val md_theme_dark_onError = Color(0xFF680003)
val md_theme_dark_onErrorContainer = Color(0xFFffdad4)
val md_theme_dark_background = Color(0xFF1a1c19)
val md_theme_dark_onBackground = Color(0xFFe2e3dd)
val md_theme_dark_surface = Color(0xFF1a1c19)
val md_theme_dark_onSurface = Color(0xFFe2e3dd)
val md_theme_dark_surfaceVariant = Color(0xFF424840)
val md_theme_dark_onSurfaceVariant = Color(0xFFc2c8bd)
val md_theme_dark_outline = Color(0xFF8c9288)
val md_theme_dark_inverseOnSurface = Color(0xFF1a1c19)
val md_theme_dark_inverseSurface = Color(0xFFe2e3dd)
val md_theme_dark_inversePrimary = Color(0xFF166d21)
val md_theme_dark_shadow = Color(0xFF000000)