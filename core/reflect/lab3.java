package com.jlcindia1;
import java.lang.reflect.*;

class Hello{
public void show(){
System.out.println("show");
}

public void m1(String s1,String s2){
System.out.println("m1");
System.out.println(s1);
System.out.println(s2);
}

public void m2(int x,int y){
System.out.println("m2");
System.out.println(x);
System.out.println(y);
}
}

class lab3{
public static void main(String args[]){

try{
Class cls=Class.forName("com.jlcindia1.Hello");
Hello h;
h=(Hello)cls.newInstance();


//invoking method dynamically
 Method mm[]=cls.getDeclaredMethods();
for(int i=0;i<mm.length;i++){
if(mm[i].getName().equals("show")){
mm[i].invoke(h,null);
}

if(mm[i].getName().equals("m1")){
Object o[]={"jlc1","jlc2"};
mm[i].invoke(h,o);
}

if(mm[i].getName().equals("m2")){
Object o[]={new Integer(99),new Integer(88)};
mm[i].invoke(h,o);
}
}
}catch(Exception e){
e.printStackTrace();
}
}
}