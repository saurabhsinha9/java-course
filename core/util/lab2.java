import java.util.*;

public class lab2{
public static void main(String args[]){
ArrayList al=new ArrayList();
al.add(new Integer(99));
al.add("sri");
al.add("123");
al.add("sri@jlc");
al.add("sri");
System.out.println("printing al element		"+al);
al.add(0,"aaaaa");
al.add(2,"bbbbb");
System.out.println("printing al element after modification at 0 and 2	"+al);
al.remove(4);
System.out.println("printing al element after al.remove(4)	"+al);
System.out.println("printing al element after al.get(2)		"+al.get(2));
System.out.println("printing al element after al.indexOf(sri)	"+al.indexOf("sri"));
System.out.println("printing al element after al.lastIndexOf(sri)	"+al.lastIndexOf("sri"));
al.set(0,"jlc");
System.out.println("printing al element after al.set(0,jlc)		"+al);
List list=al.subList(1,4);
System.out.println("printing sublist		"+list);
System.out.println("forward order");
ListIterator li=al.listIterator();
System.out.println("\n forward order list element	"+li);//to string will be called
while(li.hasNext()){
System.out.println(li.next());
}
System.out.println("\n Reverse order");
while(li.hasPrevious()){
System.out.println(li.previous());
}

}
}