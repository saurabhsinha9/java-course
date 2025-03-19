package com.jlcindia.spring.aop;

public class HelloServiceImpl implements HelloService{
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

	public void am1(){
		System.out.println("HelloService-am1");
	}
	
	public void am2()throws Exception{
		System.out.println("HelloService-am2-begin");
		if(1==1){
			throw new Exception();
		}
		System.out.println("HelloService-am2 End");
	}

	public void test1() {
		System.out.println("HelloService-test1");
	}
}
