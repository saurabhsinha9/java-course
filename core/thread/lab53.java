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
void m2(){
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
class lab53{
public static void main(String args[]){
Hello h=new Hello();
new ThreadA(h,"A");
new ThreadB(h,"B");
}
}

/*
Case 3-m1() synchronized & m2() not  synchronized 
ThreadA "A" calling m1 with object h
ThreadB "B" calling m2 with object h 

soln-Both will run concurrently

when one thread is executing synchronized code,it will not allow other thread to execute synchronized code.but it allows other thread to execute non synchronized code.


o/p---
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