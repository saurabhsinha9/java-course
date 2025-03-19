class lab66{
public static void main(String args[]){
String s1="jlc";
String s2="jlc";
String s3=new String("jlc");
String s4=new String("jlc");
System.out.println(s1==s2);
System.out.println(s2==s3);
System.out.println(s3==s4);
System.out.println(s1.equals(s2));
System.out.println(s2.equals(s3));
System.out.println(s3.equals(s4));
}
}