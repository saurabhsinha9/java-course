package com.jlcindia.struts1;

public class BatchIDNotFoundException extends Exception {

	static{
		System.out.println("BatchIDNotFoundException-SB");
	}
	public BatchIDNotFoundException() {
		System.out.println("BatchIDNotFoundException-DC");
	}
	
}
