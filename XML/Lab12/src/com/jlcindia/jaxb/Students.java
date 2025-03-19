/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.jlcindia.jaxb;

/**
 * Class Students.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Students implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _studentList.
     */
    private java.util.Vector<com.jlcindia.jaxb.Student> _studentList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Students() {
        super();
        this._studentList = new java.util.Vector<com.jlcindia.jaxb.Student>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vStudent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addStudent(
            final com.jlcindia.jaxb.Student vStudent)
    throws java.lang.IndexOutOfBoundsException {
        this._studentList.addElement(vStudent);
    }

    /**
     * 
     * 
     * @param index
     * @param vStudent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addStudent(
            final int index,
            final com.jlcindia.jaxb.Student vStudent)
    throws java.lang.IndexOutOfBoundsException {
        this._studentList.add(index, vStudent);
    }

    /**
     * Method enumerateStudent.
     * 
     * @return an Enumeration over all com.jlcindia.jaxb.Student
     * elements
     */
    public java.util.Enumeration<? extends com.jlcindia.jaxb.Student> enumerateStudent(
    ) {
        return this._studentList.elements();
    }

    /**
     * Method getStudent.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the com.jlcindia.jaxb.Student at the
     * given index
     */
    public com.jlcindia.jaxb.Student getStudent(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._studentList.size()) {
            throw new IndexOutOfBoundsException("getStudent: Index value '" + index + "' not in range [0.." + (this._studentList.size() - 1) + "]");
        }

        return (com.jlcindia.jaxb.Student) _studentList.get(index);
    }

    /**
     * Method getStudent.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.jlcindia.jaxb.Student[] getStudent(
    ) {
        com.jlcindia.jaxb.Student[] array = new com.jlcindia.jaxb.Student[0];
        return (com.jlcindia.jaxb.Student[]) this._studentList.toArray(array);
    }

    /**
     * Method getStudentCount.
     * 
     * @return the size of this collection
     */
    public int getStudentCount(
    ) {
        return this._studentList.size();
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
     */
    public void removeAllStudent(
    ) {
        this._studentList.clear();
    }

    /**
     * Method removeStudent.
     * 
     * @param vStudent
     * @return true if the object was removed from the collection.
     */
    public boolean removeStudent(
            final com.jlcindia.jaxb.Student vStudent) {
        boolean removed = _studentList.remove(vStudent);
        return removed;
    }

    /**
     * Method removeStudentAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.jlcindia.jaxb.Student removeStudentAt(
            final int index) {
        java.lang.Object obj = this._studentList.remove(index);
        return (com.jlcindia.jaxb.Student) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vStudent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setStudent(
            final int index,
            final com.jlcindia.jaxb.Student vStudent)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._studentList.size()) {
            throw new IndexOutOfBoundsException("setStudent: Index value '" + index + "' not in range [0.." + (this._studentList.size() - 1) + "]");
        }

        this._studentList.set(index, vStudent);
    }

    /**
     * 
     * 
     * @param vStudentArray
     */
    public void setStudent(
            final com.jlcindia.jaxb.Student[] vStudentArray) {
        //-- copy array
        _studentList.clear();

        for (int i = 0; i < vStudentArray.length; i++) {
                this._studentList.add(vStudentArray[i]);
        }
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled com.jlcindia.jaxb.Students
     */
    public static com.jlcindia.jaxb.Students unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.jlcindia.jaxb.Students) org.exolab.castor.xml.Unmarshaller.unmarshal(com.jlcindia.jaxb.Students.class, reader);
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
