class Hello{
int a=10;	//instance var
static int b=20;	//static var
	{
		System.out.println("Instance-Block");
		System.out.println(a);
		System.out.println(b);
	}
				
static{
		System.out.println("static-Block");
		//System.out.println(a);	//instance var not get memory at class loading time it will get at object creation time
		System.out.println(b);
		}
		
		
void show(){
System.out.println("show() -method");
System.out.println(a);
System.out.println(b);
}
}
class lab2{
public static void main(String args[]){
		Hello h;//nothing will happen here
new Hello();	//Static block and instance block executed	
Hello h1=new Hello();//instance block executed
Hello h2=new Hello();

h1.show();
h2.show();
}	

}													