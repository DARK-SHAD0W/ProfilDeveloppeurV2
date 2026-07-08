package com.example.profildeveloppeurv2.ui.profil

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Link
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Un lien professionnel, sous forme de puce cliquable (pas de vraie navigation pour ce devoir).
@Composable
fun LienProfessionnelChip(
    lien: LienProfessionnel,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier,
        shape = MaterialTheme.shapes.medium,
        color = MaterialTheme.colorScheme.surfaceVariant,
        onClick = onClick
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Link,
                contentDescription = null
            )
            Text(
                text = lien.label,
                style = MaterialTheme.typography.labelLarge,
                modifier = Modifier.padding(start = 8.dp)
            )
        }
    }
}

// Liste horizontale des liens professionnels (LinkedIn, GitHub, portfolio...).
@Composable
fun LiensProfessionnelsSection(
    liens: List<LienProfessionnel>,
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(liens) { lien ->
            LienProfessionnelChip(
                lien = lien,
                onClick = {
                    // Callback vide : pas de vraie navigation pour ce devoir.
                }
            )
        }
    }
}
