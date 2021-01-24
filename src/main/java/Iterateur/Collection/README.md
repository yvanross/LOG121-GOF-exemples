# Collection Iterateur

|Nom dans le modèle de conception | Nom actuel |
|-|-|
|Aggregate| MonClient |                
|ConcreteAggregate| MaCollection, <br>UneAutreCollection |
|Iterator| Iterateur|
|ConcreteIterator| UneAutreCollectionIterateur, <br>MaCollectionIterateur|
|createIterator()| createIterator()|
|next()|  next()|
|isDone()|  n/a |
|currentItem()| hasNext()|

# Diagramme de classe


![DCL](README/Diagramme%20de%20classe.svg)


# Diagramme de séquence


# Test
- [CollectionTest](../../../../test/java/Iterateur/CollectionTest.java)