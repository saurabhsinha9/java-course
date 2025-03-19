package com.jlcindia.spring.aop;

public class HaiServiceImpl implements HaiService {

	public String m2(String p1, String p2){
		System.out.println("HaiService-m2()");
		return "I am m2()";
	}
}
