/* getClass(), hashCode(), toString()  */


class A{
A(int a){
//super(a);//Object class has no any argumented constructor
super();
}
}
class B extends A{
B(int a,int b){
super(a+b);
}
}
class Hello{
int a=10;
int b=20;
int c=30;
public int hashCode(){
//user algo to generate hashcode number
return 111;
}
public String toString(){
return "[a="+a+",b="+b+",c="+c+"]";
}
}
class lab1{
public static void main(String args[]){
Hello h=new Hello();
Class cls=h.getClass();//return current object
System.out.println(cls.getName());//getting the class name
System.out.println(h.hashCode());//return hash code no of the object generated by jvm
System.out.println(h.toString());//return the string with format class name+@+hexadecimal equivalent of hash code
System.out.println(h);//if ref var contain null,null will be displayed else toString will be invoked
A obj=new B(10,20);
System.out.println(obj.getClass().getName());//getting the class name
System.out.println(obj.hashCode());//return hash code no of the object generated by jvm
System.out.println(obj.toString());//Converting to String
System.out.println(obj);
}
}