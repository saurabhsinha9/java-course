package com.jlcindia.generics;

import java.util.ArrayList;

public class Lab1 {

	
	public static void main(String[] args) {
		 Hello h=new Hello();
		 ArrayList al=h.m1();
		 System.out.println(al);
		 System.out.println(h.m1());
		 System.out.println("-----");
		 h.m2();
		 System.out.println("-----");
		 ArrayList al1= h.m3();
		 System.out.println(al1);
		 System.out.println(h.m3());
		 System.out.println("-----");
		 h.m4();
		 System.out.println("-----");
		 h.m5();
		 System.out.println("-----");
		 h.m6();
		 h.m7();
	}

}
