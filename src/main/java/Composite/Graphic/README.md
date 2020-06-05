 ```plantuml
@startuml
skinparam style strictuml
interface Graphic {
  print(): void 
}
class Ellipse implements Graphic{
    print(): void 
}
class CompositeGraphic implements Graphic{
      print(): void 

}
CompositeGraphic *-- Graphic : composed of 
@enduml
```

```plantuml
@startuml
skinparam style strictuml
participant CompositeDemo as m
participant "ellipse1:Ellipse" as e1
participant "ellipse1:Ellipse" as e2
participant "ellipse1:Ellipse" as e3
participant "ellipse1:Ellipse" as e4
participant "graphic2:CompositeGraphic"  as g2 <<Graphic>>
participant "graphic2:CompositeGraphic"  as g3 <<Graphic>>
participant "graphic2:CompositeGraphic"  as g1 <<Graphic>>
->m: main()
m-->e1**: create
m-->e2**: create
m-->e3**: create
m-->e4**: create
m-->g2**: create
m->g2: add(ellipse1)
m->g2: add(ellipse2)
m->g2: add(ellipse3)
m-->g3**: create
m->g3: add(ellipse4)

m-->g1**: create
m->g1: add(graphic2)
m->g1: add(graphic3)
m->g1: add(ellipse1)
m->g1: print()

@enduml
```