class A{

			public void m1(){
			System.out.println("A-m1");
			}
			
			private void m2(){
			System.out.println("A-m2");
			}
			
			static void m4(){
			System.out.println("A-m4");
			}
			
}


class B extends A{

			
			/*int m1(){
			System.out.println("B-m1");
			}
			*/
			
			/*void m1(){	
			System.out.println("A-m1");
			}
			*/
			
			public void m1(){
			System.out.println("B-m1");
			}
	/*	new method m2 not overridden bcoz m2 in a ha private access*/
			void m2(){
			System.out.println("B-m2");
			}

			void m3(){
			System.out.println("B-m3");
			}

			//m4() in B not overriding m4() in A bcoz overridden method is static
			/*void m4()
			{
			System.out.println("B-m4");
			}
			*/
			
}


class lab26{

		public static void main(String args[]){

			B obj=new B();

			obj.m1();
			obj.m2();
			obj.m3();
			obj.m4();

		}

}