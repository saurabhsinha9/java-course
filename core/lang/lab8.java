public class lab8{

public static void main(String args[]){
String str="jlcindiajlc";
System.out.println("***************");
System.out.println("***************");
System.out.println("***************");
System.out.println(str.length());
byte b[]=new byte[15];
b=str.getBytes();//converting into byte array
for(int i=0;i<b.length;i++){
System.out.println((char)b[i]+"......");
}
System.out.println("***************");
System.out.println("***************");
System.out.println("***************");
char c[]=new char[15];
c=str.toCharArray();//converting into character array
for(int i=0;i<c.length;i++){
System.out.println(c[i]+"......");
}
System.out.println("***************");
System.out.println("***************");
System.out.println("***************");
//getBytes(index of the first character in the String to copy into the byte array,index one greater than the last character in the String to copy into the byte array,byte array that will contain the contents of the current String, index within the byte array that will hold the first character copied from the String)
System.out.println("***************");
System.out.println("***************");
System.out.println("***************");
byte b1[]=new byte[15];
str.getBytes(3,8,b1,6);
for(int i=0;i<b1.length;i++){
System.out.println((char)b1[i]+"......");
}
System.out.println("***************");
System.out.println("***************");
System.out.println("***************");
//getChars(index of the first character in the String to copy into the char array,index one greater than the last character in the String to copy into the char array,char array that will contain the contents of the current String, index within the char array that will hold the first character copied from the String)
System.out.println("***************");
System.out.println("***************");
System.out.println("***************");

char c1[]=new char[15];
str.getChars(3,8,c1,7);
for(int i=0;i<c1.length;i++){
System.out.println(c1[i]+"......");
}
System.out.println("***************");
System.out.println("***************");
System.out.println("***************");
System.out.println("***************");
System.out.println("***************");
System.out.println("***************");
System.out.println("***************");
System.out.println("***************");
System.out.println("***************");

//String s5=new String(2,8,c1);//not be accessed outside the pkg bcoz String(int,int,char[]) is default,not public
String s1=new String(b);//converting byte array to string
System.out.println(s1);
System.out.println(s1.length());
System.out.println("***************");
System.out.println("***************");
System.out.println("***************");

String s2=new String(c);//converting char array to string
System.out.println(s2);
System.out.println(s2.length());
}
}