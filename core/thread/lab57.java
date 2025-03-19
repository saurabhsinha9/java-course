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
class lab57{
public static void main(String args[]){
Hello h=new Hello();
new ThreadA(h,"A");
new ThreadB(h,"B");
}
}

/*

Case 6-m1() & m2() both are  synchronized,  both m1() & m2() are static same object or diff object
ThreadA "A" calling m1 with object h or h1
ThreadB "B" calling m2 with object h or h2

soln-No concurrency,Thread will run one by one
Because there is only one default object,if one threading is locking that object, another thread can't access that default object that time




*/