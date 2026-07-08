package com.example.profildeveloppeurv2.ui.profil

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.StarBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.profildeveloppeurv2.ui.theme.EtoileJaune

// Notation en etoiles (sur 5), comme dans ProductRating au TP4 : etoiles pleines en jaune,
// le reste en contour, pour visualiser un niveau sans avoir a lire un chiffre.
@Composable
fun NotationEtoiles(
    niveau: Int,
    surCombien: Int = 5,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier) {
        repeat(surCombien) { index ->
            Icon(
                imageVector = if (index < niveau) Icons.Filled.Star else Icons.Filled.StarBorder,
                contentDescription = null,
                tint = EtoileJaune
            )
        }
    }
}

// Une langue et son niveau, affichee via une notation en etoiles.
@Composable
fun LangueItem(
    langue: Langue,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.padding(end = 12.dp)) {
            Text(
                text = langue.nom,
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = langue.niveauLabel,
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.secondary
            )
        }
        NotationEtoiles(niveau = langue.niveauEtoiles)
    }
}
