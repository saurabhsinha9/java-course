package com.jlcindia.spring3.ioc;

public class Hello {

	private Hai hai=null;
	private A aobj=null;
	
	public Hello() {
		System.out.println("Hello 0 arg cons");
	}
	public Hello(Hai hai, A aobj) {
		System.out.println("Hello 2 arg cons");
		this.hai = hai;
		this.aobj = aobj;
	}

	public Hello(Hai hai) {
		System.out.println("Hello 1(Hai) arg cons");
		this.hai = hai;
	}
	public Hello(A aobj) {
		System.out.println("Hello 1(A) arg cons");
		this.aobj = aobj;
	}

	public void m1() {
		System.out.println("m1");
		//hai.show();
		//aobj.show();
	}
	
	
}
