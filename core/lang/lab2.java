/* equal() example*/

class Hello{
int a;
int b;
Hello(int a,int b){
this.a=a;
this.b=b;
}
public String toString(){
return "[a="+a+",b="+b+"]";
}
public boolean equals(Object obj){
Hello h=(Hello)obj;
if(this.a == h.a && this.b == h.b)
return true;
return false;
}
}
class lab2{
public static void main(String args[]){
Hello h1=new Hello(10,20);
Hello h2=new Hello(10,30);
Hello h3=new Hello(10,20);
Hello h4=h1;
System.out.println(h1==h2);//address comparison
System.out.println(h1==h3);//address comparison
System.out.println(h1==h4);//address comparison
System.out.println(h1.equals(h2));//value comparison
System.out.println(h1.equals(h3));//value comparison
System.out.println(h1.equals(h4));//value comparison
}
}