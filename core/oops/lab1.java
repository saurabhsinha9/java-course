class Hello{
int a=10;	//instance variable
static int b=20;	//static variable
				
void show(){
System.out.println(a);
System.out.println(b);
}
				
}
	
class lab1{

public static void main(String args[]){

Hello h1=new Hello();	//object creation statement
//h1.show();				//calling method with reference variable

Hello h2=new Hello();	//object creation statement
//h2.show();	//calling method with reference variable

h1.a=1000;	//updating instance var value with h1
h1.b=2000; //updating static var value with h1

h1.show();	//calling method with reference variable
h2.show();	//calling method with reference variable

System.out.println(h1.a);
System.out.println(h1.b);

//System.out.println(Hello.a);	//instance not called with class name

System.out.println(Hello.b);	//calling with class name

Hello h= null;		//static are called with ref var which contain null

//System.out.println(h.a);

System.out.println(h.b);

}

}