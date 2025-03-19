package com.jlcindia.generics;

import java.util.*;
class A{
	
}

class Hai{	
       void m1(){
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("JLC1");
		al1.add("JLC2");
		al1.add("JLC3");
		al1.add("JLC4");
		show(al1);
		System.out.println("-------");
		ArrayList<Integer> al2=new ArrayList<Integer>();
		
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		show(al2);
		System.out.println("-------");
		ArrayList<Object> al3=new ArrayList<Object>();
		al3.add(new Boolean(true));
		al3.add("java");
		al3.add(new Character('A'));
		al3.add(new A());
		al3.add(new Integer(25));
		al3.add(20);
		al3.add(false);
		al3.add('S');
		show(al3);
		System.out.println("-------");
	}
       void show(List<?> al){//List of any Type is allowed
    	   for(Object o:al)
    		   System.out.println(o);
       }

}
