class lab1{
public static void main(String args[]){
System.out.println("main begin");
Thread t=Thread.currentThread();
System.out.println(t);
System.out.println(t.getName());
System.out.println(t.getPriority());
System.out.println(t.getThreadGroup());
t.setName("jlc");
 t.setPriority(1);
 System.out.println(t);
System.out.println(t.getName());
System.out.println(t.getPriority());
System.out.println(t.getThreadGroup());
try{int x=10/0;}catch(Exception e){}
System.out.println("main end");
}
}