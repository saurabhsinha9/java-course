package com.jlcindia.anno;


class Hai{
	
	void m1(){
		System.out.println("m1");
	}
	@Deprecated
	void m2(){
		System.out.println("m2");
	}
}
@Author(age = 20, name = "Saurabh")
class A extends Hai{
	@Override
	void m1() {
		// TODO Auto-generated method stub
		super.m1();
	}
}

public class Lab1 {
public static void main(String[] args) {
	try {
		Class cls=Class.forName("com.jlcindia.anno.A");
		boolean b=cls.isAnnotationPresent(Author.class);
		if(b){
			Author a=(Author) cls.getAnnotation(Author.class);
			System.out.println(a.name()+"\t"+a.age()+"\t"+a.b);
		}else{
			System.out.println("No annotation");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
