abstract class Hello{

			int a;
			static int b;

						{
						System.out.println("Hello-IB");
						}

						static{
						System.out.println("Hello-SB");
						}

						Hello(int a,int b){
						this.a=a;
						this.b=b;
						}

						void m1(){
						System.out.println("m1");
						}

						static void m2(){
						System.out.println("m2");
						}

						abstract void m3();

}


class Hai extends Hello{
						
						{
						System.out.println("Hai-IB");
						}

						static{
						System.out.println("Hai-SB");
						}
						
						Hai(int a,int b){
						super(a,b);
						}

						void m3(){
						System.out.println("m3");
						}

						void show(){
						System.out.println(a);
						System.out.println(b);
						}

}


class lab29{

			public static void main(String args[]){

					Hai h=new Hai(10,20);

					h.m1();
					h.m2();
					h.m3();

					h.show();

			}

}