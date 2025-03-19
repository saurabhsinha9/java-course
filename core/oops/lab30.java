interface i1{

		int a=100;
		public static int b=200;

			void m1();
			public abstract void m2();
			void show();

}


class Hello implements i1{

			public void m2(){
			System.out.println("m2");
			}
			
			public void m1(){
			System.out.println("m1");
			}
			
			public void m3(){
			System.out.println("m3");
			}
			
			public void show(){
			System.out.println(a);
			System.out.println(b);
			}

}


class lab30{

		public static void main(String args[]){
		
					Hello h=new Hello();
					
					h.m1();
					h.m2();
					h.m3();
					h.show();
					
					i1 obj =new Hello();
					obj.m1();
					obj.m2();
					//obj.m3();
					obj.show();
					
					System.out.println(i1.a);
					System.out.println(i1.b);
					System.out.println(Hello.a);
					System.out.println(Hello.b);
					
		}
		
}