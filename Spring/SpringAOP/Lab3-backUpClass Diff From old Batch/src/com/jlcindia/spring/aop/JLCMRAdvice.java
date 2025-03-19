package com.jlcindia.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.beans.factory.annotation.Autowired;

public class JLCMRAdvice implements AfterReturningAdvice {
	static{
		System.out.println("JLCMRAdvice -S.B");
	}
	public  JLCMRAdvice (){
		System.out.println("JLCMRAdvice -D.C");
	}
	@Autowired
	LogService ls=null;
	@Autowired
	TxService ts=null;
	
	public void afterReturning(Object rv, Method m, Object[] args,
			Object target) throws Throwable {
		ts.commit();
		ls.logReturning();
	}

}
