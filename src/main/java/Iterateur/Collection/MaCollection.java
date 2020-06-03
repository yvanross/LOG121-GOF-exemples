package Iterateur.Collection;

/**
 * Classe MaCollection
 * 
 * Cette classe est un exemple d'implémentation du patron Iterator.
 * Elle utilise un tableau d'Object pour garder les éléments de
 * la collection.
 * 
 * @author Vincent Lacasse
 *
 */
public class MaCollection implements Iterable {
	public static final int MAX = 10;
	private int compteur = 0;
	private Object[] tableau = new Object[MAX];
	
	/**
	 * Ajoute un élément à la collection
	 * @param o - élément à ajouter
	 */
	public void ajouter(Object o) {
		if (compteur < MAX)
			tableau[compteur++] = o;
	}

	/**
	 * Retourne un Iterateur pour cette collection
	 * 
	 * Cette méthode est nécessaire à l'implémentation du patron Iterator.
	 * Elle instancie un nouvel Iterateur et retourne l'instance à la méthode
	 * appelante. Il est important d'instancier un nouvel Iterateur. Cela permet,
	 * entre autres, de pourvoir utiliser plusieurs iterateurs en même temps.
	 * 
	 * @see iterator.Iterable#createIterator()
	 * @return un Iterateur pour cette collection
	 */
	public Iterateur createIterator() {
		return new MaCollectionIterateur();
	}
	
	/**
	 * Classe MaCollectionIterateur
	 * 
	 * La plupart des implémentations du patron Iterator déclare l'itérateur comme
	 * une classe interne et privée de la collection, comme démontré dans ce cas-ci.
	 * Bien que cette approche n'est pas une condition nécessaire pour l'implémentation
	 * du patron, elle comporte plusieurs avantages: une bonne encapsulation, et la 
	 * classe MaCollectionIterateur a accès aux membres de la classe MaCollection.
	 */
	private class MaCollectionIterateur implements Iterateur
	{
		int courant = 0;
		
		public boolean hasNext() {
			return courant < compteur;
		}

		public Object next() {
			if (hasNext())
				return tableau[courant++];
			else
				return null;
		}
	}
}

