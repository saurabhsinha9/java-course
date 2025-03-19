class A{

		private int a=10;
		int b=20;
		protected int c=30;
		public int d=40;

				void showA(){
				System.out.println("showA");
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				}
}


class B extends A{

				void showB(){
				System.out.println("showB");
				//System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				}
				
}


class C{

				void showC(){
				System.out.println("showC");
				A obj=new A();
				//System.out.println(obj.a);
				System.out.println(obj.b);
				System.out.println(obj.c);
				System.out.println(obj.d);
				}
				
}


class lab24{

			public static void main(String args[]){
			
				//A obj1=new A();
				//obj1.showA();
				
				//B obj2=new B();
				//obj2.showB();
				
				C obj3=new C();
				obj3.showC();
				
			}
}