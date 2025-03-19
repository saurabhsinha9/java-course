class lab1{
public static void main(String arg[]){
System.out.println("begin");
try{
int a=Integer.parseInt(arg[0]);
int x=10/a;
System.out.println(x);
}
//System.out.println("mid");    //not ok
catch(Exception e){
System.out.println(e);
System.out.println("Sorry,your data is incorrect... ");
}
System.out.println("end");
}
}