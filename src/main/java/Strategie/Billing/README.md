# Table de correspondance

|Nom dans le <br>modèle de conception | Nom actuel |
|-|-|
|Context| drinks |
|Strategy| BillinStrategy |
|ConcreteStrategy| normalStrategy(), happyHourStrategy() |
|doWork()| Opération polymorphe|

# Diagramme de classe
![DCL](README/DCL.svg)
# Diagramme de séquence
![DS](README/DS-StrategieDemo.svg)
# Questions auxquels il faut répondre
- Comment et quand applique t'on les stratégies
- Détail de printBill