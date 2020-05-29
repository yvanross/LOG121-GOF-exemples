# Quiz #2 Patron décorateur
1. Vous devez compléter le/les test(s) dans la classe RepasTest
1. repas.getCost() doit nécessairement utiliser un Itérateur 
2. Faire un diagramme de séquence de la fonction repasTest() en excluant les assert
3. Ajouter le détail de l'opération pizza.getCost() du test assertEquals(11,pizza.getCost(),0.001); dans votre diagramme de séquence
4. Insérer votre diagramme UML dans ce fichier
5. Générer README.pdf
  


```plantuml
skinparam style strictuml
participant ":RepasTest" as repasTest <<C, xx>>
participant "repas:Repas" as repas <<IIngredient>>
participant "pizza:Pizza" as pizza <<IIngredient>>


-> repasTest: repasTest()
repasTest -> pizza**: create(10,"Pizzaxxx")
repasTest -> repas**: create(10,"Pizzaxxx")


```