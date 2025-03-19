package com.jlcindia.jaxws;

@javax.jws.WebService(targetNamespace = "http://jaxws.jlcindia.com/", serviceName = "HelloService", portName = "HelloPort", wsdlLocation = "WEB-INF/wsdl/HelloService.wsdl")
public class HelloDelegate {

	com.jlcindia.jaxws.Hello hello = new com.jlcindia.jaxws.Hello();

	public String getMessage(String name) {
		return hello.getMessage(name);
	}

}