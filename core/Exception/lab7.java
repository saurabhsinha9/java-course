class Hello{
void m1() throws ArithmeticException,ArrayIndexOutOfBoundsException{
try{
m2();
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("m1----ok");
if(1==2){
throw new ArrayIndexOutOfBoundsException();
}
else{
throw new ArithmeticException("Dont do this");
}
}
}
void m2()throws ArrayIndexOutOfBoundsException{
m3();
}
void m3()throws ArrayIndexOutOfBoundsException{
try{
m4();
}
catch(ArithmeticException e){
System.out.println("m3----ok");
throw new ArrayIndexOutOfBoundsException();
}
}
void m4() throws ArithmeticException{
m5();
}
void m5() throws ArithmeticException{
int x=10/0;
}
}
public class lab7{
public static void main(String args[]){
try{
Hello h= new Hello();
h.m1();
}
catch(Exception e){
System.out.println(e);
System.out.println(e.getMessage());
e.printStackTrace();
}
}
}