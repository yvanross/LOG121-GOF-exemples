package Adaptateur.Customer;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {
	Customer customer = null;

	@Before
	public void init(){
		 customer = new Customer();
	}

	@Test
	public void testShipToAddress1() throws Exception {
		customer.setShipToAddress1("adresse1");
		assertEquals("adresse1", customer.getShipToAddress1());

	}


	@Test
	public void testShipToAddress2() throws Exception {
		customer.setShipToAddress2("adresse2");
		assertEquals("adresse2", customer.getShipToAddress2());
	}


	@Test
	public void testShipToCity() throws Exception {
		customer.setShipToCity("adresse2");
		assertEquals("adresse2", customer.getShipToCity());
	}


	@Test
	public void testShipToState() throws Exception {
		customer.setShipToState("Quebec");
		assertEquals("Quebec", customer.getShipToState());
	}

	@Test
	public void testShipToPostalCode() throws Exception {
		customer.setShipToPostalCode("J3L 6Z8");
		assertEquals("J3L 6Z8", customer.getShipToPostalCode());
	}

	@Test
	public void testBillToAddress1() throws Exception {
		customer.setBillToAddress1("bill1");
		assertEquals("bill1",customer.getBillToAddress1());
	}



	@Test
	public void testtBillToAddress2() throws Exception {
		customer.setBillToAddress2("bill2");
		assertEquals("bill2",customer.getBillToAddress2());
	}


	@Test
	public void testBillToCity() throws Exception {
		customer.setBillToCity("cityBill");
		assertEquals("cityBill",customer.getBillToCity());
	}

	
	@Test
	public void testBillToState() throws Exception {
		customer.setBillToState("State1");
		assertEquals("State1",customer.getBillToState());
	}


	@Test
	public void testBillToPostalCode() throws Exception {
		customer.setBillToPostalCode("J3L 6y6");
		assertEquals("J3L 6y6",customer.getBillToPostalCode());
	}


}
