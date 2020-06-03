# Quiz #2 Patron décorateur
1. Vous devez compléter le/les test(s) dans la classe RepasTest
1. repas.getCost() doit nécessairement utiliser un Itérateur 
2. Faire un diagramme de séquence de la fonction repasTest() en excluant les assert
3. Ajouter le détail de l'opération getCost() sur le mozzarella dans votre diagramme de séquence et démontrer la mécanique de décoration.
4. Ajouter le détail de l'opération repas.getCost() dans votre diagramme de séquence.
5. Insérer votre diagramme UML dans ce fichier

  
Voici un exemple de diagramme de séquence avec plantUML

```plantuml
skinparam style strictuml
participant ":RepasTest" as repasTest <<C, xx>>
participant "repas:Repas" as repas <<IIngredient>>
participant "pizza:Pizza" as pizza <<IIngredient>>
participant "patate:Patate" as patate <<classe>>
participant "citron[i]:Citron" as citron
-> repasTest: repasTest()
repasTest --> pizza**: create(10,"Pizzaxxx")
repasTest --> repas**: create(10,"Pizzaxxx")
repas -> patate : ajouter x

loop [condition]

repasTest -> citron: getTotal()
activate citron
citron -> citron : getCostA()
activate citron
citron -> banane : getCostB()
deactivate citron
citron -> orange: getCostC()
deactivate citron

end


```