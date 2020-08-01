# Patron Strategy - Animal

```plantuml
@startuml

class Client

class Animal{
    + flyingType: Flys
    + tryToFly(): String
    + setFlyingAbility( flyingType: Flys ): void
}
class Bird {
+Bird()
}
class Dog extends Animal {
+Dog()
}
class ItFlys{
    + fly(): String
}
class CantFly implements Flys{
    + fly(): String
}


interface Flys{
    fly(): void
}

ItFlys ..|> Flys : Interface realization
Animal -* Flys:composition
Bird -|> Animal :generalization

Client -- Animal

note bottom of Bird : Bird( ) { flyingType = new ItsFly; }\n*Add Polymorphism to strategy\n   pattern

note left of ItFlys : fly( ) { return "itsFlys"; }

note left of Client :  Animal tweety = new Bird ()\ntweety.tryToFly()

@enduml
```
