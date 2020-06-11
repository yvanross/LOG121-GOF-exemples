package Commande.Bottin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Fiche - une fiche du bottin téléphonique
 * @author Vincent Lacasse
 *
 */
public class Fiche {
	private String nom;
	private String prenom;
	private String numero;
	private String adresse;
	private String courriel;
	
	/**
	 * Créer une fiche à partir du nom, prénom, numéro, adresse, courriel
	 * @param nom - nom de famille
	 * @param prenom - prénom
	 * @param numero - numéro de téléphone
	 * @param adresse - adresse postale
	 * @param courriel - courriel
	 */
	public Fiche(String nom, String prenom, String numero, String adresse, String courriel) {
		setFiche(nom, prenom, numero, adresse, courriel);
	}
	
	/**
	 * Créer une fiche vide
	 */
	public Fiche() {
		this("", "", "", "", "");
	}
	
	/**
	 * Créer une fiche à partir d'une fiche existante
	 * @param fiche
	 */
	public Fiche(Fiche fiche) {
		setFiche(fiche);
	}
	
	/**
	 * Génèrer une String qui contient nom, prénom, téléphone seulement
	 * @return String - chaine de caractère contenant nom, prénom, téléphone
	 */
    public String getElementListe() {
		return getNom() + ", " + getPrenom() + ", " + getNumero();
    }

    /**
     * Écrire la fiche dans un PrintWriter 
     * @param out - PrintWriter où la fiche est écrite
     * @throws IOException
     */
	public void ecrire(PrintWriter out) throws IOException {
		out.println(nom);
		out.println(prenom);
		out.println(numero);
		out.println(adresse);
		out.println(courriel);
	}

	/**
	 * Lire et créer une fiche à partir d'un BufferedReader 
	 * @param in - BufferedReader d'où on lit le texte de la fiche
	 * @return nouvelle fiche
	 * @throws IOException
	 */
	public static Fiche lire(BufferedReader in) throws IOException {
		return new Fiche(
				in.readLine(), // nom
				in.readLine(), // prenom
				in.readLine(), // telephone
				in.readLine(), // adresse
				in.readLine()  // courriel
				);
	}
	
	/**
	 * Initialise la fiche avec les valeurs de nom, prénom, numéro, address et courriel
	 * @param nom
	 * @param prenom
	 * @param numero
	 * @param adresse
	 * @param courriel
	 */
	public void setFiche(String nom, String prenom, String numero, String adresse, String courriel) {
		this.nom = nom;
		this.prenom = prenom;
		this.numero = numero;
		this.adresse = adresse;
		this.courriel = courriel;
	}
	
	/**
	 * Initialise la fiche à partir d'une autre fiche
	 * @param fiche
	 */
	public void setFiche(Fiche fiche) {
		setFiche(fiche.nom, fiche.prenom, fiche.numero, fiche.adresse, fiche.courriel);
	}

	/*
	 * Getters générés automatiquement 
	 */
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getNumero() {
		return numero;
	}

	public String getAdresse() {
		return adresse;
	}

	public String getCourriel() {
		return courriel;
	}
}
