package com.jlcindia.cxf;

public class HelloClient {

	public static void main(String[] args) {
		HelloService hs=new HelloService();
		Hello hello=hs.getHelloPort();
		String msg=hello.getMessage("Saurabh");
		System.out.println(msg);
	}

}
