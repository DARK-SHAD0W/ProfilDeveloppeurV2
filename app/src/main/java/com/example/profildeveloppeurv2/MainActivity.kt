package com.example.profildeveloppeurv2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.profildeveloppeurv2.ui.profil.PageProfil
import com.example.profildeveloppeurv2.ui.profil.profilAhmed
import com.example.profildeveloppeurv2.ui.theme.ProfilDeveloppeurV2Theme

// Active le thème puis affiche PageProfil dans un Scaffold.
// Aperçus (@Preview) : voir PageProfilPreview.kt dans ui/profil.
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfilDeveloppeurV2Theme {
                // innerPadding = padding externe fourni par le Scaffold (barres système).
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PageProfil(
                        profil = profilAhmed(),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
