// Method overridng
class A{

			void m1(){
			System.out.println("A-m1");
			}
			
			void m2(){
			System.out.println("A-m2");
			}
			
}


class B extends A{

			void m1(){
			System.out.println("B-m1");
			}
			
			void m3(){
			System.out.println("B-m3");
			}
			
}


class lab25{

		public static void main(String args[]){
		
				B obj=new B();
				
				obj.m1();	//overridden method
				obj.m2();	//inherited method
				obj.m3();	
				
		}
		
}