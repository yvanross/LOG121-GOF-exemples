package Commande.Bottin;

import java.util.LinkedList;
import java.util.Observable;

/*
 * CommandInvoker
 * Implementation du patron Command pour implementer les fonctionalites "defaire" et "refaire"
 * Tiré de [Grand2002]
 */
@SuppressWarnings({"deprecation"})
public class GestionnaireDeCommandes extends Observable {
	private boolean defaireStatut;
	private boolean refaireStatut;
	
    private LinkedList<Commande> histoire = new LinkedList<Commande>();
    private LinkedList<Commande> aRefaire = new LinkedList<Commande>();
	
    public boolean peutDefaire() {
    	return histoire.size() > 0;
    }
    
    public boolean peutRefaire() {
    	return aRefaire.size() > 0;
    }
    
	public void faireCommande(Commande commande) {
		defaireStatut = peutDefaire();
		refaireStatut = peutRefaire();
		
       
        	if (commande.faire()) {
        		histoire.addFirst(commande);
        	} 
        
        
        if (defaireStatut ^ peutDefaire() || refaireStatut ^ peutRefaire()) {
        	setChanged();
        	notifyObservers();
        }
	}
	
    void refaireAll() {
        while(peutRefaire()) { 
           refaire();
        } 
    } 	
    /*
     * Defaire la commande la plus récente
     */
    void defaire() {
        if (histoire.size() > 0) { 
        	Commande commandeADefaire = histoire.removeFirst();
        	commandeADefaire.defaire();
            aRefaire.addFirst(commandeADefaire);
        } 
    }

    /*
     * Refaire la dernire commande qui a été "defaite"
     */
    void refaire() {
        if (aRefaire.size() > 0) { 
            Commande commandeARefaire = aRefaire.removeFirst();
            commandeARefaire.refaire();
            histoire.addFirst(commandeARefaire);
        } 
    } 	
}
