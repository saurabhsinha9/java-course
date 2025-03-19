import java.util.*;

public class lab5{
public static void main(String args[]){
HashMap hm=new HashMap();
System.out.println("\n");
System.out.println(hm);//to string repersentation will be called
System.out.println(hm.size());
System.out.println(hm.isEmpty());
System.out.println("\n");

hm.put("sid",new Integer(99));
hm.put("sname","sri");
hm.put("email","abc");
System.out.println(hm);
System.out.println(hm.size());
System.out.println(hm.isEmpty());
System.out.println("\n");
System.out.println(hm.containsKey("sid"));
System.out.println(hm.containsKey("sid1"));
System.out.println(hm.containsValue("sri"));
System.out.println(hm.containsValue("sri1"));
System.out.println(hm.get("sname"));
System.out.println(hm);
System.out.println("\n");
hm.put("sname","vas");//duplicate key allowed but it simplyreplace the first key and value
System.out.println(hm);
hm.put("sname1","vas");//duplicate  value allowed
System.out.println(hm);
hm.put(null,"vas");//null key allowed
System.out.println(hm);
hm.put(new Double(99.99),null);//null value allowed
System.out.println(hm);
System.out.println("\n");
hm.remove("sname1");//remove key and its value
System.out.println(hm);
System.out.println("\n");

Collection col=hm.values();
System.out.println(col);
System.out.println("\n");

System.out.println("using keySet()");
Set s=hm.keySet();//key are stored in set
System.out.println(s);
System.out.println("\n");

Iterator it=s.iterator();
System.out.println(it);
System.out.println("\n");

while(it.hasNext()){
Object o1=it.next();

String key="";
if(o1!=null){
key=o1.toString();
}
else{
key=null;
}

Object o2=hm.get(key);


String val="";
if(o2!=null){
val=o2.toString();
}
else{
val=null;
}
System.out.println(key+"...."+val);
}
System.out.println("\n");
System.out.println("*************************************************************");

System.out.println("using EntrySet()");
Set es=hm.entrySet();//key+value are stored in set
System.out.println(es);
System.out.println("\n");

Iterator it1=es.iterator();
System.out.println(it1);
System.out.println("\n");

while(it1.hasNext()){
Object o=it1.next();
Map.Entry me=(Map.Entry)o;
Object o1=me.getKey();

String key="";
if(o1!=null){
key=o1.toString();
}
else{
key=null;
}

Object o2=me.getValue();


String val="";
if(o2!=null){
val=o2.toString();
}
else{
val=null;
}
System.out.println(key+"...."+val);
}

}
}