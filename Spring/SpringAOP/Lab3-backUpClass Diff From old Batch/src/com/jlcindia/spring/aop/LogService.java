package com.jlcindia.spring.aop;

public class LogService {
	static{
		System.out.println("LogService  -S.B");
	}
	public LogService(){
		System.out.println("LogService  -D.C");
	}
	public void logBefore(){
		System.out.println("LogService.....logBefore()");
	}
	public void logReturning(){
		System.out.println("LogService.....logReturning()");
	}
	public void logThrowing(Exception e){
		System.out.println("LogService.....logThrowing()");
		System.out.println(e);
	}
}
