class Hello{

			void m1(){
			System.out.println(a);
			System.out.println(b);
			}

			static void m2(){
			//System.out.println(a);  //A: non static variable 'a' can't be referenced
			System.out.println(b);
			}

			{
			System.out.println("Hello -IB");
			System.out.println(a);	//B:  illegal forward reference
			System.out.println(b);
			}

			static{
			System.out.println("Hello -SB");
			//System.out.println(a);	//A
			//System.out.println(b);	//B
			}

int a=88;
static int b=99;

}


class lab13{

			public static void main(String args[]){

					Hello h=new Hello();

					h.m1();
					h.m2();

			}
			
}