package com.jlcindia.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogService {
	public void log(ProceedingJoinPoint pjp)throws Throwable{
		logBegin();
		pjp.proceed();
		logEnd();
	}
	
	public void logBegin(){
		System.out.println("LogService-logBegin()");
	}
	public void logEnd(){
		System.out.println("LogService-logEnd()");
	}
	public void logException(){
		System.out.println("LogService-logException()");
	}
	public void logOk(){
		System.out.println("LogService-logOk()");
	}
}
