package com.jlcindia.java2drawback;

import java.util.ArrayList;
import java.util.Iterator;

class A{
	
	/*
	 * at run time java.lang.ClassCastException
	 * ArrayList<String> m2(){
		ArrayList<String> al=new ArrayList<String>(); 
		return al;
	}*/
	ArrayList m1(){
		ArrayList al=new ArrayList();
		al.add("sri");
		al.add(new Integer(10));
		al.add(new Float(10.2f));
		al.add(new Byte((byte) 12));
		al.add(new Short((short) 123));
		al.add(new Double(12.36));
		al.add(new Long(4567));
		al.add(new Character('a'));
		al.add(new Boolean(true));
		return al;
	}
}
class  B{
	void show(){
		A a=new A();
		ArrayList al=a.m1();
		Iterator it=al.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			if(obj instanceof String){
				String str=obj.toString();
				System.out.println(str);
			}else if(obj instanceof Integer){
				Integer i=(Integer)obj;
				int x=i.intValue();
				System.out.println(x);
			}else if(obj instanceof Float){
				Float i=(Float)obj;
				float x=i.floatValue();
				System.out.println(x);
			}
		}
		
	}
}

public class Lab1 {
public static void main(String[] args) {
	B b=new B();
	b.show();
}
}
