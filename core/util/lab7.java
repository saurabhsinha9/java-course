import java.util.*;
class Student implements Comparable{
int sid;
String sname;
String email;
Student(int sid,String sname,String email){
this.sid=sid;
this.sname=sname;
this.email=email;
}
public String toString(){
return ""+sid+"\t"+sname+"\t"+email;
}
public boolean equals(Object o){
Student s=(Student)o;
if(this.sid==s.sid)
return true;
return false;
}
public int compareTo(Object o){
Student s=(Student)o;
return this.sid-s.sid;
}
}
class SnameComparator implements Comparator{
public int  compare(Object o1,Object o2){
Student s1=(Student)o1;
Student s2=(Student)o2;
return s1.sname.compareTo(s2.sname);
}
}
class EmailComparator implements Comparator{
public int  compare(Object o1,Object o2){
Student s1=(Student)o1;
Student s2=(Student)o2;
return s1.email.compareTo(s2.email);
}
}
class lab7{
public static void main(String args[]){
ArrayList al=new ArrayList();
Student s1=new Student(22,"dd","dd@jlc");
Student s2=new Student(44,"aa","aa@jlc");
Student s3=new Student(11,"cc","cc@jlc");
Student s4=new Student(33,"bb","bb@jlc");
al.add(s1);
al.add(s2);
al.add(s3);
al.add(s4);
System.out.println("No Sorting");
System.out.println("\n");

Iterator it=al.iterator();
while(it.hasNext()){
Student s=(Student)it.next();
System.out.println(s);
}
System.out.println("\n");

System.out.println("sorting by sname Sorting");
Collections.sort(al, new SnameComparator());
Iterator it1=al.iterator();
while(it1.hasNext()){
Student s=(Student)it1.next();
System.out.println(s);
}
System.out.println("\n");
System.out.println("sorting by Email Sorting");
Collections.sort(al, new EmailComparator());
 it=al.iterator();
while(it.hasNext()){
Student s=(Student)it.next();
System.out.println(s);
}

}
}