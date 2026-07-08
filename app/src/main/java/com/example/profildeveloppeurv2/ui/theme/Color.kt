package com.example.profildeveloppeurv2.ui.theme

import androidx.compose.ui.graphics.Color

// Palette claire : vert (primary, repris du theme Product Explorer TP7) + bleu standard
// (secondary). Tous les roles utilises dans l'app sont definis explicitement, y compris
// les "container", pour eviter que Material3 ne retombe sur sa palette rose par defaut.
val PrimaireClair = Color(0xFF006C4C)
val OnPrimaireClair = Color.White
val PrimaireContainerClair = Color(0xFFB6F2D6)
val OnPrimaireContainerClair = Color(0xFF00210F)
val SecondaireClair = Color(0xFF1565C0)
val OnSecondaireClair = Color.White
val SecondaireContainerClair = Color(0xFFD3E3FF)
val OnSecondaireContainerClair = Color(0xFF001B3F)
val FondClair = Color(0xFFF7FBF6)
val OnFondClair = Color(0xFF191C1A)
val SurfaceClaire = Color(0xFFFFFFFF)
val OnSurfaceClaire = Color(0xFF191C1A)
val SurfaceVariantClaire = Color(0xFFDDE4E1)
val OnSurfaceVariantClaire = Color(0xFF414944)
val OutlineClair = Color(0xFF71787E)
val OutlineVariantClaire = Color(0xFFC1C9C4)

// Palette sombre : mêmes rôles, contrastes pensés pour le mode sombre (containers foncés
// et desatures, pas juste l'inverse des couleurs claires).
val PrimaireSombre = Color(0xFF7DDBB0)
val OnPrimaireSombre = Color(0xFF003826)
val PrimaireContainerSombre = Color(0xFF00522F)
val OnPrimaireContainerSombre = Color(0xFF97F8C4)
val SecondaireSombre = Color(0xFFA9C7FF)
val OnSecondaireSombre = Color(0xFF00305F)
val SecondaireContainerSombre = Color(0xFF004689)
val OnSecondaireContainerSombre = Color(0xFFD3E3FF)
val FondSombre = Color(0xFF101411)
val OnFondSombre = Color(0xFFE0E4DF)
val SurfaceSombre = Color(0xFF1C211D)
val OnSurfaceSombre = Color(0xFFE0E4DF)
val SurfaceVariantSombre = Color(0xFF414944)
val OnSurfaceVariantSombre = Color(0xFFC1C9C4)
val OutlineSombre = Color(0xFF8B938D)
val OutlineVariantSombre = Color(0xFF414944)

// Fonds clairs utilisés directement sur des Surface, un par composable,
// pour que chaque section de la fiche soit visuellement distincte.
val FondCarte = Color(0xFFDBDDDE)
val FondCompetence = Color(0xFFD3E8D0)
val FondBadgeDisponibilite = Color(0xFFE6D8B8)
