package com.example.profildeveloppeurv2.ui.profil

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Écran principal : assemble toutes les sections du profil dans une seule LazyColumn.
@Composable
fun PageProfil(
    profil: ProfilDeveloppeur,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            EnTeteProfil(profil = profil)
        }

        item {
            Text(
                text = profil.description,
                style = MaterialTheme.typography.bodyMedium
            )
        }

        item {
            CompetencesSection(competences = profil.competences)
        }

        item {
            Text(
                text = "Expériences",
                style = MaterialTheme.typography.titleMedium
            )
        }

        items(
            items = profil.experiences,
            key = { experience -> experience.titre }
        ) { experience ->
            ProjectCard(experience = experience)
        }

        item {
            ZoneContact(
                email = profil.email,
                localisation = profil.localisation
            )
        }
    }
}
