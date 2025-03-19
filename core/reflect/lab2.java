package com.jlcindia;
import java.lang.reflect.*;

class Hai{
public int x=200;
public void Hai(){
System.out.println("Hai");
}
}

class Hello extends Hai{
public static final int a=10;
public static int b=20;

public Hello(){
}

public Hello(int b){
this.b=b;
}

public void show(){
System.out.println("show()");
System.out.println(a);
System.out.println(b);
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

class lab2{
public static void main(String args[]){

try{
Class cls=Class.forName("com.jlcindia.Hello");
Hello h;
h=(Hello)cls.newInstance();
h.show();
System.out.println(Modifier.PUBLIC);
System.out.println(Modifier.FINAL);
System.out.println(Modifier.STATIC);

//fields
System.out.println("fields");
Field f[]=cls.getFields();
System.out.println("no of var"+f.length);
for(int i=0;i<f.length;i++){
System.out.println(f[i].getModifiers()+"******"+f[i].getType()+"********"+f[i].getName());
}
System.out.println();
//Declared fields
System.out.println("Declared fields");
Field ff[]=cls.getDeclaredFields();
System.out.println("no of var"+ff.length);
for(int i=0;i<ff.length;i++){
System.out.println(ff[i].getModifiers()+"******"+ff[i].getType()+"********"+ff[i].getName());
}
System.out.println();

//methods
System.out.println("Methods");
Method m[]=cls.getMethods();
System.out.println("no of method"+m.length);
for(int i=0;i<m.length;i++){
System.out.println(m[i].getModifiers()+"******"+m[i].getReturnType()+"********"+m[i].getName());
}

//Declared methods
System.out.println("Declared Methods");
Method mm[]=cls.getDeclaredMethods();
System.out.println("no of method"+mm.length);
for(int i=0;i<mm.length;i++){
System.out.println(mm[i].getModifiers()+"******"+mm[i].getReturnType()+"********"+mm[i].getName());
}

//Constructors
System.out.println("Constructors");
Constructor c[]=cls.getConstructors();
System.out.println("no of Constructor"+c.length);
for(int i=0;i<c.length;i++){
System.out.println(c[i].getModifiers()+"**************"+c[i].getName());
}

//invoking method dynamically
 mm=cls.getDeclaredMethods();
for(int i=0;i<mm.length;i++){
if(mm[i].getName().equals("show")){
mm[i].invoke(h,null);//invoke metod show() with reference h passing null as parameter
}

if(mm[i].getName().equals("m2")){
Object o[]={new Integer(5),new Integer(6)};
mm[i].invoke(h,o);//invoke metod m2() with reference h passing given parameter
}


}
}
catch(Exception e){
e.printStackTrace();
}
}
}