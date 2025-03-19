class Hello{

	int a=10;
	static int b=20;
	
	{
	System.out.println("Instance-Block");
	System.out.println(a);
	System.out.println(b);
	}
	
	static{
	System.out.println("static-Block");
	//System.out.println(a);
	System.out.println(b);
	}
	
	void show(){
	System.out.println("show() -method");
	System.out.println(a);
	System.out.println(b);
	}
			
}


class lab4{
	public static void main(String args[]){

	System.out.println(Hello.b);//Static block executed

	}
			
}