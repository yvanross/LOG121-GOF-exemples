# Patron Médiateur avec intégration Observateur

```plantuml
@startuml
class Mediator<T>
class Storage<T> 
class MediatorDemo 

Mediator "1" -right->  "*" Storage: hasmap(storagename,Storage)
MediatorDemo -right-> Mediator
Mediator "1" -up-> "*" Consumer: observers
@enduml
```

```plantuml
@startuml
skinparam style strictuml
participant MediatorDemo 
participant Mediator
participant ":Map<String,Storage" as MSS
participant "bob:Storage" as Bob
participant "alice:Storage" as Alice
participant "observers[i]:List<Consumer<String>>" as LC

MediatorDemo -> Mediator**: create()
Mediator -> MSS**: create()
Mediator -> LC**: create()
MediatorDemo -> Mediator: setValue("bob",20)
activate Mediator
Mediator -> MSS: bob = computeIfAbsent("bob")
Mediator -> Bob: setValue(this,"bob", 20)
deactivate Mediator

MediatorDemo -> Mediator: setValue("alice",24)
activate Mediator
Mediator -> MSS: alice = computeIfAbsent("alice")
Mediator -> Alice: setValue(this,"alice", 24)
deactivate Mediator

MediatorDemo-> Mediator: getValue("alice")
activate Mediator
Mediator -> MSS: alice = get("alice")
Mediator -> Alice: age = ifPresent("age")
alt ["age != null"]
Mediator -> System.out: println("age for alice: 24")
end
deactivate Mediator

MediatorDemo -> Mediator: addObserver("bob",anonymousDisplayFunction()) 
Mediator -> LC: add({observer.run})

MediatorDemo->Mediator: setValue("bob", 21);
activate Mediator

Mediator -> Mediator: bob =  getStorate(storagename)
activate Mediator
Mediator -> Bob: setValue(this,"bob", 21)

deactivate Mediator
activate Bob

Bob -> Mediator: notifyObservers("bob")
deactivate Bob
loop 
Mediator --> LC: accept()

end
activate Mediator
Mediator -> Mediator: anonymousDisplayFunction("bob")
activate Mediator
Mediator -> Mediator: age = getValue("bob")
activate Mediator
Mediator -> LC: bob = get("bob")
Mediator -> Bob: age = getValue()
deactivate Mediator
Mediator -> System.out: printtln("new age for bob:" + age)
activate MediatorDemo

deactivate MediatorDemo



@enduml
```