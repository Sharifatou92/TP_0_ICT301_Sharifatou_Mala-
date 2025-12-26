# TP 0 – Principes SOLID_ sharifatou- Malaï

# TP 0 – Principes SOLID (ICT 301)

## Informations de l’étudiante
- **Nom :** Sharifatou  
- **Prénom :** Malai  
- **Matricule :** 0000  
- **UE :** ICT 301 
- **Enseignants :** Dr Monthe, Mr Dave 

## Présentation du travail

Ce dépôt contient le travail pratique portant sur les **principes SOLID**, réalisé dans le cadre de l’UE ICT 301.  
Pour chaque principe, un exemple **avant refactoring** (ne respectant pas le principe) et un exemple **après refactoring** (respectant le principe) ont été implémentés, conformément au support de cours.

Les principes étudiés sont :
- SRP
- OCP
- LSP
- ISP
- DIP

Un **fichier PDF unique** à la racine du dépôt présente les explications théoriques et les diagrammes de classes associés.


## Ce que j’ai compris des principes SOLID

### SRP – Single Responsibility Principle
Une classe ne doit avoir qu’une seule responsabilité.  
Dans l’exemple du livre, les responsabilités ont été séparées en plusieurs classes : gestion des données, affichage, sauvegarde et logique métier.


### OCP – Open Closed Principle
Les entités logicielles doivent être ouvertes à l’extension mais fermées à la modification.  
L’utilisation d’interfaces et du polymorphisme permet d’ajouter de nouvelles fonctionnalités sans modifier le code existant.


### LSP – Liskov Substitution Principle
Une classe dérivée doit pouvoir remplacer sa classe mère sans modifier le comportement attendu du programme.  
Par exemple, un carré ne doit pas hériter directement d’un rectangle si cela entraîne un comportement incorrect.


### ISP – Interface Segregation Principle
Une classe ne doit pas être obligée d’implémenter des méthodes qu’elle n’utilise pas.  
Par exemple, un robot ne doit pas implémenter une méthode `eat()` s’il ne mange pas.


### DIP – Dependency Inversion Principle
Les modules de haut niveau doivent dépendre d’abstractions et non de classes concrètes.  
Ainsi, les classes doivent dépendre d’interfaces plutôt que d’implémentations spécifiques, comme une base de données particulière.


## Conclusion

L’application des principes SOLID permet d’améliorer la maintenabilité, la flexibilité et la qualité du code.  
Ce travail m’a permis de mieux comprendre l’importance du refactoring dans la conception logicielle.
