# Patron stratégie Comparateur
# Table de correspondance

|Nom dans le <br>modèle de conception | Nom actuel |
|-|-|
|Context| list<Employe> |
|Strategy| Comparator<Employe>|
|ConcreteStrategy| PrenomComparator,<br>SalaireComparator,<br>AgeComparator,<br>EmbaucheCoomparator |
|doWork()| compare(o1:Employ, o2:Employe): int|

# Diagramme de classe
![dcl](README/diagramme%20de%20classe.svg)
# Diagramme de séquence
![DS](README/DS-ComparatorDemo.svg)

