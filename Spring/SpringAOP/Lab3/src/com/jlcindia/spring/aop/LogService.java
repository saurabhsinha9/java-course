package com.jlcindia.spring.aop;

public class LogService {
	public void logBegin(){
		System.out.println("LogService-logBegin()");
	}
	public void logEnd(){
		System.out.println("LogService-logEnd()");
	}
	public void logException(){
		System.out.println("LogService-logException()");
	}
}
