class Hello{

int a=10;
static int b=20;

void m1()
{
System.out.println("Hello-m1");
System.out.println(a);
System.out.println(b);
}

static void m2(){
System.out.println("Hello-m2");
//System.out.println(a);
System.out.println(b);
}
							
}


class lab7{

public static void main(String args[]){

//case1 static method called with reference variable which contain object
Hello h=new Hello();
h.m1();
h.m2();

//case2 static method called with class name
//Hello.m1();
Hello.m2();

//case3 static method called with reference variable contain null
Hello h1=null;

//h1.m1();
h1.m2();

}

}
  
	
	
