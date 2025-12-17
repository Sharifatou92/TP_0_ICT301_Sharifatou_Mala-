# TP_0_ICT301_Sharifatou_Mala-
TP 0 - Principes SOLID (ICT301)
# TP 0 - ICT301

Nom : Sharifatou
Prénom : Malai
Matricule : 0000

## Ce que j’ai compris des principes SOLID

### SRP
Une classe ne doit avoir qu’une seule responsabilité. Par exemple, dans l’exemple du livre, on sépare la gestion des données, l’affichage, la sauvegarde et la logique métier.

### OCP
On doit pouvoir ajouter de nouvelles fonctionnalités sans modifier le code existant. Cela peut être réalisé avec des interfaces et du polymorphisme.

### LSP
Une classe fille doit respecter le contrat de la classe mère. Par exemple, un carré ne doit pas hériter directement de la classe rectangle, mais doit plutôt l’utiliser.

### ISP
Une classe ne doit pas être obligée d’implémenter des méthodes qu’elle n’utilise pas. Par exemple, un robot ne doit pas implémenter une méthode `eat()`.

### DIP
Les modules de haut niveau doivent dépendre des abstractions, pas des détails c'est a dire Les classes doivent dépendre d’interfaces et non de classes concrètes.
Par exemple, au lieu de dépendre directement d’une base de données spécifique, on utilise une interface.
