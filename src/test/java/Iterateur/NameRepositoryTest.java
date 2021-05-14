package Iterateur;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import Iterateur.Name.*;


public class NameRepositoryTest {

	@Test
	public void testGetIterator() throws Exception {
		final Container namesRepository = new NameRepository();

		String names = "";
		final Iterator iter =  namesRepository.getIterator();
		while ( iter.hasNext()) {
			final String name = (String) iter.next();
		   System.out.println("Name : " + name);
		   names += name;
		} 	
		assertEquals("RobertJohnJuliettelaury", names);
	}

	// 0 - Mettre le diagramme de classe à jour, ajouter les tests
	// 1-afficher par ordre alphabétique
	// 2-Afficher par ordre alphabétique inversé en utilisant un itérateur qui parcours les donées à l'inverse
	// 3-Ajouter un nombre variable d'observateurs qui sont identifé par leur nom et qui affichent les nom des personnes dans la console à chaque fois qu'il sont utilisés par l'itérateur dans la fonction next ou previous. 
	// Vous devez faire deux version de la méthode update en utilisant la surcharge
	// une version avec parametre
	// une version sans parametre
	// dans les deux cas la sortie devrait correspondre à:
	//      observer1 next Robert  -> update avec les paramêtres
	//      observer1 next Robert  -> update sans paramètres
	//      observer2 next Robert 
	//		....
	//     
	//      observer1 previous Laury
	//      ....

}
