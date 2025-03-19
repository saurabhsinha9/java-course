abstract class Animal{

			abstract void eating();
			abstract void sleeping();
			abstract void running();
			
}


abstract class Dog extends Animal{

				void eating(){
				System.out.println("Dog eating");
				}
				
				void running(){
				System.out.println("Dog running");
				}
				
}


class MyDog extends Dog{

				void sleeping(){
				System.out.println("MyDog  sleeping");
				}
				
}


abstract class Cat extends Animal{

				void eating(){
				System.out.println("Cat eating");
				}
				
				void running(){
				System.out.println("Cat running");
				}
				
				void sleeping(){
				System.out.println("Cat sleeping");
				}
				
}


class MyCat extends Cat{

}


class lab28{

		public static void main(String args[]){

			Animal a=null;
			
			a=new MyDog();
			a.eating();
			a.sleeping();
			a.running();
			
			/*
			a=new Cat();

			a.eating();
			a.sleeping();
			a.running();
			*/
			
			a=new MyCat();

			a.eating();
			a.sleeping();
			a.running();

			}
			
	}