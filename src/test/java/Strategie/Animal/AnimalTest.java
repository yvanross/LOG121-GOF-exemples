package Strategie.Animal;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class AnimalTest {
	Animal animal;
 	@Before
 	public void init(){
		 animal = new Animal();
 	}

	@Test
	public void testSetName() throws Exception {
		animal.setName("allo");
		assertEquals("allo", animal.getName());
	}

	@Test
	public void testSetHeight() throws Exception {
		animal.setHeight(3.1416);
		assertEquals(3.1416,animal.getHeight(),0.001);
	}



	@Test
	public void testSetWeight() throws Exception {
			animal.setWeight(123);
			// assertEquals(123,animal.getWeight());
			//TODO: demo test yvan
	}

	@Test
	public void testSetFavFood() throws Exception {

	}

	@Test
	public void testGetFavFood() throws Exception {

	}

	@Test
	public void testSetSpeed() throws Exception {

	}

	@Test
	public void testGetSpeed() throws Exception {

	}

	@Test
	public void testSetSound() throws Exception {

	}

	@Test
	public void testGetSound() throws Exception {

	}

	@Test
	public void testFly() throws Exception {

	}

	@Test
	public void testTryToFly() throws Exception {

	}

	@Test
	public void testSetFlyingAbility() throws Exception {

	}

}
