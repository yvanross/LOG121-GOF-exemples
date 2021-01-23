# Chat with multiple dialog using Observer pattern
# Table de correspondance


|Nom dans le modèle de conception | Nom actuel |
|-|-|
|Sujet| TextModel|            
|Observer| Observer|
|ConcreteObserver| TextViewA,<br>TextViewB   |
|attach()| addObserver(Observer)|
|notify()| update(Observable, Object)|

# Diagramme de classe

![dcl](README/Diagramme%20de%20classe.svg)


# Diagramme de séquence
![ds](README/DS.svg)