class lab33{
public static void main(String args[]){
student s1=new student(12,"sri");
student s2=new student(13,"Dande");
student s3=new student(14,"Nivas");
student s4=new student(12,"sri");
System.runFinalization();
System.gc();
s2=s1;//ponting to same
System.runFinalization();
System.gc();
s3=null;//assigning null
s4=new student(78,"Dande");//reassigning value
m1();
System.runFinalization();
System.gc();
}
public static void m1(){
student s1=new student(45,"srinivas");
student s2=new student(45,"srinivas");
}
}
class student{
int sid;
String sname;
public student(int sid,String sname){
this.sid=sid;
this.sname=sname;
}
public void finalize(){
System.out.println("in finalize() student:Resource released");
}
}