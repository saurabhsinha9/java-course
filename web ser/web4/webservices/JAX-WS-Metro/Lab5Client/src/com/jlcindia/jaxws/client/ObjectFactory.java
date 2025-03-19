package com.jlcindia.jaxws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.jlcindia.jaxws.client package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _GetAllCoursesResponse_QNAME = new QName(
			"http://jaxws.jlcindia.com/", "getAllCoursesResponse");
	private final static QName _GetAllCourses_QNAME = new QName(
			"http://jaxws.jlcindia.com/", "getAllCourses");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.jlcindia.jaxws.client
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link CourseTO }
	 * 
	 */
	public CourseTO createCourseTO() {
		return new CourseTO();
	}

	/**
	 * Create an instance of {@link GetAllCoursesResponse }
	 * 
	 */
	public GetAllCoursesResponse createGetAllCoursesResponse() {
		return new GetAllCoursesResponse();
	}

	/**
	 * Create an instance of {@link GetAllCourses }
	 * 
	 */
	public GetAllCourses createGetAllCourses() {
		return new GetAllCourses();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetAllCoursesResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://jaxws.jlcindia.com/", name = "getAllCoursesResponse")
	public JAXBElement<GetAllCoursesResponse> createGetAllCoursesResponse(
			GetAllCoursesResponse value) {
		return new JAXBElement<GetAllCoursesResponse>(
				_GetAllCoursesResponse_QNAME, GetAllCoursesResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCourses }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://jaxws.jlcindia.com/", name = "getAllCourses")
	public JAXBElement<GetAllCourses> createGetAllCourses(GetAllCourses value) {
		return new JAXBElement<GetAllCourses>(_GetAllCourses_QNAME,
				GetAllCourses.class, null, value);
	}

}
