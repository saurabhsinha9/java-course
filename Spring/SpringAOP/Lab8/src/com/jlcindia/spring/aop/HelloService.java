package com.jlcindia.spring.aop;

public class HelloService {
	public String m1(String p1,String p2){
		System.out.println("HelloService-m1()");
		return "I am m1()";
	}
	public String m2(String p1,String p2)throws Exception{
		System.out.println("HelloService-m2() begin");
		if(1==1){
			throw new Exception();
		}
		System.out.println("HelloService-m2() end");
		return "I am m2()";
	}
	public String am1(String p1,String p2){
		System.out.println("HelloService-am1()"+p1+","+p2);
		return "I am am1()";
	}
	public String am2(String p1,String p2){
		System.out.println("HelloService-am2()"+p1+","+p2);
		return "I am m2()";
	}
}
