package com.jlc.util;

import java.util.Calendar;
import java.util.Formatter;

public class Lab6 {
	public static void main(String[] args) {
		Formatter f1=new Formatter();
		String name="Srinivas";
		int age=16;
		f1.format("My name is %s and age is %d", name,age);
		System.out.println(f1);
		
		Formatter f2=new Formatter();
		f2.format("%c-%f-%b %n% 05d-%o-%x", 'c',99.99,true,25,15,30);
		System.out.println(f2);
		System.out.println("----");
		Formatter f3=new Formatter();
		Calendar cal=Calendar.getInstance(); 
		f3.format("%tr %n %tc %n %tl:%tM", cal,cal,cal,cal);
		System.out.println(f3);
		
		System.out.printf("My name is %s and age is %d %n", name,age);
		System.out.printf("%c-%f-%b %n% 05d-%o-%x", 'c',99.99,true,25,15,30);
		
	}
}
