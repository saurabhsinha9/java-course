package com.jlcindia.ejb.jaxws.client;

public class HelloClient {

	public static void main(String[] args) {
		
		HelloBeanService hbs=new HelloBeanService();
		HelloBean hb=hbs.getHelloBeanPort();
		String msg=hb.getMessage("Saurabh");
		System.out.println(msg);
		

	}

}
