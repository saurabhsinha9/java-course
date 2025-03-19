package com.jlcindia.boxingunboxing;

import java.util.ArrayList;
import java.util.Iterator;

public class Lab1 {
public static void main(String[] args) {
	int i=74;
	//Integer i1=i;not ok with JAVA2 but ok with JAVA5
	Integer i1=new Integer(i);//Boxing//primitive to wrapper is called as Boxing
	System.out.println(i);
	System.out.println(i1);
	Integer i2=new Integer(10);//Boxing
	Integer i3=new Integer(20);//Boxing
	//System.out.println(i2+i3);not ok with JAVA2 but ok with JAVA5
	
	/*In java2 i2 or i3 represents
	a reference to java.lang.Integer
	
	Error:--The operator + is undefined for the argument type(s)
	 java.lang.Integer, java.lang.Integer
	*
	*
	*/
	//int x=i2;//not ok with JAVA2 but ok with JAVA5
	//wrapper to primitive UnBoxing
	int x=i2.intValue();//UnBoxing
	System.out.println(x);
	ArrayList al=new ArrayList();
	//al.add(123);//not ok with JAVA2 but ok with JAVA
	al.add(new Integer(123));////Boxing
	System.out.println(al);
	Iterator it=al.iterator();
	while(it.hasNext()){
		//int b=(Integer) it.next();
		Object o=it.next();
		Integer in=(Integer)o;
		int a=in.intValue();//UnBoxing
		System.out.println(a);
	}
}
}
