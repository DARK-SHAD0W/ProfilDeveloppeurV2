# Profil Développeur V2

Amélioration UI de l'application « Profil développeur » : une fiche de profil développeur plus
complète et plus professionnelle, construite avec Jetpack Compose. Cette version reprend et fait
évoluer le projet [`Compose-Profil-Developpeur`](https://github.com/DARK-SHAD0W/Compose-Profil-Developpeur)
(premier devoir, laissé intact pour sa propre notation) dans un tout nouveau dépôt, en réutilisant
les notions vues dans le chapitre Compose UI : composants fondamentaux, layouts Compose, listes
modernes, cartes réutilisables, Material Design 3 et thème clair/sombre.

Le profil affiché est celui d'Ahmed Yahya Letaief, développeur fullstack en alternance chez
SOCOTEC.IO et étudiant en Master Architecture des Logiciels à l'ESGI Lyon — des données réelles,
toutes locales (aucun appel réseau, aucune base de données).

## Composants Compose fondamentaux utilisés

- `Text` — titres, descriptions, informations (nom, rôle, expériences, formations...)
- `Button` — action principale ("Télécharger le CV")
- `Icon` — accompagne les champs de contact (email, téléphone, localisation), le badge de statut
  et les liens professionnels
- `Image` — avatar placeholder, découpé en cercle
- `Card` — regroupe chaque expérience/projet (`ProjectCard`) et chaque formation (`FormationCard`)
- `OutlinedTextField` en lecture seule — email, téléphone et localisation dans `ZoneContact`

## Layouts utilisés

- `Column` — structure verticale de l'écran et de chaque section
- `Row` — aligne l'avatar et l'identité du développeur (`EnTeteProfil`), et l'icône avec le libellé
  de chaque lien professionnel
- `Box` — superpose le badge de statut sur l'avatar (`AvatarAvecBadge`)
- `Spacer` — espace entre l'avatar et le bloc identité
- `Surface` — zones visuelles cohérentes avec le thème : puces de compétences, badge de statut,
  zone de contact, liens professionnels

## Listes modernes (LazyColumn / LazyRow)

L'écran entier (`PageProfil`) est une seule `LazyColumn` : elle contient aussi bien des éléments
uniques (`item { ... }` pour l'en-tête, la description, les titres de section) que des collections
(`items(...)` pour les expériences et les formations). C'est le même principe que pour un catalogue
de produits : afficher un nombre variable d'éléments sans avoir à connaître leur nombre à l'avance,
avec une carte réutilisable par élément (`ProjectCard`, `FormationCard`).

Deux `LazyRow` complètent l'écran pour des collections **horizontales** : la liste des compétences
(`CompetencesSection`, une `CompetenceChip` par compétence) et la liste des liens professionnels
(`LiensProfessionnelsSection`, une `LienProfessionnelChip` par lien). Utiliser une liste horizontale
ici évite de saturer la hauteur de l'écran pour des éléments courts et répétitifs.

## Choix de thème

Le thème (`ProfilDeveloppeurV2Theme`) personnalise les trois piliers de Material Design 3 :

- **`ColorScheme`** : une palette claire et une palette sombre définies explicitement (`primary`,
  `onPrimary`, `secondary`, `background`, `onBackground`, `surface`, `onSurface`), reprise du
  thème construit dans les TP4-7 (Product Explorer) pour rester cohérente avec le reste du travail
  du cours plutôt que d'introduire une nouvelle palette.
- **`Shapes`** : des coins arrondis personnalisés (`small` à `extraLarge`), utilisés notamment par
  les puces de compétences et le badge de statut.
- **`Typography`** : une hiérarchie de styles personnalisée (`titleLarge`, `titleMedium`,
  `bodyMedium`, `labelLarge`, `labelMedium`) pour distinguer clairement titres, textes et libellés.

Deux previews dédiées (`PageProfilClairPreview` et `PageProfilSombrePreview`) affichent le même
écran dans les deux thèmes, pour vérifier que tout reste lisible dans les deux cas.

## Structure du projet

```
app/src/main/java/com/example/profildeveloppeurv2/
├── MainActivity.kt                    # Activity : thème + Scaffold
└── ui/
    ├── profil/
    │   ├── ProfilDeveloppeur.kt       # ProfilDeveloppeur, ExperienceProjet, LienProfessionnel,
    │   │                               # Formation + profilAhmed() (données locales reelles)
    │   ├── PageProfil.kt              # écran principal, LazyColumn
    │   ├── EnTeteProfil.kt            # Row : avatar + identité
    │   ├── AvatarAvecBadge.kt         # Box : avatar (Image) + badge de statut
    │   ├── IdentiteDeveloppeur.kt     # nom + rôle
    │   ├── CompetencesSection.kt      # CompetenceChip + LazyRow
    │   ├── ProjectCard.kt             # carte réutilisable : expérience / projet
    │   ├── FormationCard.kt           # carte réutilisable : diplôme / formation
    │   ├── ZoneContact.kt             # OutlinedTextField en lecture seule (email, tél., lieu)
    │   ├── LiensProfessionnelsSection.kt  # LienProfessionnelChip + LazyRow
    │   ├── ActionPrincipale.kt        # bouton d'action principal
    │   └── PageProfilPreview.kt       # previews claire et sombre
    └── theme/
        ├── Color.kt                  # palettes claire / sombre
        ├── Theme.kt                  # ColorScheme + Shapes personnalisées
        └── Type.kt                   # Typography personnalisée
```

## Aperçu

<p align="center">
  <img src="capture/ProfilClair.png" alt="Profil développeur, thème clair" width="300">
  <img src="capture/ProfilSombre.png" alt="Profil développeur, thème sombre" width="300">
</p>

## Quelles notions du chapitre Compose UI avez-vous réutilisées dans cette application ?

L'ensemble du chapitre : les composants fondamentaux (`Text`, `Button`, `Icon`, `Image`, `Card`,
`OutlinedTextField`) pour afficher chaque information avec le bon niveau d'importance ; les layouts
(`Column`, `Row`, `Box`, `Spacer`, `Surface`) pour structurer l'écran plutôt que d'empiler du texte
brut ; les listes modernes (`LazyColumn`, `LazyRow`, `items`) pour afficher des collections de
taille variable (compétences, expériences, formations, liens) avec des cartes réutilisables plutôt
que des `Column` figées ; et Material Design 3 (`ColorScheme`, `Shapes`, `Typography`, thème
clair/sombre) pour obtenir une identité visuelle cohérente sans redessiner chaque composant. C'est
aussi ce dernier point qui a le plus changé par rapport à la première version : là où l'ancienne
application posait une couleur de fond différente sur chaque `Surface` à la main, celle-ci passe
par les rôles du thème (`primary`, `secondary`, `background`, `surface`...), ce qui rend
l'ensemble cohérent et capable de s'adapter automatiquement au mode sombre.
