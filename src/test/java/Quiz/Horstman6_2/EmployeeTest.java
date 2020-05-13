package Quiz.Horstman6_2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class EmployeeTest {
	Employee employee;
	
	@Before
	public void init(){
		employee = new Employee("Yvan");
		employee.setSalary(25.0);
	}



	@Test
	public void testSetSalary() throws Exception {
		employee.setSalary(112.0);
		assertEquals(112.0,employee.getSalary(),0.01);
	}

	@Test
	public void testGetName() throws Exception {
		assertEquals("Yvan",employee.getName());
	}

	@Test
	public void testGetSalary() throws Exception {
		assertEquals(25.0, employee.getSalary(),0.01);
	}

}

