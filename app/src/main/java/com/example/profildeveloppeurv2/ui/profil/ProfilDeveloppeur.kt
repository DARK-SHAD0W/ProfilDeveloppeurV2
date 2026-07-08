package com.example.profildeveloppeurv2.ui.profil

// Une experience professionnelle ou un projet, affiche via ProjectCard.
data class ExperienceProjet(
    val titre: String,
    val periode: String,
    val description: String
)

// Donnees completes du profil, remplace les parametres epars de l'ancienne CarteProfil.
data class ProfilDeveloppeur(
    val nom: String,
    val role: String,
    val description: String,
    val competences: List<String>,
    val experiences: List<ExperienceProjet>,
    val email: String,
    val localisation: String,
    val disponibilite: String
)

// Donnees locales reelles (voir CV), simulent une source de donnees pour ce devoir.
fun profilAhmed(): ProfilDeveloppeur {
    return ProfilDeveloppeur(
        nom = "Ahmed Yahya Letaief",
        role = "Développeur Fullstack — Vue.js / Django · M1 Architecture Logicielle",
        description = "Développeur fullstack en alternance chez SOCOTEC.IO, actuellement en " +
            "Master Architecture des Logiciels à l'ESGI Lyon. Passionné par l'IA, la robotique " +
            "et le développement logiciel.",
        competences = listOf(
            "Vue.js", "Django", "Python", "TypeScript", "PostgreSQL", "Docker", "REST API", "Git"
        ),
        experiences = listOf(
            ExperienceProjet(
                titre = "Développeur Fullstack en alternance",
                periode = "SOCOTEC.IO · 2025-Présent",
                description = "Développement fullstack d'applications internes : migrations " +
                    "Vue 2 vers Vue 3, évolution de microservices Django REST Framework, " +
                    "intégrations d'APIs externes et de workflows IA."
            ),
            ExperienceProjet(
                titre = "Stage Calcul Haute Performance et IA",
                periode = "KAUST · 2024-Présent (à distance)",
                description = "Algorithmes de multiplication de matrices en précision mixte " +
                    "(tensor cores), optimisation en Julia des transferts CPU-GPU, fine-tuning " +
                    "de LLM et benchmarking de modèles."
            ),
            ExperienceProjet(
                titre = "Portfolio personnel",
                periode = "Projet personnel · Avril 2025",
                description = "Portfolio développé avec React et Vite pour le frontend, " +
                    "Node et Express pour le backend, MongoDB pour la persistance."
            )
        ),
        email = "letaiefahmedyahya@gmail.com",
        localisation = "Auvergne-Rhône-Alpes",
        disponibilite = "En alternance chez SOCOTEC.IO"
    )
}
