package com.jlc.struts2;

public class Hello {
	
	static{
		System.out.println("Hello-SB");
	}
	public Hello() {
		System.out.println("Hello-DC"); 
	}
	
	Hai hai=new Hai();
	
	String str="Hello guys";

	public Hai getHai() {
		System.out.println("getHai()");
		return hai;
	}

	public void setHai(Hai hai) {
		System.out.println("setHai()");
		this.hai = hai;
	}

	public String getStr() {
		System.out.println("getStr()");
		return str;
	}

	public void setStr(String str) {
		System.out.println("setStr()");
		this.str = str;
	}
	
	
	
}
