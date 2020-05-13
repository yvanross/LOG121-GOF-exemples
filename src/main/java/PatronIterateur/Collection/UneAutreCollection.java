package PatronIterateur.Collection;

/**
 * Classe UneAutreCollection
 * 
 * Cette classe est un exemple d'implémentation du patron Iterator.
 * Elle utilise une liste chainée simple pour garder les éléments de
 * la collection.
 * 
 * @author Vincent Lacasse
 *
 */

public class UneAutreCollection implements Iterable {
	
	private Item debut = null;
	private Item courant = null;
	
	/**
	 * Classe Item
	 * Classe interne et privée qui permet de créer la liste chainée
	 */
	private class Item 
	{
		Item suivant = null;
		Object donnee;
		
		public Item(Object donnee) {
			this.donnee = donnee;
		}
	}
	
	/**
	 * Ajoute un élément à la collection
	 * @param o - élément à ajouter
	 */
	public void ajouter(Object o) {
		if (debut == null) {
			debut = new Item(o);
			courant = debut;
		}
		else {
			courant.suivant = new Item(o);
			courant = courant.suivant;
		}
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
		return new UneAutreCollectionIterateur();
	}
	
	/**
	 * Classe UneAutreCollectionIterateur
	 * 
	 * La plupart des implémentations du patron Iterator déclare l'itérateur comme
	 * une classe interne et privée de la collection, comme démontré dans ce cas-ci.
	 * Bien que cette approche n'est pas une condition nécessaire pour l'implémentation
	 * du patron, elle comporte plusieurs avantages: une bonne encapsulation, et la 
	 * classe UneAutreCollectionIterateur a accès aux membres de la classe UneAutreCollection.
	 */
	private class UneAutreCollectionIterateur implements Iterateur
	{
		Item courantIterateur = debut;
		
		public boolean hasNext() {
			return courantIterateur != null;
		}

		public Object next() {
			Object donnee = null;
			if (hasNext()) {
				donnee = courantIterateur.donnee;
				courantIterateur = courantIterateur.suivant;
			}
			return donnee;
		}
	}
}
