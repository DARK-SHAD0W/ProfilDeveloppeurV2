package com.example.profildeveloppeurv2.ui.profil

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Nom et rôle du développeur, sur un fond bleu (secondaryContainer) aux coins arrondis.
@Composable
fun IdentiteDeveloppeur(
    nom: String,
    role: String,
    modifier: Modifier = Modifier
) {
    Surface(
        color = MaterialTheme.colorScheme.secondaryContainer,
        shape = MaterialTheme.shapes.medium,
        modifier = modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text(
                text = nom,
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = role,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}
