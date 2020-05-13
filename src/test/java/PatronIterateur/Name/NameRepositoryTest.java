package PatronIterateur.Name;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NameRepositoryTest {

	@Test
	public void testGetIterator() throws Exception {
		NameRepository namesRepository = new NameRepository();

		String names="";
		for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
		   String name = (String)iter.next();
		   System.out.println("Name : " + name);
		   names += name;
		} 	
		assertEquals("RobertJohnJulieLora", names);
	}
}
