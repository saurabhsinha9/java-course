public class lab13{

public static void main(String args[]){

StringBuffer sb2=new StringBuffer("jlcindiajlc");
System.out.println(sb2.length());
System.out.println(sb2.capacity());
System.out.println(sb2);
sb2.setCharAt(8,'9');
System.out.println(sb2);
int x=99;
sb2.append(x);
System.out.println(sb2);
sb2.insert(3,99.99);
System.out.println(sb2);
sb2.insert(18,"abc");
System.out.println(sb2);
sb2.delete(3,8);//delete from index 3 to and print remaining from 8 th character means delete from 3 to 7
System.out.println(sb2);
sb2.deleteCharAt(8);
System.out.println(sb2);
sb2.reverse();
System.out.println(sb2);
System.out.println(sb2.length());
System.out.println(sb2.capacity());
//sb2.insert(26,"abcd1234");
}
}