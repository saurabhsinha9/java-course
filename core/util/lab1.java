import java.util.*;
public class lab1{
public static void main(String args[]){
ArrayList al=new ArrayList();
System.out.println("al,size,isEmpty");
System.out.println(al);//toString will be called
System.out.println(al.size());
System.out.println(al.isEmpty());
System.out.println("al,size,isEmpty-----end");
System.out.println("Adding element to al");
al.add(new Integer(99));
al.add("sri");
al.add("123");
al.add("sri@jlc");
al.add(new Double(999.99));
al.add(new Long(11111));
System.out.println("al,size,isEmpty");
System.out.println(al);
System.out.println(al.size());
System.out.println(al.isEmpty());
System.out.println("al,size,isEmpty-----end");
System.out.println("converting to object array");
Object [] obj=al.toArray();
System.out.println(obj.length);//return length of object array
System.out.println("printing directly");
for(int i=0;i<obj.length;i++){
System.out.println(obj[i]);
}
System.out.println("checking and casting");

for(int i=0;i<obj.length;i++){
Object o=obj[i];
System.out.println("printing o	"+o);
if(o instanceof String){
String str=(String)o;	//typecasting means object type is converted intoString
System.out.println("printing instanceof String	"+str);
}else if(o instanceof Integer){
Integer in=(Integer)o;
System.out.println("printing instanceof Integer	"+in);
}else if(o instanceof Double){
Double d=(Double)o;
System.out.println("printing instanceof Double	"+d);
}
else if(o instanceof Long){
Long l=(Long)o;
System.out.println("printing instanceof Long	"+l);
}
}
Iterator it=al.iterator();
System.out.println(it);//to string will be called----java.util.AbstractList$Itr@defa1a
while(it.hasNext()){
Object o=it.next();
System.out.println("ithasnext with while loop used to access the element of list		"+o);
}
System.out.println("contains method return boolean value by checking the list al	 "+al.contains("sri"));
System.out.println(al);
al.add("123");
System.out.println(al);
al.remove("123");//remove the first occurance
System.out.println(al);
ArrayList al1=new ArrayList();
al1.add("aa");
al1.add("bb");
al1.add("cc");
al1.add("dd");
System.out.println("printing al1 element		"+al1);
System.out.println("printing al element		"+al);
System.out.println("al1 size"+al1.size());
System.out.println("al size*****"+al.size());
al.add(al1);
System.out.println("printing al element by doing al.add(al1)		"+al);

al.addAll(al1);
System.out.println("printing al element by doing al.addAll(al1)		"+al);
System.out.println("printing al element		"+al);
System.out.println("al size		"+al.size());
System.out.println("al.containsAll(al1)		"+al.containsAll(al1));
System.out.println(al);
al.removeAll(al1);
System.out.println("al.removeAll(al1)		"+al);

al.retainAll(al1);//return the elemeents of al1 contained in al
System.out.println("al.retainAll(al1)"+al);
al.clear();//array list will be clear
System.out.println("al.clear() -array list will be clear"+al);

}
}