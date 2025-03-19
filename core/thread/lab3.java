//developing thread by extending java.lang.Runnable interface
class stack{
int x;
void push(int a){
x=a;
}
int pop(){
return x;
}
}
class ThreadA implements Runnable{
stack st =null;
public ThreadA(stack st, String tname){
//public ThreadA(stack st, String tname,ThreadGroup tg){
//public ThreadA(stack st,ThreadGroup tg){
System.out.println(tname);
Thread t=new Thread(this,tname);
System.out.println(this+"\t"+tname);
/*
Thread t=new Thread(this);
System.out.println(this);

Thread t=new Thread(tg,this,tname);
System.out.println(tg);
System.out.println(this);


Thread t=new Thread(tg,this);
System.out.println(this);
*/
System.out.println(t);
System.out.println(t.getName());
System.out.println(t.getPriority());
System.out.println(t.getThreadGroup());
this.st=st;
t.start();
}
public void run(){
for (int i=1;i<=5;i++){
st.push(i);
System.out.println(i+"is pushed by A");
try{
Thread.sleep(500);
}
catch(Exception e){}
}
}
}
class ThreadB extends Thread{
stack st =null;
public ThreadB(stack st, String tname){
super(tname);
this.st=st;
System.out.println(tname);
System.out.println(getPriority());
System.out.println(getThreadGroup());
start();

}
public void run(){
for (int i=1;i<=5;i++){
int x=st.pop();
System.out.println(x+"is poped by B");
try{
Thread.sleep(500);
}
catch(Exception e){}
}
}
}
class lab3{
public static void main(String args[]){
stack st=new stack();
//ThreadGroup tg=new ThreadGroup("jlc");
ThreadA a=new ThreadA(st,"A");
//ThreadA a=new ThreadA(st,"A",tg);
//ThreadA a=new ThreadA(st,tg);
ThreadB b=new ThreadB(st,"B");
for (int i=101;i<=105;i++){
System.out.println(i+"by..........................."+Thread.currentThread().getName());
try{
Thread.sleep(5000);
}
catch(Exception e){}
}
}
}