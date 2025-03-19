package com.jlcindia.jaxws;

import java.util.ArrayList;
import java.util.List;

@javax.jws.WebService(targetNamespace = "http://jaxws.jlcindia.com/", serviceName = "CourseManagerService", portName = "CourseManagerPort", wsdlLocation = "WEB-INF/wsdl/CourseManagerService.wsdl")
public class CourseManagerDelegate {

	com.jlcindia.jaxws.CourseManager courseManager = new com.jlcindia.jaxws.CourseManager();

	public List<CourseTO> getAllCourses() {
		return courseManager.getAllCourses();
	}

}