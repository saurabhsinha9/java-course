import java.util.*;

public class lab6{
public static void main(String args[]){

LinkedHashMap lhm=new LinkedHashMap();
System.out.println("\n");
System.out.println(lhm);//to string repersentation will be called
System.out.println(lhm.size());
System.out.println(lhm.isEmpty());
System.out.println("\n");
lhm.put("sid",new Integer(99));
lhm.put("sname","sri");
lhm.put("fee",new Double(9000.99));
System.out.println(lhm);
System.out.println(lhm.size());
System.out.println(lhm.isEmpty());
System.out.println("\n");
lhm.put("x","10");
lhm.put(new Integer(99),"10");
System.out.println(lhm);
lhm.put("x","20");//update old value of x
System.out.println(lhm);
lhm.put(null,null);//null key & values are allowed
System.out.println(lhm);
System.out.println("\n");
System.out.println("************************");

Hashtable ht=new Hashtable();

System.out.println("\n");
System.out.println(ht);//to string repersentation will be called
System.out.println(ht.size());
System.out.println(ht.isEmpty());
System.out.println("\n");
ht.put("sid",new Integer(99));
ht.put("sname","sri");
ht.put("fee",new Double(9000.99));
System.out.println(ht);
System.out.println(ht.size());
System.out.println(ht.isEmpty());
System.out.println("\n");
ht.put("x","10");
ht.put(new Integer(99),"10");
System.out.println(ht);
ht.put("x","20");
System.out.println(ht);
System.out.println("\n");

							//not allow null value
//ht.put("z",null);
System.out.println(ht);


//ht.put(null,"s");				//not allow null key
System.out.println(ht);

System.out.println("\n");

TreeMap tm=new TreeMap();
System.out.println("\n");
System.out.println(tm);//to string repersentation will be called
System.out.println(tm.size());
System.out.println(tm.isEmpty());
System.out.println("\n");
tm.put("sid",new Integer(99));
tm.put("sname","sri");
tm.put("fee",new Double(9000.99));
System.out.println(tm);
System.out.println(tm.size());
System.out.println(tm.isEmpty());
System.out.println("\n");
tm.put("x","10");
//tm.put(new Integer(99),"10");
System.out.println(tm);
tm.put("x","20");
System.out.println(tm);
tm.put("z",null);
System.out.println(tm);
System.out.println("\n");

//tm.put(null,"s");		//null key not allowed
System.out.println(tm);
System.out.println("\n");



}
}