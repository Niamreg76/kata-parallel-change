# Parallel Change Kata

## Parallel Change Késako ?
Également connu sous le nom d'expansion et de contraction, il s'agit d'un modèle qui peut être utilisé pour
faire évoluer une conception logicielle en introduisant des modifications rétrocompatibles sans interrompre
les clients du code existant.

Cela implique trois étapes :
- **développer** (ajouter le nouvel élément - classe, méthode, variable)
- **migrer** (les clients de l'élément existant doivent utiliser le nouvel élément introduit à l'étape 1)
- **contrat** (supprimer l'ancien élément - classe, méthode, variable)

## Votre boulot
À l’aide de Parallel Change, modifiez la classe `ShoppingCart` pour gérer plusieurs `int` au lieu
d’un seul.

Des tests ont déjà été écrits.

## Règles
Les tests ne doivent à aucun moment être rouges. Aucune erreur de compilation, aucun échec.
(La seule exception concerne un timeout de quelques secondes pendant que vous écrivez une ligne de code.)
