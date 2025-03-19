package com.jlcindia.spring.mvc;

import java.util.ArrayList;

public class CourseService {
	static{
		System.out.println("CourseService-SB");
	}
	public CourseService() {
		System.out.println("CourseService-DC");
	}
	public ArrayList<String> getCourses(){
		ArrayList<String> al=new ArrayList<String>();
		al.add("Java Core");
		al.add("JDBC");
		al.add("Servlets");
		al.add("JSP");
		al.add("Struts");
		al.add("JSF");
		al.add("Hibernate");
		al.add("EJB");
		al.add("Spring");
		al.add("XML");
		al.add("WebServices");
		al.add("Free Courses-JavaScript,AJAX,CVS,MAVEN,ANT,Log4J,JUNIT,Android");
		return al;
	}
}
