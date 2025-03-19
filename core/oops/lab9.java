class Hello{

int a;	//instance variable

Hello(){
//this();//recursive constructor invocation
System.out.println("Hello -0 args cons");
m3();	//method calling
this.m3();	//this keyword used to access current class method
}

Hello(int a){
this(a,a);	/*this keyword used to invoke current class constructor..//call to the constructor must be the first statement in Constructor....*/
System.out.println("Hello -1 args cons");
this.a=a;	//reffering current class variable i.e initializing
System.out.println("this.a=a==="+a);
}

Hello(int x,int y){
this();	//calling default constructor...
System.out.println("Hello -2 args cons");
this.a=x+y;	//a value is initializing
System.out.println("this.a=x+y===="+a);
}

void m1(){
System.out.println("m1");
int a= 20;	//m1 local variable a,hides the appearance of instance variable a, of the class Hello
System.out.println(a);
System.out.println(this.a);/*m1 local variable a,hides the appearance of instance variable a, of the class Hello,so using this keyword used to refer instance variable*/
}

void m2(){
System.out.println("m2");
System.out.println(a);//instance variable
System.out.println(this.a);//instance variable
m3();
this.m3();
}

void m3(){
System.out.println("m3");
}

{
System.out.println("m1 calling with this");
this.m1();	
}

{
System.out.println("a value="+this.a);	//any method can be called using this keyword,in non static or instance  method, block,constructor
}

static{
System.out.println("s.b");
//System.out.println(this.a);			//static block checking whether "this" keyword is static or non static
//this.m3();
}

}


class lab9{
int x=10;
static int y=20;
public static void main(String arg[]){

Hello h=new Hello(100);

h.m1();
h.m2();


Hello h1=new Hello(100);
Hello h2=new Hello(150,200);

h.m1();
h1.m1();
System.out.println("1 begin");
h2.m1();
System.out.println("1 end");

h.m2();		
h1.m2();	
System.out.println("2 begin");			
h2.m2();	
System.out.println("2 end");

h.m3();			
h1.m3();	
System.out.println("3 begin");			
h2.m3();
System.out.println("3 end");

System.out.println("*****************");
lab9 l1=new lab9();
l1.man();
//this.man(); // non-static variable this cannot be referenced from a static context
}

void man(){
lab9 l=new lab9();
System.out.println(l.x+"\t"+l.y);
System.out.println(this.x+"\t"+this.y);
System.out.println("*****************");

}
}