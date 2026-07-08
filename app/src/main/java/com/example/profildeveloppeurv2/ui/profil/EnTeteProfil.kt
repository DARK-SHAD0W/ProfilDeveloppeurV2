package com.example.profildeveloppeurv2.ui.profil

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Place l'avatar et l'identite du developpeur sur une meme ligne.
@Composable
fun EnTeteProfil(
    profil: ProfilDeveloppeur,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        AvatarAvecBadge(
            initiales = "${profil.prenom.first()}${profil.nom.first()}".uppercase(),
            statutActif = true
        )
        Spacer(modifier = Modifier.width(12.dp))
        IdentiteDeveloppeur(
            nom = "${profil.prenom} ${profil.nom}",
            role = profil.role,
            modifier = Modifier.weight(1f)
        )
    }
}
