package com.jlcindia.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(targetNamespace = "http://cxf.jlcindia.com/", portName = "StudentServicePort", serviceName = "StudentServiceService")
public class StudentService {
	
	
	@WebMethod(operationName = "addStudent", action = "urn:AddStudent")
	public void addStudent(@WebParam(name = "arg0") Student stu){
		System.out.println("In addStudent() of SS");
		System.out.println(stu);
	}
	
	@WebMethod(operationName = "getStudent", action = "urn:GetStudent")
	public Student getStudent(@WebParam(name = "arg0") String sid){
		System.out.println("In getStudent() of SS");
		System.out.println(sid);
		Student stu=null;
		if(sid.equals("JLC-99")){
			System.out.println("in if block");
			stu=new Student();
			stu.setSid(sid);
			stu.setFname("Saurabh");
			stu.setLname("Sinha");
			stu.setEmail("sau@jlc");
		}
		return stu;
	}
}
