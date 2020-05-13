# Patron Itérateur

```plantuml
@startuml
class SongOfThe70s
SongOfThe70s-up->SongIterator
SongOfThe80s-up->SongIterator
SongOfThe90s-up->SongIterator

DiskJockey *-- "*" SongIterator

@enduml


```