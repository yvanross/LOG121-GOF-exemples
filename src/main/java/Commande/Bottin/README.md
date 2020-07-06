# Bottin
Diagramme de Classe UML du package Bottin

Voila comment je pense que le pattern command s'articule

Invoker = GestionnaireDeCommandes
Client = Bottin
Receiver = Vue Principale

Helwan Mandé 
```plantuml
@startuml

        class Bottin {
            {static} + NOM_FICHIER : String
            + Bottin()
            + ecrire()
            + lire()
        }



        abstract class BottinAbstractAction {
            {static} # gdc : GestionnaireDeCommandes
            {static} - serialVersionUID : long
            + BottinAbstractAction()
        }




        class BottinDemo {
            {static} + createAndShowGUI()
            {static} + main()
        }





        interface Commande {
            {abstract} + defaire()
            {abstract} + faire(commande: Commande)
            {abstract} + refaire()
        }


        class Fiche {
            - adresse : String
            - courriel : String
            - nom : String
            - numero : String
            - prenom : String
            + Fiche()
            + Fiche()
            + Fiche()
            + ecrire()
            + getAdresse()
            + getCourriel()
            + getElementListe()
            + getNom()
            + getNumero()
            + getPrenom()
            {static} + lire()
            + setFiche()
            + setFiche()
        }






        class FicheActionAjouter {
            {static} - serialVersionUID : long
            + FicheActionAjouter()
            + actionPerformed()
 }



        class FicheActionDefaire extends BottinAbstractAction implements Observer  {
            {static} - serialVersionUID : long
            + FicheActionDefaire()
            + actionPerformed()
            + update()
        }


        class FicheActionDetruire {
            {static} - serialVersionUID : long
            + FicheActionDetruire()
            + actionPerformed()
        }


        class FicheActionEditer {
            {static} - serialVersionUID : long
            + FicheActionEditer()
            + actionPerformed()
        }



        class FicheActionFermer {
            {static} - serialVersionUID : long
            + FicheActionFermer()
            + actionPerformed()
        }



       class FicheActionRefaire extends BottinAbstractAction implements Observer {
            {static} - serialVersionUID : long
            + FicheActionRefaire()
            + actionPerformed()
            + update()
        }




        class FicheActionVoir {
            {static} - serialVersionUID : long
            + FicheActionVoir()
            + actionPerformed()
        }



        class FicheCelRenderer {
            + getListCellRendererComponent()
        }


        class FicheCommandeAjouter {
            - index : int
            + FicheCommandeAjouter()
            + defaire()
            + faire()
            + refaire()
        }


        class FicheCommandeDefaire {
            + FicheCommandeDefaire()
            + defaire()
            + faire()
            + refaire()
        }




        class FicheCommandeDetruire {
            - index : int
            + FicheCommandeDetruire()
            + defaire()
            + faire()
            + refaire()
        }




        class FicheCommandeEditer {
            - index : int
            + FicheCommandeEditer()
            + defaire()
            + faire()
            + refaire()
        }



        class FicheCommandeFermer {
            + FicheCommandeFermer()
            + defaire()
            + faire()
            + refaire()
        }




        class FicheCommandeRefaire {
            + defaire()
            + faire()
            + refaire()
        }



        class FicheCommandeVoir {
            - index : int
            + FicheCommandeVoir()
            + defaire()
            + faire()
            + refaire()
        }




        class FicheControleur {
            + FicheControleur()
            + actionPerformed()
            + changedUpdate()
            + insertUpdate()
            + removeUpdate()
            - isDocLengthNotZero()
        }





        class FicheDialog {
            {static} + ACTION_CANCEL : String
            {static} + ACTION_OK : String
            {static} + FIELD_LENGTH : int
            ~ cancelButton : JButton
            ~ okButton : JButton
            - OKPressed : boolean
            - contentPanel : JPanel
            - txtAdresse : JTextField
            - txtCourriel : JTextField
            - txtNom : JTextField
            - txtNumero : JTextField
            - txtPrenom : JTextField
            + FicheDialog()
            + enableOK()
            + getFiche()
            + isOKPressed()
            + setOKPressed()
            - setTextFields()
        }






        class GestionnaireDeCommandes {
            - aRefaire : LinkedList<Commande>
            - defaireStatut : boolean
            - histoire : LinkedList<Commande>
            - refaireStatut : boolean
            + faireCommande()
            + peutDefaire()
            + peutRefaire()
            - defaire()
            - refaire()

    }






        class VuePrincipale {
            {static} + N_CAR : int
            {static} + N_ITEM : int
            - ajouterAction : Action
            - contentPane : JPanel
            - defaireAction : Action
            - detruireAction : Action
            - editerAction : Action
            - fermerAction : Action
            - liste : JList<Fiche>
            - refaireAction : Action
            - txtNom : JTextField
            - txtNumero : JTextField
            - txtPrenom : JTextField
            - voirAction : Action
            + VuePrincipale()
            + contentsChanged()
            + getIndex()
            + intervalAdded()
            + intervalRemoved()
            + valueChanged()
            - ficheSelectionne()
            - setTextFields()
        }





FicheActionAjouter-up-|>BottinAbstractAction
FicheActionDefaire-up-|>BottinAbstractAction
FicheActionDetruire-up-|>BottinAbstractAction
FicheActionEditer-up-|>BottinAbstractAction
FicheActionFermer-up-|>BottinAbstractAction
FicheActionRefaire-up-|>BottinAbstractAction
FicheActionVoir-up-|>BottinAbstractAction

Commande --> Bottin: invoke command on

FicheCommandeAjouter--up|>Commande
FicheCommandeDefaire--up|>Commande
FicheCommandeDetruire--up|>Commande
FicheCommandeEditer--up|>Commande
FicheCommandeFermer--up|>Commande
FicheCommandeVoir--up|>Commande
FicheCommandeRefaire--up|>Commande

GestionnaireDeCommandes o--Commande

BottinAbstractAction--up>GestionnaireDeCommandes


Fiche o-->FicheControleur
FicheControleur o--FicheDialog

FicheCelRenderer -->Fiche
VuePrincipale -->FicheCelRenderer

BottinDemo -->VuePrincipale
BottinDemo-->Bottin

Bottin -->GestionnaireDeCommandes


        FicheActionAjouter --> FicheCommandeAjouter
        FicheActionDefaire --> FicheCommandeDefaire
        FicheActionDetruire --> FicheCommandeDetruire
        FicheActionEditer --> FicheCommandeEditer
        FicheActionFermer --> FicheCommandeFermer
        FicheActionRefaire --> FicheCommandeRefaire
        FicheActionVoir --> FicheCommandeVoir


@enduml
```
