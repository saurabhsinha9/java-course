class Hai{

		int a=10;
		int b=20;
		
			void m1(){
			System.out.println("m1");
			System.out.println(a);
			System.out.println(b);
			//System.out.println(x);
			//System.out.println(y);
			
}

}


class Hello extends Hai{

					int x=10;
					int y=40;
					
						void m2(){
						System.out.println("m2");
						System.out.println(a);
						System.out.println(b);
						System.out.println(x);
						System.out.println(y);
						}
						
}


class lab17{

			public static void main(String args[]){
			
					Hai hai=new Hai();
					
					hai.m1();
					//hai.m2();
					
					Hello h =new Hello();
					
					h.m1();
					h.m2();
					
			}
			
}