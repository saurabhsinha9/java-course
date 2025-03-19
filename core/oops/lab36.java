class Hello{

		int a=10;
		static int b=20;

				void m1(){
				System.out.println("Hello -m1 begin");
				System.out.println(a);
				System.out.println(b);
				/*Inner i=new Inner();
				i.Show();*/
				System.out.println("Hello -m1 end");
				}

				void m2(){
				System.out.println("Hello -m2 begin");
				System.out.println(a);
				System.out.println(b);
				
								class Inner{
								
								int x=99;
								//static int y=88;
								
								void show(){
								System.out.println("Inner-show");
								System.out.println(x);
								//System.out.println(y);
								System.out.println(a);
								System.out.println(b);
								}
								
								}
										
						Inner i=new Inner();
						
						i.show();
						
						System.out.println("Hello -m2 end");
				
				}
				
}


class lab36{

			public static void main(String args[]){

			Hello h=new Hello();

			h.m1();
			h.m2();

			}
			
}