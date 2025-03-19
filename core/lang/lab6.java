public class lab6{
public static void main(String args[]){
String s1="jlc";
String s2="jlc";
String s3=new String("jlc1");
String s4=new String("jlc1");
String s5=s4.intern();//with the use of intern (),the literal "jlc1" of s4 already resides in string constraint pool,when s4.intern(); is called then s5 will point to s4 "jlc1" literal
String s6="jlc1";
System.out.println(s1==s2);//address comparison
System.out.println(s2==s3);
System.out.println(s3==s4);
System.out.println(s6==s5);//true
System.out.println("******");
System.out.println("******");
System.out.println(s1.equals(s2));//value comparison
System.out.println(s2.equals(s3));
System.out.println(s3.equals(s4));
System.out.println(s5.equals(s6));
}
}