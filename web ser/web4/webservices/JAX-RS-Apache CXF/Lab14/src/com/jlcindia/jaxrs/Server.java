package com.jlcindia.jaxrs;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;

public class Server {

	public static void main(String[] args) throws Exception{
		JAXRSServerFactoryBean sf=new JAXRSServerFactoryBean();
		sf.setResourceClasses(CustomerService.class);
		sf.setResourceProvider(CustomerService.class,new SingletonResourceProvider(new CustomerService()));
		sf.setAddress("http://localhost:1111/jlc/");
		sf.create();
		System.out.println("server ready...");
		Thread.sleep(10*60*1000);
		System.out.println("Server Exiting");
		System.exit(0);

	}

}
