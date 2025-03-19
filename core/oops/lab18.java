class Hai{

			int a=10;
			static int b=20;
			
			{
			System.out.println("Hai-IB");
			System.out.println(a);
			System.out.println(b);
			}
			
			static{
			System.out.println("Hai-SB");
			//System.out.println(a);
			System.out.println(b);
			}
			
			void m1(){
			System.out.println("Hai-m1");
			}
			
			static void m2(){
			System.out.println("Hai-m2");
			}
			
}


class Hello extends Hai{

					int c=30;
					static int d=40;
					
					{
					System.out.println("Hello-IB");
					System.out.println(a);
					System.out.println(b);
					System.out.println(c);
					System.out.println(d);
					}
					
					static {
					System.out.println("Hello-SB");
					//System.out.println(a);
					System.out.println(b);
					//System.out.println(c);
					System.out.println(d);
					}
					
					void m3(){
					System.out.println("Hello-m3");
					}
					
					static void m4(){
					System.out.println("Hello-m4");
					}
					
}


class lab18{

			public static void main(String args[]){
					
					//A		
					//Hai.m2();
					//Hello.m4();
					/*o/p
					Hai-SB
					20
					Hai-m2
					Hello-SB
					20
					40
					Hello-m4
					*/
					
					
					//B

					//Hello.m4();
					
					
					/*o/p

					Hai-SB
					20
					Hello-SB
					20
					40
					Hello-m4
					*/
					

					
					//c

					//Hai hai=new Hai();
					//hai.m1();
					//Hello h =new Hello();
					//h.m3();

					/*o/p
					Hai-SB
					20
					Hai-IB
					10
					20
					Hai-m1
					Hello-SB
					20
					40
					Hai-IB
					10
					20
					Hello-IB
					10
					20
					30
					40
					Hello-m3*/
					
					//D
					Hello h =new Hello();
					h.m3();

					/*o/p---
					Hai-SB
					20
					Hello-SB
					20
					40
					Hai-IB
					10
					20
					Hello-IB
					10
					20
					30
					40
					Hello-m3*/
			}
}