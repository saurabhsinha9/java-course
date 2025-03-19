import java.util.*;

public class lab3{
public static void main(String args[]){
Vector v=new Vector();
v.add("99");
v.add("sri");
v.add("sri@jlc");
v.add("sri");
System.out.println(v);
Enumeration e=v.elements();
System.out.println("\n forward order");
while(e.hasMoreElements()){
System.out.println(e.nextElement());
}
LinkedList ll=new LinkedList(v);
System.out.println("\n"+ll);
ll.addFirst("11");
ll.addLast("22");
System.out.println("\n"+ll);
System.out.println("\n"+ll.getFirst());
System.out.println("\n"+ll.getLast());

}
}