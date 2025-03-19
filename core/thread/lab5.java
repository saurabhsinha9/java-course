class Hello{
synchronized void m1(){
for(int i=1;i<5;i++){
System.out.println("m1--"+i+"by"+Thread.currentThread().getName());
try{
Thread.sleep(1200);
}
catch(Exception e){}
}
}
synchronized void m2(){
for(int i=10;i<15;i++){
System.out.println("m2--"+i+"by"+Thread.currentThread().getName());
try{
Thread.sleep(1200);
}
catch(Exception e){}
}
}
}
class A implements Runnable{
Hello h=null;
A(Hello h,String name){
this.h=h;
Thread t=new Thread(this,name);
t.start();
System.out.println(t.getThreadGroup().getName());
}
public void run(){
h.m1();
}
}

class B implements Runnable{
Hello h=null;
B(Hello h,String name){
this.h=h;
Thread t2=new Thread(this,name);
t2.start();
System.out.println(t2.getThreadGroup().getName());
}
public void run(){
h.m2();
}
}
class lab5{
public static void main(String args[]){
Hello h=new Hello();
new A(h,"A");
new B(h,"B");
}
}
/*o/p----
main
m1--1byA
main
m1--2byA
m1--3byA
m1--4byA
m2--10byB
m2--11byB
m2--12byB
m2--13byB
m2--14byB
*/