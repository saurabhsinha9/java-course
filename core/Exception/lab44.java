class Hello{
int m1(String s){
System.out.println("m1 begin");
try{
int x=Integer.parseInt(s);
int y=10/x;
System.out.println(y);
return y;//not execute
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println(e);
return 11;//not executed
}
finally{
System.out.println("Resource cleanup");
System.out.println("I am  ok");
return 22;//always execute
}
//System.out.println("I am not ok");
//return 33;
}
}
class lab44{
public static void main(String[] args){
System.out.println("main begin");
Hello h=new Hello();
int s=h.m1(args[0]);

System.out.println(s);
System.out.println("main end");
}
}