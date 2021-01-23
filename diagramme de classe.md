```plantuml
@startuml
title Diagramme de classe - Labo 1 partie 1
skinparam style strictuml
hide methods
hide Professeur members  
hide MaitreEnseignement members  
hide ChargeCours members  

class Etudiant{
    -codePermanent: String
}

class Departement{
    -sigle: String
    -nom: String
    -nbCreditGraduation: int
}

abstract Enseignant{
    -nas: int
    -departementAttache[*]: Departement
    -specialite[*]: String
}

class Professeur
class MaitreEnseignement
class ChargeCours

class Programme{
    -nbCredits : int
    -sigle: String
}

class Cours{
    -id : int
    -departement : Departement
    -sigle: String
    -session : String
    -numSalle : int
    -nbHeures : TIMESTAMP  
    -credit : int = [1..7]
}

class Personne{
    -nom : String
    -prenom : String 
    -dateNaissance : Date
    -universite : String
}

class Etudiant_Groupe{
    -note : String
}

class Groupe{
    -groupe : int
    -dateDebut : Date
    -dateFin : Date 
    -salle : String
}

/' héritage '/
Etudiant -up-|> Personne 
Enseignant -up-|> Personne 
MaitreEnseignement --|> Enseignant
ChargeCours --|> Enseignant
Professeur --|> Enseignant

/' relations autres '/
Etudiant "*" -left- "*" Programme 
Programme "1..*" -- "1..*"Cours 
Etudiant "1..*" -- "1..*" Groupe
(Etudiant, Groupe) .. Etudiant_Groupe
Enseignant "*" -- "*" Departement
Groupe "1..*"-- "1" Cours
Departement "1"--"*" Cours 

@enduml
```