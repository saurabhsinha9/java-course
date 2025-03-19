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
class ThreadA implements Runnable{
Hello h=null;
ThreadA(Hello h,String name){
this.h=h;
Thread t=new Thread(this,name);
t.start();
System.out.println(t.getThreadGroup().getName());
}
public void run(){
h.m1();
}
}

class ThreadB implements Runnable{
Hello h=null;
ThreadB(Hello h,String name){
this.h=h;
Thread t2=new Thread(this,name);
t2.start();
System.out.println(t2.getThreadGroup().getName());
}
public void run(){
h.m2();
}
}
class lab54{
public static void main(String args[]){
Hello h1=new Hello();
Hello h2=new Hello();
new ThreadA(h1,"A");
new ThreadB(h2,"B");
}
}
/*
Case 4-m1() & m2() both are   synchronized calling with diff object
ThreadA "A" calling m1 with object h1
ThreadB "B" calling m2 with object h2 

soln-Both will run concurrently

when one thread A is executing synchronized m1() method with object h1 then thread A occupy lock on the object h1 and ,it will not allow other thread to access that locked object.
but it allows other thread to access other object.

o/p--
main
m1--1byA
main
m2--10byB
m1--2byA
m2--11byB
m1--3byA
m2--12byB
m1--4byA
m2--13byB
m2--14byB
*/