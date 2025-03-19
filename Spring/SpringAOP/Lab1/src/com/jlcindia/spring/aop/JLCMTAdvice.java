package com.jlcindia.spring.aop;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;

public class JLCMTAdvice implements ThrowsAdvice{
	@Autowired
	LogService ls=null;
	
	public void afterThrowing(Exception e){
		ls.logException();
	}
}
