package com.example.profildeveloppeurv2.ui.profil

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Une formation ou un diplome, affiche sous forme de carte reutilisable.
@Composable
fun FormationCard(
    formation: Formation,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = formation.diplome,
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = formation.etablissement,
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = formation.periode,
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.secondary
            )
        }
    }
}
