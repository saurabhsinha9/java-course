package com.jlcindia.spring3.ioc;

public class Hello {

	private B bobj=null;
	private A aobj=null;
	
	
	public void setBobj(B bobj) {
		this.bobj = bobj;
	}


	public void setAobj(A aobj) {
		this.aobj = aobj;
	}


	public void m1() {
		bobj.showB();
		aobj.showA();
		bobj.showA();
		//aobj.showB();
	}
	
	
}
