# Patron décorateur
référence: https://en.wikipedia.org/wiki/Decorator_pattern#Second_example_.28coffee_making_scenario.29


```plantuml
skinparam Style strictuml

Interface Coffee <<Interface>>{
    getCost(): double
    getIngredients(): String
}
class SimpleCoffe implements Coffee{
    getCost(): double
    getIngredients(): String
}

class CoffeeDecorator <<Abstract>>{
    getCost(): double
    getIngredient(): String
}
CoffeeDecorator .-up-|> Coffee: implement
CoffeeDecorator -->  "1" Coffee: Decorate

class WithMilk extends CoffeeDecorator
class WithSprinkles extends CoffeeDecorator


```