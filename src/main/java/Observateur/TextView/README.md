# Chat with multiple dialog using Observer pattern

 ```plantuml
@startuml
skinparam style strict

class TestExemple extends WindowAdapter

class TextModel extends Observable {
 
}
Interface ActionListener{
  actionPerformed(ActionEvent e): void
}
class TextViewA extends JFrame implements  Observer, ActionListener
class TextViewB extends JFrame implements  Observer, ActionListener
class TextModel

TestExemple -right-> TextModel
TestExemple -up-> "1" TextViewA
TestExemple -down-> "2" TextViewB

class Observable {
  notifyObservers(): void
  addObserver(Observer): void
}

class Observer {
  update(Observable o, Object arg): void
}
TextViewA ..> TextModel: setState(string)
TextViewA ..> TextModel: setState(string)


 Observable *--> Observer

@enduml
```