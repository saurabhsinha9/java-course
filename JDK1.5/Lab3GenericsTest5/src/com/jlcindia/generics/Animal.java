package com.jlcindia.generics;

public abstract class Animal {
	abstract void eating();

}
class Dog extends Animal{
	void eating(){
		System.out.println("Dog eating");
	}
}
class Cat extends Animal{
	void eating(){
		System.out.println("cat eating");
	}
}
class A{}
