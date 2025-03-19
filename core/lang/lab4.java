class A{
int x;
A(int x){
this.x=x;
}
}
class B{
int p;
A aobj;
B(int p,A aobj){
this.p=p;
this.aobj=aobj;
}
}
class C{
int q;
B bobj;
C(int q,B bobj){
this.q=q;
this.bobj=bobj;
}
}
class Hello implements Cloneable{  //implementing cloneable means JVM allow clone of Hello class object
//shallow cloning--in this case only top level object is cloned all deep object will be reused without cloning
int  a;
C cobj;
Hello(){}
Hello(int a,C cobj){
this.a=a;
this.cobj=cobj;
}
void show(){
System.out.println(a);
System.out.println(cobj.q);
System.out.println(cobj.bobj.p);
System.out.println(cobj.bobj.aobj.x);
}
public Hello myclone(){
Hello h=null;
Object o=null;
try{
o=this.clone();//calling clone() of Object class results shallow cloning
}
catch(CloneNotSupportedException e){
e.printStackTrace();
}
h=(Hello)o;//creating clone
return h;
}
}
class lab4{
public static void main(String args[]){
A aobj=new A(10);
B bobj=new B(20,aobj);
C cobj=new C(30,bobj);
Hello h= new Hello(40,cobj);
h.show();
Hello h1=h.myclone();//creating clone
h1.show();
System.out.println(h==h1);
System.out.println(h.cobj==h1.cobj);
System.out.println(h.cobj.bobj==h1.cobj.bobj);
System.out.println(h.cobj.bobj.aobj==h1.cobj.bobj.aobj);
}
}