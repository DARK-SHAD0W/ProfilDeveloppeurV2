package com.example.profildeveloppeurv2.ui.profil

// Une experience professionnelle ou un projet, affiche via ProjectCard.
data class ExperienceProjet(
    val titre: String,
    val periode: String,
    val description: String
)

// Un lien professionnel (reseau, code, portfolio), affiche via LienProfessionnelChip.
data class LienProfessionnel(
    val label: String,
    val url: String
)

// Un diplome ou une formation, affiche via FormationCard.
data class Formation(
    val diplome: String,
    val etablissement: String,
    val periode: String
)

// Une langue et son niveau (sur 5), affiche via LangueItem avec des etoiles.
data class Langue(
    val nom: String,
    val niveauLabel: String,
    val niveauEtoiles: Int
)

// Donnees completes du profil, remplace les parametres epars de l'ancienne CarteProfil.
// prenom et nom sont separes pour pouvoir en tirer les initiales de l'avatar (AvatarAvecBadge).
data class ProfilDeveloppeur(
    val prenom: String,
    val nom: String,
    val role: String,
    val description: String,
    val competences: List<String>,
    val experiences: List<ExperienceProjet>,
    val email: String,
    val telephone: String,
    val localisation: String,
    val disponibilite: String,
    val liensProfessionnels: List<LienProfessionnel>,
    val formations: List<Formation>,
    val langues: List<Langue>
)

// Donnees locales reelles (voir CV), simulent une source de donnees pour ce devoir.
fun profilAhmed(): ProfilDeveloppeur {
    return ProfilDeveloppeur(
        prenom = "Ahmed",
        nom = "Letaief",
        role = "Développeur Fullstack, Vue.js / Django, M1 Architecture Logicielle",
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
        telephone = "+33 6 04 48 86 09",
        localisation = "Auvergne-Rhône-Alpes",
        disponibilite = "En alternance chez SOCOTEC.IO",
        liensProfessionnels = listOf(
            LienProfessionnel(label = "LinkedIn", url = "linkedin.com"),
            LienProfessionnel(label = "GitHub", url = "github.com/DARK-SHAD0W"),
            LienProfessionnel(label = "Portfolio", url = "portfolio")
        ),
        formations = listOf(
            Formation(
                diplome = "Master Architecture des Logiciels",
                etablissement = "ESGI, Lyon",
                periode = "2025-2027"
            ),
            Formation(
                diplome = "Licence Informatique",
                etablissement = "Université Clermont Auvergne, Aubière",
                periode = "2021-2025"
            )
        ),
        langues = listOf(
            Langue(nom = "Français", niveauLabel = "Bilingue", niveauEtoiles = 5),
            Langue(nom = "Anglais", niveauLabel = "Courant (TOEIC C1)", niveauEtoiles = 4),
            Langue(nom = "Arabe", niveauLabel = "Langue maternelle", niveauEtoiles = 5)
        )
    )
}

// Second profil, fictif, pour montrer que l'ecran s'adapte a des donnees differentes
// (comme les deux previews de l'ancienne CarteProfil).
fun profilIrina(): ProfilDeveloppeur {
    return ProfilDeveloppeur(
        prenom = "Irina",
        nom = "Karlovna",
        role = "Développeuse Full-Stack, freelance",
        description = "Développeuse freelance depuis 3 ans, à l'aise aussi bien côté serveur " +
            "que sur les interfaces web et mobiles. Disponible pour de nouvelles missions.",
        competences = listOf(
            "Kotlin", "Node.js", "PostgreSQL", "React", "AWS", "GraphQL"
        ),
        experiences = listOf(
            ExperienceProjet(
                titre = "Développeuse freelance",
                periode = "Indépendante · 2023-Présent",
                description = "Développement d'applications web et mobiles pour plusieurs " +
                    "clients, de la conception à la mise en production."
            ),
            ExperienceProjet(
                titre = "Développeuse Backend",
                periode = "StartupCo · 2021-2023",
                description = "Conception d'une API GraphQL et migration de l'infrastructure " +
                    "vers AWS pour une application SaaS."
            )
        ),
        email = "irina.karlovna@example.com",
        telephone = "+33 6 12 34 56 78",
        localisation = "Paris, France",
        disponibilite = "Non disponible actuellement",
        liensProfessionnels = listOf(
            LienProfessionnel(label = "LinkedIn", url = "linkedin.com"),
            LienProfessionnel(label = "GitHub", url = "github.com"),
            LienProfessionnel(label = "Portfolio", url = "portfolio")
        ),
        formations = listOf(
            Formation(
                diplome = "Master Informatique",
                etablissement = "Université Paris-Saclay",
                periode = "2018-2020"
            )
        ),
        langues = listOf(
            Langue(nom = "Russe", niveauLabel = "Langue maternelle", niveauEtoiles = 5),
            Langue(nom = "Anglais", niveauLabel = "Courant", niveauEtoiles = 4),
            Langue(nom = "Français", niveauLabel = "Intermédiaire", niveauEtoiles = 3)
        )
    )
}
