/* finalize() example*/

class Hai{
public void finalize(){
System.out.println("Hai finalize()");
}
}
class Hello{
void m1(){
System.out.println("m1-begin");
Hai hai1=new Hai();
Hai hai2=new Hai();
Hai hai3=new Hai();
System.out.println("m1-end");
}
void m2(){
System.out.println("m2-begin");
System.runFinalization();//call finalize() on Hai class Object 3 hai+1 hai+3 hai
System.gc();//cleaning the memory 
Hai hai1=new Hai();
System.out.println("m2-end");
}
public void finalize(){
System.out.println("Hello finalize()");
}
}
class A{
void show(){
Hello h1=new Hello();
h1.m1();
h1.m2();
Hello h2=new Hello();
h2.m1();
h2.m2();
System.runFinalization();//call finalize() on Hai class Object 1 hai
System.gc();//cleaning the memory
}
public void finalize(){
System.out.println("A finalize()");
}
}
class lab3{
public static void main(String args[]){
A obj=new A();
obj.show();
System.runFinalization();//call finalize() in A class Object  of Hello class 2 hello
System.gc();//cleaning the memory
}
}