import java .util.*;

public class lab12{
public static void main(String args[]){
String str="Welcome to java Learning center to learn java and advance java.Thankyou";
StringTokenizer token=new StringTokenizer(str);
System.out.println(token);
System.out.println("\n");

System.out.println(token.hasMoreTokens());
System.out.println("\n");

System.out.println(token.countTokens());
System.out.println("\n");

while(token.hasMoreTokens()){
String str1=token.nextToken();
System.out.println(str1);
}
System.out.println("\n");
System.out.println(token.hasMoreTokens());
System.out.println("\n");

System.out.println(token.countTokens());
System.out.println("\n");
System.out.println("*****************************************************************************");

StringTokenizer token1=new StringTokenizer(str,"ja");
System.out.println(token1);
System.out.println("\n");

System.out.println(token1.hasMoreTokens());
System.out.println("\n");

System.out.println(token1.countTokens());
System.out.println("\n");

while(token1.hasMoreTokens()){
Object obj=token1.nextToken();
System.out.println(obj);
}
System.out.println("*****************************************************************************");
System.out.println("*****************************************************************************");
System.out.println("*****************************************************************************");

System.out.println("\n");

System.out.println(token1.hasMoreTokens());
System.out.println("\n");

System.out.println(token1.countTokens());
System.out.println("\n");

}
}