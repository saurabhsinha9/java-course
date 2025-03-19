class A{
}
class B extends A{
}
class C extends B{
}
class Hello{
void show(Object obj){
System.out.println("show(Object obj)");
}
void show(A obj){
System.out.println("show(A obj)");
}
void show(B obj){
System.out.println("show(B obj)");
}
void show(C obj){
System.out.println("show(C obj)");
}
}
class lab122{
public static void main(String args[]){
Hello h= new Hello();
A a1=new A();
B b1=new B();
C c1=new C();
h.show(a1);
h.show(b1);
h.show(c1);
}
}