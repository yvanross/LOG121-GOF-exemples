# Collection Iterateur

|Nom dans le modèle de conception | Nom actuel |
|-|-|
|Aggregate| |                
|ConcreteAggregate| |
|Iterator| |
|ConcreteIterator| |
|createIterator()| |
|next()| |
|isDone()| |
|currentItem()| |

# Diagramme de classe

![Diagramme de classe](https://www.plantuml.com/plantuml/svg/XLJ9QiCm43rRNo5oIWFk1-HG4j9B3sbFXKBfGRQdYL8jHXg5Xf9_xyWhJcqNZ97Ul9bvizWRZy9Xq8e_Id5mGclW1V1S2U-1-IzfIa4eztXHG6ydyyXcN1e4zobou4zq41bPVrZ2SmS2eOBGkkNTkZOZ1CUkVxmYNBaTXN-6Rupyp5e5mX1e6kGbEq6EvCugMNmlTbOfWgGrvCtvVlksZg7fc5jTngZj7QCo4TeWxqJz85YSR201onhbbhAShInYWDa26WMl1hO17VGweenvP_8UaIzrgK23GT_tiQlJcfsIP8ij8gAJcYHtj63QOwj-j4DzeszprRAcAfgGLgz6H7IKbVWWpy9WLQccUs6D0UY6bYJqH5FRwjhUAEOicPh4_2fHh-U6SIKxeynJXC7oKIOR7DNGeLqnV6mnuw1lTpEvilzpZVP_i0shD1sV7HkPJoJFf6DZFkb3LTgQll4iu2oZQGfZ_HhUfquUZbXJgeM8WKem1PZyCYmb9TPYjQWxkI4A_JL-0G00 "Diagramme de classe")


# Code Plantuml pour le Rajout d'une Collection
@startuml Diagramme de classe
skinparam style strictuml
 interface Iterable {
	 createIterator(): Iterateur
}
 interface Iterateur {
	 hasNext(): boolean
	 next(): Object
}

class MaCollection {
  MAX: int
  compteur: int
  tableau: Object[MAX]
  ajouter(Object o): void
  createIterator(): Iterateur
}

class UneAutreCollection{
    createIterator(): Iterateur

}
class MaCollection implements Iterable 

class MonClient {
	imprimer(Iterable unIterable): void
}

class MaCollectionIterateur implements Iterateur

class UneAutreCollection implements Iterable 
class UneDeuxiemeCollection implements Iterable{
    createIterator() : Iterateur
}

 class Item {
		suivant: Item
		donnee: Object
		
		Item(Object donnee): void 
	ajouter(Object o): void
	 createIterator(): Iterateur
   }

class UneAutreCollection{}   
	
	class UneAutreCollectionIterateur {
		 courantIterateur: Item
		  hasNext(): boolean
     next(): Object
	}
class UneAutreCollectionIterateur implements Iterateur
class UneDeuxiemeCollectionIterateur implements Iterateur
MaCollection *-- MaCollectionIterateur
UneAutreCollection *-- UneAutreCollectionIterateur
UneDeuxiemeCollection *-- UneDeuxiemeCollectionIterateur

UneDeuxiemeCollection -> Item: debut
UneDeuxiemeCollection -> Item: courant
UneAutreCollection -> Item: debut
UneAutreCollection -> Item: courant

MonClient .-right-> Iterable: dependency
MaCollection --> "*" Item
@enduml

# Image de Diagramme de classe avec le rajout d'une Collection
![Diagramme de classe](http://www.plantuml.com/plantuml/svg/XLFDpjem43p7Jx7YH97I1-1GWU3I0-sfKgMg1oVPWgb_8lyWKCMxTvry3Wfo4eIGFJkpdlrXvpotFYW9Hy7FbYk5q23KaZk7pFqLkkM4WlCFYVHhHHtP38JsQF_m6k4h7NX5qN-iWDeYzzX1tjZrfotqPmoMFKUg17Uo2tVVyEuZlp968jS4wW_aUtN5sfESTRRWn0z6IeA4qQG6EEr_RcDgEjP6jJ5hklleZ8UKv1THVnFChoQGWNMFWg5NRaOq3EOBI0v-QDm7R_7b8zgO5vCwOr-eLg92xTshZqETHX-ae5Xi4H6jK6Hve0MTZibzjaE3Wz5R2SnND6rjO1ynt0Mg1K6-BV3Mr7xT8gPYgOKBuiQrxrYAxetH6Z7Da03wnb0QNnTFNG1MJ4ntOJq1O6x0JuepUdcAC5feUia4oxKVqA4Oo2qxqETztujdtipoJAU7jAGSxUQcBFERnCQE4ddEACkwYQe5dsn2MNxf6hg51glW5qXf6iduVA99Hih2Nl_CpwKLvuidIbhvcAX5tQ2k7-D-biHQRLRz8ko84fJy3m00 "Diagramme de classe")
# Diagramme de séquence
