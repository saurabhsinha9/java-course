class A extends Thread{
A(ThreadGroup tg){
super(tg,"A");
start();
}
public void run(){
for(int i=1;i<=5;i++){
System.out.println("by "+Thread.currentThread().getName()+"			under group--		"+Thread.currentThread().getThreadGroup().getName());
try{
Thread.sleep(2000);
}catch(Exception e){
System.out.println(e);
}
}
}
}

class B implements Runnable{
B(ThreadGroup tg){
Thread t=new Thread(tg,this,"B");
t.start();
}
public void run(){
for(int i=1;i<=5;i++){
System.out.println("by "+Thread.currentThread().getName()+"			under group--		"+Thread.currentThread().getThreadGroup().getName());
try{
Thread.sleep(2000);
}catch(Exception e){
System.out.println(e);
}
}
}
}

class lab8{
public static void main(String args[]){
ThreadGroup tg1=new ThreadGroup("JLC1");
ThreadGroup tg2=new ThreadGroup("JLC2");
new A(tg1);
new B(tg2);
}
}