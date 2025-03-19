package com.jlc;
import java.lang.reflect.*;

interface i1{
}

interface i2{
}

class A{
}

final class Hello extends A implements i1,i2{

int a=10;
int b;

Hello(){
}

Hello(int b){
this.b=b;
}

void show(){
System.out.println(a);
System.out.println(b);
}
}

class lab1{
public static void main(String args[]){

try{
//Hello hh= new Hello();//static object creation
//hh.show();

Class cls=Class.forName("com.jlc.Hello");
Object obj=cls.newInstance();
Hello h=(Hello) obj;
h.show();
System.out.println(cls);
System.out.println(cls.getName());
System.out.println(cls.getPackage());
System.out.println(cls.getPackage().getName());
System.out.println(cls.getSuperclass());
System.out.println(cls.getSuperclass().getName());
Class c[]=cls.getInterfaces();
for(int i=0;i<c.length;i++){
System.out.print(c[i].getName());
System.out.println();
}
System.out.println(cls.getModifiers());
System.out.println(Modifier.PUBLIC);
System.out.println(Modifier.FINAL);
}
catch(Exception e){
e.printStackTrace();
}
}
}