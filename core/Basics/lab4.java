class Hello{
void show1(){
System.out.println("integer literal demo");
int a=12;
int b=012;
int c=0x12a;
byte d=012;
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
}
void show2(){
System.out.println("floating point literal demo");
float f1=99.9F;
float f2=99.9f;
//float f3=99.9;
double d1=9.9e-9;
double d2=9.9E+9;
System.out.println(f1);
System.out.println(f2);
//System.out.println(f3);
System.out.println(d1);
System.out.println(d2);
}
void show3(){
System.out.println("character literal demo");
char ch1='A';
int x1='A';
char ch2=' ';
int x2=' ';
char ch3='1';
int x3='1';
//char ch='';
System.out.println(ch1);
System.out.println(x1);
System.out.println(ch2);
System.out.println(x2);
System.out.println(ch3);
System.out.println(x3);
}
void show4(){
System.out.println("boolean literal demo");
boolean bb1=true;
boolean bb2=false;
//boolean bb3=True;
System.out.println(bb1);
System.out.println(bb2);
}
void show5(){
System.out.println("string literal demo");
String str1="";
String str2="123 abc =+ .>";
String str3="                      1";
System.out.println("str1="+str1);
System.out.println(str1.length());
System.out.println("str2="+str2);
System.out.println(str2.length());
System.out.println("str3="+str3);
System.out.println(str3.length());
}
}
class lab4{
public static void main(String args[]){
Hello h=new Hello();
h.show1();
h.show2();
h.show3();
h.show4();
h.show5();
}
}