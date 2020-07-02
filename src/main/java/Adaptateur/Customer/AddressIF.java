package Adaptateur.Customer;
/**
 * Classes that contain editable street address information implement
 * this interface.
 */
public interface AddressIF {
    /**
     * Get the first line of the street address.
     */
    public String getAddress1();

    /**
     * Set the first line of the street address.
     */
    public void setAddress1(String address1);

    /**
     * Get the second line of the street address.
     */
    public String getAddress2();

    /**
     * Set the second line of the street address.
     */
    public void setAddress2(String address2);

    /**
     * Get the city.
     */
    public String getCity();

    /**
     * Set the city.
     */
    public void setCity(String city);

    /**
     * Get the state.
     */
    public String getState();

    /**
     * Set the state.
     */
    public void setState(String state);

    /**
     * get the postal code
     */
    public String getPostalCode() ;

    /**
     * set the postal code
     */
    public void setPostalCode(String postalCode);
} // interface AddressIF

