package com.jlcindia.spring.aop;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;

public class JLCMTAdvice implements ThrowsAdvice {
	static{
		System.out.println("JLCMTAdvice  -S.B");
	}
	public JLCMTAdvice(){
		System.out.println("JLCMTAdvice  -D.C");
	}
	@Autowired
	  LogService ls=null;
	@Autowired
	  TxService ts=null;
	 public void afterThrowing(Exception e) {
			ts.rollback();
            ls.logThrowing(e);

		}

}
