class Hello{
final int x=10;
}
class lab3{
public static void main(String args[]){
final int y=20;
System.out.println(y);
//y=200;
final int z;
//System.out.println(z);
Hello h =new Hello();
//h.x=20;
System.out.println(h.x);
z=30;
System.out.println(z);
//z=40;
final int p=0;
System.out.println(p);
//p=99;
}
}