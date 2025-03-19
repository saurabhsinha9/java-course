import java.io.*;
import java.util.*;
class lab18{
public static void main(String args[]){
try{
//System s=new System();
System.out.println("begin");
System.out.println(System.currentTimeMillis());
System.out.println(System.getProperty("os.name"));
System.setProperty("os.name","Linux");
System.out.println(System.getProperty("os.name"));
System.out.println("--------------------------------------");
System.setProperty("myname","Srinivas");
Properties p=System.getProperties();
Enumeration e=p.propertyNames();
while(e.hasMoreElements()){
String nm=e.nextElement().toString();
String va=System.getProperty(nm);
System.out.println(nm+"\t:"+va);
}
System.out.println("--------------------------------------");
System.out.println(System.getProperty("java.library.path"));
System.out.println("--------------------------------------");
System.out.println("--------------------------------------");

System.out.println(System.getProperty("java.class.path"));
System.out.println("--------------------------------------");
System.out.println("--------------------------------------");

System.err.println("this is with err");
System.out.println("this is with out");
System.out.println("--------------------------------------");
System.out.println("--------------------------------------");

File file=new File("jlc123.txt");
file.createNewFile();
OutputStream os=new FileOutputStream(file);
PrintStream ps=new PrintStream(os);
System.setOut(ps);
System.out.println("i am going to file");
System.out.println("i am going to file");
System.out.println("i am going to file");
System.out.println("i am going to file");

System.exit(0);
System.out.println("end");
}catch(Exception e){
}
}
}