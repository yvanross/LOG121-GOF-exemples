package Iterateur;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import Iterateur.Name.NameRepository;
import Iterateur.Name.Iterator;


public class NameRepositoryTest {

	@Test
	public void testGetIterator() throws Exception {
		final NameRepository namesRepository = new NameRepository();

		String names = "";
		final Iterator iter =  namesRepository.getIterator();
		while ( iter.hasNext()) {
			final String name = (String) iter.next();
		   System.out.println("Name : " + name);
		   names += name;
		} 	
		assertEquals("RobertJohnJulieLora", names);
	}
}
