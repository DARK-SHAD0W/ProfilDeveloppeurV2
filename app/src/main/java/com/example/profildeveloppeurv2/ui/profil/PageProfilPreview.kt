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
    name = "Sofia - Theme clair"
)
@Composable
fun PageProfilSofiaClairPreview() {
    ProfilDeveloppeurV2Theme(darkTheme = false) {
        PageProfil(profil = profilSofia())
    }
}

@Preview(
    showBackground = true,
    name = "Sofia - Theme sombre"
)
@Composable
fun PageProfilSofiaSombrePreview() {
    ProfilDeveloppeurV2Theme(darkTheme = true) {
        PageProfil(profil = profilSofia())
    }
}
