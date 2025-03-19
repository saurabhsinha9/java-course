public class lab77{
public static void main(String args[]){
String ss="jlcindia";
String sss="jlcindia9";
String str="jlc";
System.out.println(str);
System.out.println(str+"india");
System.out.println(str);
str=str+"india";
System.out.println(str);
System.out.println(ss==str);
String str1="jlc"+"india";
System.out.println(ss==str1);
String s1="india";
String str2="jlc"+s1;
System.out.println(ss==str2);
String str3=str+s1;
System.out.println(str3);
System.out.println(ss==str3);
String str4=ss+9;
System.out.println(str4);
System.out.println(str4==sss);
String str5=9.9+ss+true;
System.out.println(str5);
char a='a';
char b='b';
System.out.println(a+b+" "+a+b);
System.out.println(a+b+" "+(a+b));
System.out.println(a+b+" "+(a-b));
}
}