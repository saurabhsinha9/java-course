package com.jlcindia.spring.transaction.jdbc;

public class InsufficientFundsException extends Exception {
	public String getMessage() {
		return "Insufficient Balance to do the TX";
	}
	
	public String toString() {
		return "com.jlcindia.spring.transaction.hibernate.InsufficientFundsException :Sorry.. Your account has Insufficient Funds";
	}
	
}
