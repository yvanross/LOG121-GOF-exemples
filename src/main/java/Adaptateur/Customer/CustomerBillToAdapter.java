package Adaptateur.Customer;

/**
 * Adapter class to allow objects that access an AddressIF object to access
 * a customer's bill-to address.
 */
class CustomerBillToAdapter implements AddressIF {
    private Customer myCustomer;

    public CustomerBillToAdapter(Customer customer) {
        myCustomer = customer;
    } // constructor

    /**
     * Get the first line of the street address.
     */
    public String getAddress1() { return myCustomer.getBillToAddress1(); }

    /**
     * Set the first line of the street address.
     */
    public void setAddress1(String address1) {
        myCustomer.setBillToAddress1(address1);
    } // setAddress1(String)

    /**
     * Get the second line of the street address.
     */
    public String getAddress2() { return myCustomer.getBillToAddress2(); }

    /**
     * Set the second line of the street address.
     */
    public void setAddress2(String address2) {
        myCustomer.setBillToAddress2(address2);
    } // setAddress2(String)

    /**
     * Get the city.
     */
    public String getCity() { return myCustomer.getBillToCity(); }

    /**
     * Set the city.
     */
    public void setCity(String city) {
        myCustomer.setBillToCity(city);
    } // setCity(String)

    /**
     * Get the state.
     */
    public String getState() { return myCustomer.getBillToState(); }

    /**
     * Set the state.
     */
    public void setState(String state) {
        myCustomer.setBillToState(state);
    } // setState(String)

    /**
     * get the postal code
     */
    public String getPostalCode() {
        return myCustomer.getBillToPostalCode();
    } // getBillToPostalCode()

    /**
     * set the postal code
     */
    public void setPostalCode(String postalCode) {
        myCustomer.setBillToPostalCode(postalCode);
    } // setPostalCode(String)
} // class CustomerBillToAdapter
