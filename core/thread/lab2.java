//developing thread by extending java.lang.Thread class
class HelloThread extends Thread{
public HelloThread(String tname){
super(tname);
start();
}
public void run(){
for (int i=101;i<=105;i++){
System.out.println(i+"by..........................."+Thread.currentThread().getName());
try{
Thread.sleep(500);
}
catch(Exception e){}
}
}
}

class lab2{
public static void main(String args[]){
System.out.println("main begin");
HelloThread h1=new HelloThread("A");
HelloThread h2=new HelloThread("B");
HelloThread h3=new HelloThread("C");
for (int i=1;i<=5;i++){
System.out.println(i+"by............................"+Thread.currentThread().getName());
try{
Thread.sleep(500);
}
catch(Exception e){}
}
System.out.println("main end");
}
}