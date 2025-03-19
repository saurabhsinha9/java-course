package com.consona.consonabank.exceptions;

public class AccountNotFoundException extends RuntimeException{
	
	@Override
	public String getMessage() {
		System.out.println("account not found exception");
	
		return super.getMessage();
	}
	

}
