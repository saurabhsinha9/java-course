public class lab10{
public static void main(String args[]){
String st1="abc";
String st2="aBc";
String st3="abc";

System.out.println("*****************");
System.out.println(st1.compareTo(st2));//(str1 char value-str2 char value)
System.out.println(st2.compareTo(st1));
System.out.println(st1.compareTo(st3));
System.out.println("*****************");

System.out.println(st1.compareToIgnoreCase(st2));
System.out.println(st2.compareToIgnoreCase(st1));
System.out.println(st1.compareToIgnoreCase(st3));
System.out.println(st1.equals(st2));//comparing the content
System.out.println(st2.equals(st1));
System.out.println(st1.equals(st3));
System.out.println(st1.equalsIgnoreCase(st2));
System.out.println(st2.equalsIgnoreCase(st1));
System.out.println(st1.equalsIgnoreCase(st3));
System.out.println("*****************");
System.out.println("*****************");

String str="jlcindiajlc";
System.out.println(str);
System.out.println(str.indexOf("jlc"));//Searches for the first occurrence of a character or substring. 
System.out.println(str.lastIndexOf("jlc"));//Searches for the last occurrence of a character or substring. 
System.out.println(str.indexOf("jlc",2));//indexOf( ), the search runs from startIndex to the end of the string
System.out.println(str.lastIndexOf("jlc",6));//For lastIndexOf(String,int), the search runs from startIndex to zero. 
System.out.println(str.startsWith("jlc"));
System.out.println(str.startsWith("sri"));
System.out.println(str.endsWith("jlc"));
System.out.println(str.endsWith("sri"));
}
//class A extends String{}
}