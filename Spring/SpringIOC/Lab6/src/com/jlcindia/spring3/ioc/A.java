package com.jlcindia.spring3.ioc;

public class A {

	int a;
	String msg1;
	
	public void setA(int a) {
		this.a = a;
	}
	
	public void setMsg1(String msg1) {
		this.msg1 = msg1;
	}




	public void showA() {
		System.out.println(msg1);
		System.out.println(a);
	}

}
