package com.jlcindia.java5generics;

import java.util.ArrayList;

class A{
	ArrayList<String> m1(){
		ArrayList<String> al=new ArrayList<String>();
		al.add("sri");
		//al.add(new Integer(10));
		return al;
	}
}
class  B{
	void show(){
		A a=new A();
		ArrayList<String> al=a.m1();
		for(String str:al){
			System.out.println(str);
		}
		
	}
}

public class Lab1 {
public static void main(String[] args) {
	B b=new B();
	b.show();
}
}
