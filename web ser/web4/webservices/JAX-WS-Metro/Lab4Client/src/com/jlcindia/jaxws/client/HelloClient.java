package com.jlcindia.jaxws.client;

public class HelloClient {

	public static void main(String[] args) {
		HelloService hs=new HelloService();
		HelloDelegate hello=hs.getHelloPort();
		String m1=hello.getMessage("Saurabh");
		System.out.println(m1);
	}

}
