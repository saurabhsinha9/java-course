class lab15{
public static void main(String args[]){
//String to Wrapper
Integer it1=new Integer("123");
//Integer it1=new Integer("45d5");//number format exception
System.out.println("String to Wrappeer using constructor \t:"+it1);
Integer it=Integer.valueOf("78");
System.out.println("String to Wrappeer using valueOf \t:"+it);
//Wrapper to String
String str=it1.toString();
System.out.println("Wrapper to String\t:"+str);
//Primitive to Wrapper
Integer it2=new Integer(784);
System.out.println("Primitive to Wrapper\t:"+it2);
//Wrapper to primitive
System.out.println("wrapper to primitive");
int i=it2.intValue();
byte b=it2.byteValue();
short s=it2.shortValue();
long l=it2.longValue();
float f=it2.floatValue();
double d=it2.doubleValue();
System.out.println("int is\t:"+i);
System.out.println("byte value is\t:"+b);
System.out.println("short value is\t:"+s);
System.out.println("long value is\t:"+l);
System.out.println("float value is\t:"+f);
System.out.println("double value is\t:"+d);
//String to primitive
int x=Integer.parseInt("45");
System.out.println("String to primitive\t:"+x);
//Primitive to String
String st=Integer.toString(98);
System.out.println("Primitive to String using toString of Integer\t:"+st);
String st2=String.valueOf(12);
System.out.println("Primitive to String using valueOf of String\t:"+st2);
Integer it3=new Integer(12);
Integer it4=new Integer(12);
System.out.println("it2\t:"+it2);
System.out.println("it3\t:"+it3);
System.out.println("it4\t:"+it4);
System.out.println("it3==it4\t:"+(it3==it4));
System.out.println("it3.equals(it4)\t:"+(it3.equals(it4)));
System.out.println("it3.compareTo(it4)\t:"+(it3.compareTo(it4)));
System.out.println("it3.compareTo(it2)\t:"+(it3.compareTo(it2)));
System.out.println("it2.compareTo(it3)\t:"+(it2.compareTo(it3)));
System.out.println("**  METHOD Only in Integer and Long class  ***");
String bStr=Integer.toBinaryString(45);
String hStr=Integer.toHexString(45);
String oStr=Integer.toOctalString(45);
System.out.println("toBinaryString(45)\t:"+bStr);
System.out.println("toHexString(45)\t:"+hStr);
System.out.println("toOcatalString(45)\t:"+oStr);
System.out.println("toBinaryString(-45)\t:"+Integer.toBinaryString(-45));
}
}