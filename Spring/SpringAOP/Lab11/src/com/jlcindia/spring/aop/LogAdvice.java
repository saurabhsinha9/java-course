package com.jlcindia.spring.aop;


public class LogAdvice {
	public void logParams(String p1,String p2){
		System.out.println("LogAdvice-logParams()"+p1+","+p2);
	}
	public void logReturnValue(Object msg){
		System.out.println("LogAdvice-logReturnValue()"+msg);
	}
	public void logException(Exception e){
		System.out.println("LogAdvice-logException()"+e);
	}
	public void log(){
		System.out.println("LogAdvice-log()");
	}
}
