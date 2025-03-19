abstract class Animal1{

			abstract void eating();
			
}


interface Animal2{

			void sleeping();

}


class Hai{

			void m1(){
			System.out.println("Hai-m1");
			}

}


class Hai1 extends Hai{

			void m1(){
			System.out.println("Hai1-m1");
			}
			
}


class Hello{

		int a=10;

			Animal2 a2=new Animal2(){
			public void sleeping(){
			System.out.println("Anno-sleeping()");
			}
			};


			Animal1 a1=new Animal1(){
			void eating(){
			System.out.println("Anno-eating()");
			}
			};

			Hai h1=new Hai();
			Hai h2=new Hai1();

			Hai h3=new Hai(){
			void m1(){
			System.out.println("Anno-inner class-sub class of Hai -m1");
			}
			};

			void show(){
			System.out.println(a);
			h1.m1();
			h2.m1();
			h3.m1();
			a1.eating();
			a2.sleeping();
			}

}


class lab37{

		public static void main(String args[]){

		Hello h=new Hello();

		h.show();
		
		}
}