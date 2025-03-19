package com.jlcindia.spring.aop;

public class LogService {
	public void logParams(String p1,String p2){
		System.out.println("LogService-logParams()"+p1+","+p2);
	}
	public void logReturnValue(Object msg){
		System.out.println("LogService-logReturnValue()"+msg);
	}
	public void logException(Exception e){
		System.out.println("LogService-logException()"+e);
	}
}
