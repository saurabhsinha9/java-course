class Hello{
static synchronized void m1(){
for(int i=1;i<5;i++){
System.out.println("m1--"+i+"by"+Thread.currentThread().getName());
try{
Thread.sleep(1200);
}
catch(Exception e){}
}
}
static synchronized void m2(){
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
class lab56{
public static void main(String args[]){
Hello h1=new Hello();
Hello h2=new Hello();
new ThreadA(h1,"A");
new ThreadB(h2,"B");
}
}
/*
Case 6-m1() & m2() both are  synchronized,  both m1() & m2() are static same object or diff object
ThreadA "A" calling m1 with object h or h1
ThreadB "B" calling m2 with object h or h2

soln-No concurrency,Thread will run one by one
Because there is only one default object,if one threading is locking that object, another thread can't access that default object that time


o/p----
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