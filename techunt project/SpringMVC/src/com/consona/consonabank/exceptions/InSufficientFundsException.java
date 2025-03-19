package com.consona.consonabank.exceptions;

public class InSufficientFundsException extends RuntimeException {
	@Override
	public String getMessage() {
		System.out.println("insufficient bal");
		return super.getMessage();
	}

}
