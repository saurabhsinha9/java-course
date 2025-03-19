import java.util.*;

public class lab8{
public static void main(String args[]){
ArrayList al=new ArrayList();
al.add("bb");
al.add("cc");
al.add("dd");
al.add("aa");
//al.add(new Integer(99));	All elements must be of same type for sorting with comparator,compare() method
System.out.println("after adding element to arraylist al	"+al);
System.out.println("\n");
Collections.sort(al);
System.out.println("Collections.sort(al)	"+al);
System.out.println("\n");
Collections.reverse(al);
System.out.println("Collections.reverse(al)	"+al);
System.out.println("\n");
System.out.println(al);
Collections.shuffle(al);
System.out.println("Collections.shuffle(al)	"+al);
System.out.println("\n");
System.out.println(al);
Collections.rotate(al,1);
System.out.println("Collections.rotate(al,1)	"+al);
System.out.println("\n");
System.out.println(al);
Collections.swap(al,1,3);
System.out.println("Collections.swap(al,1,3)	"+al);
System.out.println("\n");
System.out.println("Collections.max(al)	"+Collections.max(al));
System.out.println("\n");
System.out.println("Collections.min(al)	"+Collections.min(al));
System.out.println("\n");
Collections.sort(al);
System.out.println("Collections.sort(al)	"+al);
System.out.println("\n");
System.out.println("binary search   element at \t"+Collections.binarySearch(al,"cc"));
System.out.println("\n");
System.out.println("binary search   element  not found  if -ve means not found \t"+Collections.binarySearch(al,"99"));
System.out.println("\n");
Collections.fill(al,"jlc");
System.out.println("Collections.fill(al,jlc)	"+al);
System.out.println("\n");
Vector v=new Vector();
v.add("99");
v.add("sri");
v.addElement("abc");
System.out.println("printing vector element \t"+v);
Enumeration e=v.elements();
System.out.println(e);
System.out.println("\n");
List al1=Collections.list(e);
System.out.println(al1);
System.out.println("\n");
System.out.println(v);
System.out.println("\n");
System.out.println(al1);
al1=Collections.unmodifiableList(al1);//the list become read only
System.out.println("\n");
System.out.println(al1);
//al1.add(11);			//not run bcoz all is read only
System.out.println(al1);
}
}