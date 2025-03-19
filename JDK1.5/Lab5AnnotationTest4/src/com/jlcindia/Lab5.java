package com.jlcindia;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface Jlc{
	
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Name{
	String value();
}

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Author {	
	String name();
	int age();
}

/*
 * 
 * Now Using Annotation
 */


@Jlc
@Author(name="sri",age=99)
class Hello{}


class A extends Hello{
	@Jlc
	String str;
	
	@Jlc
	@Name("Srinivas")
	public void m1(){
		System.out.println("m1");
	}
	@Deprecated
	void m2(){
		
	}
}
public class Lab5 {
public static void main(String[] args)throws Exception {
	Class cls=Class.forName("com.jlcindia.A");
	System.out.println(cls.getSimpleName());
	System.out.println(cls.getCanonicalName());
	System.out.println(cls.getConstructors());
	
	boolean b1=cls.isAnnotationPresent(Jlc.class);
	System.out.println(b1);
	if(b1){
		System.out.println("ok");
	}
	
	b1=cls.isAnnotationPresent(Author.class);
	System.out.println(b1);
	if(b1){
		Author au=(Author) cls.getAnnotation(Author.class);
		System.out.println(au.name()+"\t"+au.age());
	}
	
	Method[] ms=cls.getMethods();
	Method mm=null;
	for(Method m:ms){
		System.out.println(m.getName());
		if(m.getName().equals("m1")){
			mm=m;
			break;
		}
	}
	System.out.println(mm.getName());
	
	boolean b3=mm.isAnnotationPresent(Jlc.class);
	System.out.println(b3);
	if(b3){
		System.out.println("m1() contains Jlc Annotation");
	}
	
	boolean b4=mm.isAnnotationPresent(Name.class);
	System.out.println(b4);
	if(b4){
		System.out.println("m1() contains Name Annotation");
		Name na=mm.getAnnotation(Name.class);
		System.out.println(na.value());
	}

}
}
