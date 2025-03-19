public class lab12{
public static void main(String args[]){
StringBuffer sb1=new StringBuffer();
System.out.println(sb1.length());
System.out.println(sb1.capacity());//16
StringBuffer sb2=new StringBuffer("jlc");
System.out.println(sb2.length());
System.out.println(sb2.capacity());//16+3
System.out.println("****");
sb2.append("india123451234567");
System.out.println(sb2.length());
System.out.println(sb2.capacity());//new capacity=(old capacity*2)+2---(19*2)+2=40
System.out.println(sb2);
System.out.println("****");
String str1=new String("jlc");
String str2=new String("jlc");
StringBuffer sb=new StringBuffer("jlc");
System.out.println(sb);
System.out.println(str1==str2);
//System.out.println(str1==sb));
System.out.println(str1.equals(str2));
System.out.println(str1.equals(sb));
System.out.println(sb.equals(str1));
System.out.println(str1.contentEquals(sb));
}
}