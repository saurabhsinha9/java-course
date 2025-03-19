/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.jlcindia.jaxb;

/**
 * Class Student.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Student implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sid.
     */
    private java.lang.String _sid;

    /**
     * Field _sname.
     */
    private java.lang.String _sname;

    /**
     * Field _email.
     */
    private java.lang.String _email;

    /**
     * Field _phone.
     */
    private java.lang.Object _phone;

    /**
     * Field _address.
     */
    private com.jlcindia.jaxb.Address _address;


      //----------------/
     //- Constructors -/
    //----------------/

    public Student() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'address'.
     * 
     * @return the value of field 'Address'.
     */
    public com.jlcindia.jaxb.Address getAddress(
    ) {
        return this._address;
    }

    /**
     * Returns the value of field 'email'.
     * 
     * @return the value of field 'Email'.
     */
    public java.lang.String getEmail(
    ) {
        return this._email;
    }

    /**
     * Returns the value of field 'phone'.
     * 
     * @return the value of field 'Phone'.
     */
    public java.lang.Object getPhone(
    ) {
        return this._phone;
    }

    /**
     * Returns the value of field 'sid'.
     * 
     * @return the value of field 'Sid'.
     */
    public java.lang.String getSid(
    ) {
        return this._sid;
    }

    /**
     * Returns the value of field 'sname'.
     * 
     * @return the value of field 'Sname'.
     */
    public java.lang.String getSname(
    ) {
        return this._sname;
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
     * Sets the value of field 'address'.
     * 
     * @param address the value of field 'address'.
     */
    public void setAddress(
            final com.jlcindia.jaxb.Address address) {
        this._address = address;
    }

    /**
     * Sets the value of field 'email'.
     * 
     * @param email the value of field 'email'.
     */
    public void setEmail(
            final java.lang.String email) {
        this._email = email;
    }

    /**
     * Sets the value of field 'phone'.
     * 
     * @param phone the value of field 'phone'.
     */
    public void setPhone(
            final java.lang.Object phone) {
        this._phone = phone;
    }

    /**
     * Sets the value of field 'sid'.
     * 
     * @param sid the value of field 'sid'.
     */
    public void setSid(
            final java.lang.String sid) {
        this._sid = sid;
    }

    /**
     * Sets the value of field 'sname'.
     * 
     * @param sname the value of field 'sname'.
     */
    public void setSname(
            final java.lang.String sname) {
        this._sname = sname;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled com.jlcindia.jaxb.Student
     */
    public static com.jlcindia.jaxb.Student unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.jlcindia.jaxb.Student) org.exolab.castor.xml.Unmarshaller.unmarshal(com.jlcindia.jaxb.Student.class, reader);
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
