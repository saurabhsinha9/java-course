class Hello{

int a;
static int b;	

{										//instance block we accesss instance as well as static variable
System.out.println("Hello I.B");
System.out.println(a);
System.out.println(b);
}

static{										//static block we access only static variable
System.out.println("Hello S.B");
//System.out.println(a);
System.out.println(b);
}
/*Hello(){
System.out.println("DC cons");
}
*/
Hello(int x){
System.out.println("1 args cons");
a=x;	//initialize the value
}

Hello(int x,int y){
System.out.println("2 args cons");
a=x;	//initializing
b=y;	//initializing	
}

void show(){
System.out.println(a);
System.out.println(b);
}

}
		
		
class lab6{

int x;
static int y;

{
System.out.println("lab6 I.B");
System.out.println(x);
System.out.println(y);
}

static {
System.out.println("lab6 S.B begin");
//System.out.println(x);
System.out.println(y);
lab6 l=new lab6();
l.m1();
System.out.println("lab6 S.B end");
}
void m1(){
System.out.println("m1() begin");
System.out.println(x);
System.out.println("m1() end");
}
public static void main(String arg[]){
System.out.println("main()");
//m1();not ok bcoz non-static method m1() cannot be referenced from a static context
lab6 l=new lab6();
l.m1();
Hello h1=new Hello();
/*
if you are writing any argumented constructr then you have to explicitly specify the default constructor
i.e when you are not writing any constructr then default constructr will be invked by JVM automatically.
when you are  writing any argumented constructr then default constructr will not  be invoked by JVM.
*/
Hello h =new Hello(100,200);
h.show();
System.out.println("Hello.b="+Hello.b);	//callind the variable with classname
}
				
}