class A{

		int a;
		int x=100;
		
				{
				System.out.println("A-IB");
				}
				
				static {
				System.out.println("A-SB");
				}
				
				A(){
				System.out.println("A -Default cons");
				}
				
				A(int a){
				System.out.println("A -1 args cons");
				this.a=a;
				}
				/*void m1(){
				System.out.println(x);
				System.out.println(this.x);
				//System.out.println(super.x);
				}*/
				
}


class B extends A{

			int b;
			int x=200;
			
				{
				System.out.println("B-IB");
				}
				static {
				System.out.println("B-SB");
				}
				
				B(){
				System.out.println("B -Default cons");
				}
				
				B(int b){
				System.out.println("B -1 args cons");
				this.b=b;
				}
				
				void m1(){
				System.out.println(x);
				System.out.println(this.x);
				System.out.println(super.x);
				}
				
}


class C extends B{

			int c;
			int x=300;
			
					{
					System.out.println("C-IB");
					}
					
					static{
					System.out.println("C-SB");
					}
					
					C(){
					System.out.println("C -Default cons");
					}
					
					C(int c){
					System.out.println("C -1 args cons");
					this.c=c;
					}
					
					void Show(){
					System.out.println("C-show");
					System.out.println(a);
					System.out.println(b);
					System.out.println(c);
					System.out.println(x);
					System.out.println(this.x);
					System.out.println(super.x);
					m1();
					this.m1();
					super.m1();
					}
					
}


class lab23{
				public static void main(String args[]){
				
					//C obj1=new C();
					//obj1.Show();
					
					C obj2=new C(99);
					//obj2.Show();
					
					}
					  
}