class Hai{
}
class Hello{
byte b;
short s;
int i;
long l;
float f;
double d;
char ch;
boolean b1;
Hai hai;
void show(){
System.out.println(b);
System.out.println(s);
System.out.println(i);
System.out.println(l);
System.out.println(f);
System.out.println(d);
System.out.println(ch);
System.out.println(b1);
System.out.println(hai);
}
void m1(){
float f=1.2f;
System.out.println(f);
byte b1=127;
System.out.println(b1);
byte b2=(byte)128;
System.out.println(b2);

Hello h= new Hello();
boolean flg=(h.b==this.b);
System.out.println(flg);
flg=(h==this);
System.out.println(flg);
}

}
class lab2{
public static void main(String args[]){
Hello h=new Hello();
//h.show();
h.m1();
}
}