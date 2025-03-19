class A{

		A(){
		System.out.println("A-default cons");
		}
}


class B extends A{

// inserted automatically by jvm---

B(){
super();//constructor invocation from sub class to super class
System.out.println("B- default cons");
}


}


class lab21{

		public static void main(String args[]){
		B obj=new B();
		}
}

/* constructor invocation from sub class to super class and
constructor execution from super class to sub class*/