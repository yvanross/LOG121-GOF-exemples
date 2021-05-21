# Container iterator

|Nom dans le modèle de conception | Nom actuel |
|-|-|
|Aggregate|Container|                
|ConcreteAggregate| NameRepository|
|Iterator| Iterator|
|ConcreteIterator| NameIterator|
|createIterator()| getIterator()|
|next()| next()|
|isDone()| hasNext()|
|currentItem()| next()|

# Diagramme de classe
![Diagramme de classe](README/Diagramme%20de%20classe.svg)

# Diagramme de séquence
![](README/Diagramme%20de%20sequence.svg)


# exercice à réaliser
- a partir du fichier NameRepositoryTest.java
	
1. Mettre le diagramme de classe à jour, ajouter les tests
1. Afficher par ordre alphabétique
1. Afficher par ordre alphabétique inversé en utilisant un itérateur qui parcours les donées à l'inverse
1. Ajouter plusieurs instance d'un même observateur qui sont identifé par leur nom et qui affichent les nom des personnes dans la console à chaque fois qu'il sont utilisés par l'itérateur dans la fonction next ou previous. 
   1. Vous devez faire deux version de la méthode update en utilisant la surcharge
       1. une version avec parametre
       2.  une version sans parametre
   2. dans les deux cas la sortie devrait correspondre à:
      1. observer1 next Robert  -> update avec les paramêtres
      2. observer1 next Robert  -> update sans paramètres
      3. observer2 next Robert 
