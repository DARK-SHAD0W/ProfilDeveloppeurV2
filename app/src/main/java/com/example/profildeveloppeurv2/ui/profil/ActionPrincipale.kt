package com.example.profildeveloppeurv2.ui.profil

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

// Action principale de l'ecran. Le clic n'effectue pas de vraie action pour ce devoir.
@Composable
fun ActionPrincipale(
    texte: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier.fillMaxWidth()
    ) {
        Text(text = texte)
    }
}
