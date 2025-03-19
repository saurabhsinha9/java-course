class outer{

			int a=10;
			static int b=20;

					void m1(){
					System.out.println("outer-m1");
					System.out.println(a);
					System.out.println(b);
					//System.out.println(x);
					inner i=new inner();
					System.out.println(i.x);
					i.test();
					}


		class inner{

			int x=99;
			//static int y=88;

					void show(){
					System.out.println("Inner-show");
					System.out.println(x);
					//System.out.println(y);
					System.out.println(a);
					System.out.println(b);
					}

					void test(){
					System.out.println("Inner-test");
					}

		}

}


class lab33{



				public static void main(String args[]){

				outer o=new outer();
				o.m1();

				//outer.inner ii=new outer.inner();

				outer.inner i1=new outer().new inner();
				i1.show();

				outer.inner i2=o.new inner();
				i2.show();
				}
				
}