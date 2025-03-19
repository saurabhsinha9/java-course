/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.jlcindia.jaxb;

/**
 * Class Address.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Address implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _street.
     */
    private java.lang.String _street;

    /**
     * Field _city.
     */
    private java.lang.String _city;

    /**
     * Field _zip.
     */
    private java.lang.String _zip;

    /**
     * Field _state.
     */
    private java.lang.String _state;

    /**
     * Field _country.
     */
    private java.lang.String _country;


      //----------------/
     //- Constructors -/
    //----------------/

    public Address() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'city'.
     * 
     * @return the value of field 'City'.
     */
    public java.lang.String getCity(
    ) {
        return this._city;
    }

    /**
     * Returns the value of field 'country'.
     * 
     * @return the value of field 'Country'.
     */
    public java.lang.String getCountry(
    ) {
        return this._country;
    }

    /**
     * Returns the value of field 'state'.
     * 
     * @return the value of field 'State'.
     */
    public java.lang.String getState(
    ) {
        return this._state;
    }

    /**
     * Returns the value of field 'street'.
     * 
     * @return the value of field 'Street'.
     */
    public java.lang.String getStreet(
    ) {
        return this._street;
    }

    /**
     * Returns the value of field 'zip'.
     * 
     * @return the value of field 'Zip'.
     */
    public java.lang.String getZip(
    ) {
        return this._zip;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, handler);
    }

    /**
     * Sets the value of field 'city'.
     * 
     * @param city the value of field 'city'.
     */
    public void setCity(
            final java.lang.String city) {
        this._city = city;
    }

    /**
     * Sets the value of field 'country'.
     * 
     * @param country the value of field 'country'.
     */
    public void setCountry(
            final java.lang.String country) {
        this._country = country;
    }

    /**
     * Sets the value of field 'state'.
     * 
     * @param state the value of field 'state'.
     */
    public void setState(
            final java.lang.String state) {
        this._state = state;
    }

    /**
     * Sets the value of field 'street'.
     * 
     * @param street the value of field 'street'.
     */
    public void setStreet(
            final java.lang.String street) {
        this._street = street;
    }

    /**
     * Sets the value of field 'zip'.
     * 
     * @param zip the value of field 'zip'.
     */
    public void setZip(
            final java.lang.String zip) {
        this._zip = zip;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled com.jlcindia.jaxb.Address
     */
    public static com.jlcindia.jaxb.Address unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.jlcindia.jaxb.Address) org.exolab.castor.xml.Unmarshaller.unmarshal(com.jlcindia.jaxb.Address.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
