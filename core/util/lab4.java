import java.util.*;

public class lab4{
public static void main(String args[]){
System.out.println("HashSet");
//order of storing-unordered
HashSet hs=new HashSet();
hs.add(new Integer(99));
System.out.println(hs.add("sri"));//true
hs.add("sri@jlc");
hs.add(null);
System.out.println(hs.add("sri"));//false
System.out.println(hs);
System.out.println("\n");

System.out.println("TreeSet");
//order of storing-sorted ordered
//no diff type of values
//no null values
TreeSet ts=new TreeSet();
//ts.add(new Integer(99));classCastException
System.out.println(ts.add("sri"));
//ts.add(null);NullPointerException
ts.add("sri@jlc");
System.out.println(ts.add("sri"));
ts.add("aaaa");
ts.add("cccc");
ts.add("bbbb");
System.out.println(ts);
System.out.println("\n");

System.out.println("LinkedHashSet");
//order of storing-ordered
LinkedHashSet lhs=new LinkedHashSet();
lhs.add(new Integer(99));
System.out.println(lhs.add("sri"));
lhs.add("sri@jlc");
lhs.add(null);
System.out.println(lhs.add("sri"));
System.out.println(lhs);
System.out.println("\n");

}
}