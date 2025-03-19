class lab16{
public static void main(String args[]){
//String to Boolean Object
Boolean b1=new Boolean("tRuE");
Boolean b2=new Boolean("JLC");
System.out.println(b1);
System.out.println(b2);
Boolean b3=Boolean.valueOf("tRue");
System.out.println(b3);
//Boolean Object to String
String str=b1.toString();
System.out.println("Boolean Object to String\t:"+str);
//boolean primitive to Boolean Object
Boolean b4=new Boolean("true");
System.out.println(b4);
//Boolean Object to boolean primitive
boolean b=b4.booleanValue();
System.out.println(b);
//String to boolean primitive
boolean b5=Boolean.getBoolean("true");
System.out.println("String to Boolean primitive\t:"+b5);
System.setProperty("jlc.property","true");
boolean b6=Boolean.getBoolean("jlc.property");
System.out.println("String to Boolean primitive\t:"+b6);
//boolean primitive to String
String st=Boolean.toString(false);
System.out.println(st);
String st2=String.valueOf(true);
System.out.println(st2);
Boolean b7=new Boolean(true);
Boolean b8=new Boolean(true);
System.out.println("b7\t:"+b7);
System.out.println("b8\t:"+b8);
System.out.println("b7==b8\t:"+(b7==b8));
System.out.println("b7.equals(b8)\t:"+b7.equals(b8));
}
}