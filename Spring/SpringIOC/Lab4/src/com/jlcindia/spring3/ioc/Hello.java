package com.jlcindia.spring3.ioc;

public class Hello {

	private Hai hai=null;
	private A aobj=null;
	
	public void setHai(Hai hai) {
		this.hai = hai;
	}
	public void setAobj(A aobj) {
		this.aobj = aobj;
	}
	public void m1() {
		hai.show();
		aobj.show();
	}
	
	
}
