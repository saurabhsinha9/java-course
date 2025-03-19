package com.jlcindia.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://cxf.jlcindia.com/", portName = "HelloPort", serviceName = "HelloService")
public class Hello {
	@WebMethod(operationName = "getMessage", action = "urn:GetMessage")
	public String getMessage(@WebParam(name = "arg0") String name){
		String msg="Hello "+name+" welcome JLC CXF world";
		System.out.println(msg);
		return msg;
	}
}
