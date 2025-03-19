package com.jlcindia.spring.aop;

public class HelloService {
	public void m1(){
		System.out.println("HelloService-m1");
	}
	
	public void m2()throws Exception{
		System.out.println("HelloService-m2-begin");
		if(1==1){
			throw new Exception();
		}
		System.out.println("HelloService-m2 End");
	}
}
