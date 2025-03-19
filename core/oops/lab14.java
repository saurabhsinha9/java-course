class Hai{

		int x=10;
		
}


class Hello{

		/* call by value*/
		
			void m1(int a){
			System.out.println("m1 begin");
			System.out.println(a);
			a=a+10;
			System.out.println(a);
			System.out.println("m1 end");
			}
			
			/*call by reference*/
			
			void m2(Hai hai){
			System.out.println("m2 begin");
			System.out.println(hai.x);
			hai.x=hai.x+10;
			System.out.println(hai.x);
			System.out.println("m2 end");
			
			}
			
} 


class lab14{

public static void main(String args[]){

					Hello h =new Hello();
					
					int p=100;// local to main
					h.m1(p);
					System.out.println(p);//call by value--modification in method not reflected to caller
					
					Hai ha=new Hai();
					System.out.println(ha.x);
					
					h.m2(ha);
					System.out.println(ha.x);//call by reference --modification in method reflected to caller

					}

}