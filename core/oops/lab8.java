class Hello{


int s;//instance variable

{
System.out.println("I.B of Hello begin");
int a=10;//local variable of instance block

{
System.out.println("Local Block of Instance Block");
//int a=20;	//a is already defined
int x=20;	//local variable of Local Block of Instance Block
System.out.println(x);
System.out.println(a);
System.out.println("Local Block of Instance Block end");
}

//System.out.println(x);	//local variable of Local Block of Instance Block cant be accessed outside the block
System.out.println(a);	//local variable of instance block will be printed
System.out.println("I.B of Hello end");
}

static{
System.out.println("S.B of Hello start");
int a=10;	//local to static block

{
System.out.println("Local Block of static Block");
//int a=20;
int x=20;	// local to Local Block of static Block
System.out.println(x);
System.out.println(a);	//local to static block will be printed
System.out.println("Local Block of static Block end");
}

//System.out.println(x);	//local variable of Local Block of static Block cant be accessed outside the block
System.out.println(a);
System.out.println("S.B of Hello end");
}


Hello(){

System.out.println("0 args cons of hello");
int a=10;	//hello cons local variable

{
System.out.println("Local Block of 0 args con");
//int a=20;
int x=20;	//local variable of Local Block of 0 args con
System.out.println(x);
System.out.println(a);	//hello cons local variable
System.out.println("Local Block of 0 args con end");
}

//System.out.println(x);	//outside block local variable not be accessed
System.out.println(a);
System.out.println("0 args cons of hello end");
}

void show(){

System.out.println("show of Hello begin");
int a=10;	//local

{
System.out.println("Local Block of show start");
//int a=20;	//already defined

int x=20;

System.out.println(x);
System.out.println(a);

System.out.println("Local Block of show end");
}

//System.out.println(x);
System.out.println(a);

System.out.println("show of Hello end");
}

}


class lab8
{
static Hello h5 =new Hello();
public static void main(String args[]){
System.out.println("h5 "+h5);
System.out.println("main begin");
int p=10;	//local to main
int q;
//System.out.println("You cant use local variable without initializing"+q);
Hello h =new Hello();
h.show();
System.out.println("main end");
System.out.println("Some other concept");
//static Hello h =new Hello();//local variable cant be static
final Hello h1 =new Hello();
//h1=new Hello();

}

}