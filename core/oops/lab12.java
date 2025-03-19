class Hello{

		int a;
		int b;
		static int y=99;
		
					{
					System.out.println("Hello -IB");
					}
					
					static{
					System.out.println("Hello -SB");
					}
					
					Hello(int x){
					System.out.println("Hell -1 args cons");
					a=x;
					b=x;
					}
					
					Hello(int x,int y){
					System.out.println("Hell -2args cons");
					a=x;
					b=y;
					}
					
					void show(){
					
					int x=111;
					int y=222;
					
					System.out.println(a);
					System.out.println(b);
					
					System.out.println(this.y);
					
					System.out.println(x);
					System.out.println(y);
					
					}
					
}


class lab12{

		int x=10;
		static int y=20;
		
			{
			System.out.println("lab12 -IB");
			}
			
			static{
			System.out.println("lab12 -SB");
			}
			
			public static void main(String args[]){
			
			Hello h1=new Hello(100);
			h1.show();
			Hello h2=new Hello(150,200);
			h2.show();
			
			}
		
}