package PatronStrategieComparator.Comparator;

import java.time.LocalDate;
//import java.util.Comparator;

public class Employe2 {
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private LocalDate dateEmbauche;
	private double salaire;
	
	public Employe2(String nom, String prenom, LocalDate dateNaissance, LocalDate dateEmbauche, double salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.dateEmbauche = dateEmbauche;
		this.salaire = salaire;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public LocalDate getDateEmbauche() {
		return dateEmbauche;
	}

	public double getSalaire() {
		return salaire;
	}
	
	@Override
	public String toString() {
		return String.format("%10s, %10s, %15s, %15s, %7.0f", nom, prenom, dateNaissance, dateEmbauche, salaire);
	}
	
	static public String getEntete() {
		return "      Nom ,    Prénom , Date Naissance ,  Date Embauche , Salaire" + System.lineSeparator() +
			   "  --------   ---------  ---------------   -------------   -------" + System.lineSeparator();
	}
}
