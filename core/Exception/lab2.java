class lab2{
public static void main(String[] args){
System.out.println("main begin");
try{
int x=Integer.parseInt(args[0]);
System.out.println(x);
int y=10/x;
System.out.println(y);
}
//System.out.println("not ok");
catch(ArrayIndexOutOfBoundsException e){
System.out.println("please provide the value");
System.out.println(e);
}
//System.out.println("not ok");
catch(NumberFormatException e){
System.out.println("please provide integer number");
System.out.println(e);
}
catch(ArithmeticException e){
System.out.println("please dont provide zero");
System.out.println(e);
}
catch(Exception e){
System.out.println("please dont do this");
System.out.println(e);
}
System.out.println("main end");
}
}