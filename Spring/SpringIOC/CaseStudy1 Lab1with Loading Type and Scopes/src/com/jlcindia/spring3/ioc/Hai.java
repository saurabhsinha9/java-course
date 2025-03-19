package com.jlcindia.spring3.ioc;

public class Hai {

	static{
		System.out.println("Hai-SB");
	}
	String str;
	public Hai() {
		System.out.println("Hai-DC");
	}
	public void setStr(String str){
		System.out.println("Hai-setStr(String str) Setter Injection");
		this.str=str;
	}
	public void m2(){
		System.out.println("Hai-m2()");
		System.out.println(str);
	}
	
}
