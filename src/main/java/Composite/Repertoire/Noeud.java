package Composite.Repertoire;
import java.io.File;

public abstract class Noeud {
	
	File nom;
    static int niveau = 0;
	
	public Noeud(File nom) {
		this.nom = nom;
	}
	
	public abstract String toString();
	
	public String addSpace() {
		char[] buffer = new char[niveau*2];
		for (int i = 0; i < niveau*2; i++) {
			buffer[i] = ' ';
		}
		return new String(buffer);
	}
}