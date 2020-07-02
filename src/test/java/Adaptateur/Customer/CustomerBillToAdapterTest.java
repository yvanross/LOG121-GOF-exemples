package Adaptateur.Customer;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CustomerBillToAdapterTest {
	Customer customer = null;
	CustomerBillToAdapter customerBillToAdapter = null;

	@Before
	public void init(){
		 customer = new Customer();
		  customerBillToAdapter = new CustomerBillToAdapter(customer);
		}


	@Test
	public void getAddress1() throws Exception {
		customer.setBillToAddress1("address1");
		assertEquals("address1",customerBillToAdapter.getAddress1());

	}

	@Test
	public void testSetAdress1() throws Exception {
		customerBillToAdapter.setAddress1("address1A");
		assertEquals("address1A",customer.getBillToAddress1());

	}

	@Test
	public void TestAddress2() throws Exception {
		customer.setBillToAddress2("address2");
		assertEquals("address2",customerBillToAdapter.getAddress2());
	}



	@Test
	public void testsetCity() throws Exception {
		customerBillToAdapter.setCity("city1");
		assertEquals("city1",customer.getBillToCity());

	}

	@Test
	public void testGetCity() throws Exception {
		customer.setBillToCity("city2");
		assertEquals("city2",customerBillToAdapter.getCity());

	}

	@Test
	public void testGetState() throws Exception {
		customer.setBillToState("State1");
		assertEquals("State1",customerBillToAdapter.getState());
	}

	@Test
	public void testSetState() throws Exception {
		customerBillToAdapter.setState("State2");
		assertEquals("State2",customer.getBillToState());

	}

	@Test
	public void testGetPostalCode() throws Exception {
	customer.setBillToPostalCode("JJJ KKK");
	assertEquals("JJJ KKK", customerBillToAdapter.getPostalCode());

	}

	@Test
	public void testSetPostalCode() throws Exception {
customerBillToAdapter.setPostalCode("KKK kkk");
assertEquals("KKK kkk", customerBillToAdapter.getPostalCode());
	}


}
