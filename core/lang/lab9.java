public class lab9{

public static void main(String args[]){
String str="jlcindiajlc";
System.out.println("***************");
System.out.println(str.charAt(3));
System.out.println(str.indexOf('i'));
System.out.println(str.lastIndexOf('i'));
System.out.println(str.indexOf('i',4));
System.out.println(str.lastIndexOf('i',4));
System.out.println("***************");
System.out.println("***************");
String s3="   123  abc  ";
System.out.println(s3);
System.out.println(s3.length());
s3=s3.trim();
System.out.println(s3);
System.out.println(s3.length());
System.out.println("***************");
System.out.println("***************");
System.out.println(str);
String str1=str.replace('i','x');
System.out.println(str);//showing that string are immutable ie str is not modified after replacing
System.out.println(str1);
System.out.println("***************");
System.out.println("***************");
str=str.replace('i','x');//explicitly we are creating new str object by replacing and assigning
System.out.println(str);
System.out.println("***************");
System.out.println("***************");

String str2=str.substring(3);//Substring means after leaving the 3 character from the main String remaining is substring 
System.out.println(str2);
String str3=str.substring(3,8);//after 3 char and before 8 char will be taken remaining will be discarded
System.out.println(str3);
}
}