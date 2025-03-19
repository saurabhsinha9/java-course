class A{

			//A(){}

			A(int a){
			System.out.println("A-1 arg cons");
			}
			
}


class B extends A{

			B(){
			System.out.println("B -default con");
			}
			
			
}


class lab20{

			public static void main(String args[]){
			B obj =new B();
			}
			
}

/* if there is a default constructor in sub class then super class must contain default constructor but reverse is not true*/