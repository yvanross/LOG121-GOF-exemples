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

![](README/Diagramme%20de%20classe.svg)
# Diagramme de séquence

![](README/Diagramme%20de%20sequence.svg)