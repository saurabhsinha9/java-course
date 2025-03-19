package com.jlcindia.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hello {
	ArrayList m1(){
		ArrayList al=new ArrayList();
		al.add("JLC");
		al.add(new Integer(100));
		al.add(new Double(99.99));
		return al;
		
	}
	void m2(){
		ArrayList al=m1();
		System.out.println(al);
		Iterator it=al.iterator();
		while(it.hasNext()){
			Object o=it.next();
			if(o instanceof String){
				String str=(String)o;
				System.out.println(str+"  String Length "+str.length());
			}
			else if(o instanceof Integer){
				Integer i=(Integer)o;
				System.out.println(i);
			}
			else if(o instanceof Double){
				Double d=(Double)o;
				System.out.println(d);
			}
			
		}
	}
	ArrayList<String> m3(){
	ArrayList<String> al=new  ArrayList<String>();
	al.add("JLC1");
	al.add("JLC2");
	al.add("JLC3");
	al.add("JLC4");
	//al.add(new Integer(99));
	//al.add(new Double(88.88));
	return al;
	}
	
	void m4(){
		ArrayList<String> al=m3();
		for(String str:al)
			System.out.println(str);
		
	}
	void m5(){
	HashSet<Integer> hs=new HashSet<Integer>();
	hs.add(10);
	hs.add(30);
	hs.add(new Integer(40));
	hs.add(20);
	//hs.add("JLC");
	for(int x:hs){
		System.out.println(x);
	}
	
	}
	void m6(){
		HashMap<String,String> hm1=new HashMap<String,String>();
		hm1.put("aa","11");
		hm1.put("bb", "22");
		//hm1.put("aa", 123);
		HashMap<String,Integer> hm2=new HashMap<String,Integer>();
		hm2.put("aa", 123);
		hm2.put("bb", 456);
		Set<Map.Entry<String,String>> s=hm1.entrySet();
		for(Map.Entry<String,String> me:s){
			System.out.println(me.getKey()+"\t"+me.getValue());
			
		}
		Set<Map.Entry<String,Integer>> s1=hm2.entrySet();
		for(Map.Entry<String,Integer> me:s1){
			System.out.println(me.getKey()+"\t"+me.getValue());
			
		}
	}
	
	void m7(){
		ArrayList<Customer> al=new ArrayList<Customer>();
		al.add(new Customer(101,"aaa",444));
		al.add(new Customer(103,"ccc",333));
		al.add(new Customer(102,"bbb",222));
		for(Customer c:al){
			System.out.println(c);
		}
		System.out.println("*******sorted by cid**********");
		Collections.sort(al);
		for(Customer c:al){
			System.out.println(c);
		}
		System.out.println("*******sorted by cname**********");
		Collections.sort(al,new CnameComparator());
		for(Customer c:al){
			System.out.println(c);
		}
		System.out.println("*******sorted by phone**********");
		Collections.sort(al,new phoneComparator());
		for(Customer c:al){
			System.out.println(c);
		}
	}
}
