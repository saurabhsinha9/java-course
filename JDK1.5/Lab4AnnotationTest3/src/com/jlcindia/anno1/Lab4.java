package com.jlcindia.anno1;

import com.jlcindia.anno.Author;
import com.jlcindia.anno.Jlc;
import com.jlcindia.anno.Servlet;

@Deprecated
@Jlc
class Hai{	
}

@Author(empId=101,desig="S.E",age=16,dept="I.T")
class Hello extends Hai{
	@Deprecated
	@Jlc
	void m1(){
		System.out.println("m1");
	}
}
@Servlet(name="hello",url="/hello.jlc",load=1)
class HelloServlet{
	
}

public class Lab4 {
public static void main(String[] args) {
	//Developing APT
	try {
		Class cls1=Class.forName("com.jlcindia.anno1.Hello");
		
		boolean b1=cls1.isAnnotationPresent(Author.class);
		System.out.println(b1);
		if(b1){
			Author au=(Author) cls1.getAnnotation(Author.class);
			System.out.println(au.empId()+"\t"+au.desig()+"\t"+au.age()+"\t"+au.dept());
		}
		
		boolean b2=cls1.isAnnotationPresent(Jlc.class);
		System.out.println(b2);
		
		boolean b3=cls1.isAnnotationPresent(Deprecated.class);
		System.out.println(b3);
		System.out.println("-----");
		
		Class cls2=Class.forName("com.jlcindia.anno1.HelloServlet");
		b1=cls2.isAnnotationPresent(Servlet.class);
		System.out.println(b1);
		if(b1){
			Servlet s=(Servlet) cls2.getAnnotation(Servlet.class);
			System.out.println(s.name()+"\t"+s.url()+"\t"+s.load());
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
