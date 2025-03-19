import java.io.*;
import java.sql.*;
class AException extends IOException{
}
class Hello{
void m1(int x)throws IOException,ArithmeticException{
if(x==1){
throw new ArithmeticException();
}
else{
throw new IOException();
}
}
}
class Hai extends Hello{
/*public void m1(int x){
System.out.println("Hai-m1");
}
//ok
void m1(int x)throws IOException,ArithmeticException{
System.out.println("Hai-m1");
}

//ok
void m1(int x)throws AException,ArithmeticException{
System.out.println("Hai-m1");
}

//not ok
void m1(int x)throws Exception,ArithmeticException{
System.out.println("Hai-m1");
}

//not ok
void m1(int x)throws AException,ArithmeticException,SQLException{
System.out.println("Hai-m1");
}
*/
}
class lab8{
public static void main(String[] args)throws IOException,ArithmeticException{
Hello h=new Hai();
h.m1(1);
}
}