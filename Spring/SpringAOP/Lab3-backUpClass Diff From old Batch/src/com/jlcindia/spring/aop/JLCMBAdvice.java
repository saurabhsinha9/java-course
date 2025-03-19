package com.jlcindia.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.beans.factory.annotation.Autowired;

public class JLCMBAdvice implements MethodBeforeAdvice{
	static{
		System.out.println("JLCMBAdvice-S.B");
	}
	public  JLCMBAdvice(){
		System.out.println("JLCMBAdvice-D.C");
	}

	@Autowired
	SecurityService ss=null;
	@Autowired
	LogService ls=null;
	@Autowired
	TxService ts=null;
	public void before(Method m,Object[] args,Object target)throws Throwable{
      ss.verifyUser();
      ls.logBefore();
      ts.begin();
	}

}
