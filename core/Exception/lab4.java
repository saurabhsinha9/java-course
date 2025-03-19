class Hello{
int m1(String s){
try{
int x=Integer.parseInt(s);
int y=10/x;
System.out.println(y);
//System.exit(0);
return y;
}
catch(Exception e){
System.out.println(e);
}
finally{
System.out.println("Resource cleanup can be done here-prefer me than finalize() method");
System.out.println("I am ok");
}
System.out.println("I am not ok");
return 99;
}
void m2(){
try{
int x=10/0;
}
finally{
System.out.println("I am inside finally");
}
System.out.println("I am outside finally");
}
}
class lab4{
public static void main(String[] args){
System.out.println("main begin");
Hello h=new Hello();
int s=h.m1(args[0]);
//h.m2();
System.out.println(s);
System.out.println("main end");
}
}