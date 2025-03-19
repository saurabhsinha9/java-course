class outer{

		int a=10;
		static int b=20;
		
				void m1(){
				System.out.println("outer-m1");
				System.out.println(a);
				System.out.println(b);
				//System.out.println(x);
				//System.out.println(inner.x);
				System.out.println(inner.y);
				inner.test();
				inner i=new inner();
				System.out.println(i.x);
				i.show();
				}
				
	static class inner{
	
			int x=100;
			static int y=200;
			
					void show(){
					System.out.println("inner-show");
					System.out.println(x);
					System.out.println(y);
					//System.out.println(a);
					System.out.println(b);
					}
					
					static void test(){
					System.out.println("inner-test");
					}
					
	}
	
}


class lab35{

		public static void main(String args[]){

				outer o=new outer();
				o.m1();
				
				outer.inner ii=new outer.inner();
				
				ii.show();

		}

}