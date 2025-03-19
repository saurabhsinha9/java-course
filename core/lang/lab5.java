class Hello implements Cloneable{
//Deep cloning top level+deep  objects should be cloned
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
public Object clone(){//overriding clone method
//code for creating the copy of top +deep level object
Hello h=null;
boolean flag=false;
try{
Class cls=Class.forName("Hello");
Class c[]=cls.getInterfaces();
for(int i=0;i<c.length;i++){
String inm=c[i].getName();
System.out.println(inm);
if(inm.equals("java.lang.Cloneable")){
flag=true;
}
}
if(flag){
A a1=new A(this.cobj.bobj.aobj.x);
B b1=new B(this.cobj.bobj.p,a1);
C c1=new C(this.cobj.q,b1);
h=new Hello(this.a,c1);
}
else{
throw new CloneNotSupportedException("Hello");}
}
catch(Exception e){
System.out.println(e);
}
return h;
}
}
class lab5{
public static void main(String args[]){
A aobj=new A(10);
B bobj=new B(20,aobj);
C cobj=new C(30,bobj);
Hello h= new Hello(40,cobj);
h.show();
h.a=1000;
h.cobj.q=2000;
h.cobj.bobj.p=3000;
h.cobj.bobj.aobj.x=4000;
h.show();
Hello h1=(Hello)h.clone();
if(h1!=null){
h1.show();
System.out.println(h==h1);
System.out.println(h.cobj==h1.cobj);
System.out.println(h.cobj.bobj==h1.cobj.bobj);
System.out.println(h.cobj.bobj.aobj==h1.cobj.bobj.aobj);
}
}
}