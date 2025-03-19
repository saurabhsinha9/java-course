package com.jlcindia.generics;

import java.util.*;

public class Lab1 {

	public static void main(String[] args) {
		
     List<Animal> l=new ArrayList<Animal>();
     l.add(new Dog());
     l.add(new Cat());
     //l.add(new A());
     show(l);
     System.out.println("------------------");

    
     
     List<Cat> l3=new ArrayList<Cat>();
     l3.add(new Cat());
     l3.add(new Cat());
     //l.add(new A());
     show(l3);
     System.out.println("------------------");
	}
	static void show(List<? extends Animal> l){
		for(Animal a:l)
			a.eating();
	}
}
