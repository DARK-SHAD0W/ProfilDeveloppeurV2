package com.example.profildeveloppeurv2.ui.profil

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.profildeveloppeurv2.ui.theme.ProfilDeveloppeurV2Theme

@Preview(
    showBackground = true,
    name = "Ahmed - Theme clair"
)
@Composable
fun PageProfilAhmedClairPreview() {
    ProfilDeveloppeurV2Theme(darkTheme = false) {
        PageProfil(profil = profilAhmed())
    }
}

@Preview(
    showBackground = true,
    name = "Ahmed - Theme sombre"
)
@Composable
fun PageProfilAhmedSombrePreview() {
    ProfilDeveloppeurV2Theme(darkTheme = true) {
        PageProfil(profil = profilAhmed())
    }
}

@Preview(
    showBackground = true,
    name = "Irina - Theme clair"
)
@Composable
fun PageProfilIrinaClairPreview() {
    ProfilDeveloppeurV2Theme(darkTheme = false) {
        PageProfil(profil = profilIrina())
    }
}

@Preview(
    showBackground = true,
    name = "Irina - Theme sombre"
)
@Composable
fun PageProfilIrinaSombrePreview() {
    ProfilDeveloppeurV2Theme(darkTheme = true) {
        PageProfil(profil = profilIrina())
    }
}
