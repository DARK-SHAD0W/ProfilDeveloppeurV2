package com.example.profildeveloppeurv2.ui.profil

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.profildeveloppeurv2.ui.theme.ProfilDeveloppeurV2Theme

@Preview(
    showBackground = true,
    name = "Profil - Theme clair"
)
@Composable
fun PageProfilClairPreview() {
    ProfilDeveloppeurV2Theme(darkTheme = false) {
        PageProfil(profil = profilAhmed())
    }
}

@Preview(
    showBackground = true,
    name = "Profil - Theme sombre"
)
@Composable
fun PageProfilSombrePreview() {
    ProfilDeveloppeurV2Theme(darkTheme = true) {
        PageProfil(profil = profilAhmed())
    }
}
