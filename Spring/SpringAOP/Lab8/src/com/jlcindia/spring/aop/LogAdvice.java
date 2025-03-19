package com.jlcindia.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAdvice {
	@Pointcut("execution(* *.m*(..))")
	public void jlc(){}
	
	@Before("jlc() && args(p1,p2)")
	public void logParams(String p1,String p2){
		System.out.println("LogAdvice-logParams()"+p1+","+p2);
		p1="aaaa";
		p2="bbbb";
		System.out.println("LogAdvice-logParams()"+p1+","+p2);
	}
	@AfterReturning(value="jlc()",returning="msg")
	public void logReturnValue(Object msg){
		System.out.println("LogAdvice-logReturnValue()"+msg);
	}
	@AfterThrowing(value="jlc()",throwing="e")
	public void logException(Exception e){
		System.out.println("LogAdvice-logException()"+e);
	}
	@After("jlc()")
	public void log(){
		System.out.println("LogAdvice-log()");
	}
}
