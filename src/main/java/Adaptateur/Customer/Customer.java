package Adaptateur.Customer;

/**
 * Instances of this class represent a customer
 */
class Customer {
    //...
    // the first line of ship-to street address.
    private String shipToAddress1;

    // the second line of ship-to street address.
    private String shipToAddress2;

    // ship-to city.
    private String shipToCity;

    // ship-to state.
    private String shipToState;

    // ship-to postal code
    private String shipToPostalCode;

    // the first line of bill-to street address.
    private String billToAddress1;

    // the second line of bill-to street address.
    private String billToAddress2;

    // bill-to city.
    private String billToCity;

    // bill-to state.
    private String billToState;

    // bill-to postal code
    private String billToPostalCode;

    /**
     * Get the first line of ship-to street address.
     */
    public String getShipToAddress1() { return shipToAddress1; }

    /**
     * Set the first line of ship-to street address.
     */
    public void setShipToAddress1(String address1) {
        shipToAddress1 = address1;
    } // setShipToAddress1

    /**
     * Get the second line of ship-to street address.
     */
    public String getShipToAddress2() { return shipToAddress2; }

    /**
     * Set the second line of ship-to street address.
     */
    public void setShipToAddress2(String address2) {
        shipToAddress2 = address2;
    } // setShipToAddress2(String)

    /**
     * Get ship-to city.
     */
    public String getShipToCity() { return shipToCity; }

    /**
     * Set ship-to city.
     */
    public void setShipToCity(String city) { shipToCity = city; }

    /**
     * Get ship-to state.
     */
    public String getShipToState() { return shipToState; }

    /**
     * Set ship-to state.
     */
    public void setShipToState(String state) { shipToState = state; }

    /**
     * get ship-to postal code
     */
    public String getShipToPostalCode() { return shipToPostalCode; }

    /**
     * set ship-to postal code
     */
    public void setShipToPostalCode(String postalCode) {
        shipToPostalCode = postalCode;
    } // setShipToPostalCode(String)

    /**
     * Get the first line of bill-to street address.
     */
    public String getBillToAddress1() { return billToAddress1; }

    /**
     * Set the first line of bill-to street address.
     */
    public void setBillToAddress1(String address1) {
        billToAddress1 = address1;
    } // setBillToAddress1

    /**
     * Get the second line of bill-to street address.
     */
    public String getBillToAddress2() { return billToAddress2; }

    /**
     * Set the second line of bill-to street address.
     */
    public void setBillToAddress2(String address2) {
        billToAddress2 = address2;
    } // setBillToAddress2(String)

    /**
     * Get bill-to city.
     */
    public String getBillToCity() { return billToCity; }

    /**
     * Set bill-to city.
     */
    public void setBillToCity(String city) { billToCity = city; }

    /**
     * Get bill-to state.
     */
    public String getBillToState() { return billToState; }

    /**
     * Set bill-to state.
     */
    public void setBillToState(String state) { billToState = state; }

    /**
     * get bill-to postal code
     */
    public String getBillToPostalCode() { return billToPostalCode; }

    /**
     * set bill-to postal code
     */
    public void setBillToPostalCode(String postalCode) {
        billToPostalCode = postalCode;
    } // setBillToPostalCode(String)
    //...
}// class Customer
