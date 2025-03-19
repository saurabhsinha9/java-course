package com.jlcindia.normalimport.hello;

import java.lang.*;
import java.util.*;

import com.jlcindia.staticimport.hai.Hai;

public class Hello {
	public static void main(String[] args) {
		Hello h=new Hello();
		h.m1();
		ArrayList al=new ArrayList();
		al.add(new Integer(12));
		al.add(new Integer(12));
		al.add(new Integer(12));
		al.add(new Integer(12));
		System.out.println(al);
		Vector v=new Vector();
		v.addElement(al);
		System.out.println(v);
		Hai hai=new Hai();
		hai.m1();
	}
void m1(){
	System.out.println(Math.sqrt(25));
	
}
void m2(){
	int x=12;
	Integer i1=new Integer(x);
}
}
