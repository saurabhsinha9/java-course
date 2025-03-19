package com.jlcindia.spring.mvc.command;

public class Query {
	static{
		System.out.println("Query-SB");
	}
	public Query() {
		System.out.println("Query-DC");
	}
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
