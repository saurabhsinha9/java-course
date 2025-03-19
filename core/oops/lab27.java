class Animal{

			void eating(){
			System.out.println("Animal eating");
			}
			
			void sleeping(){
			System.out.println("Animal sleeping");
			}
			
			static public void running(){
			System.out.println("Animal running");
			}
}


class Dog extends Animal{

			void eating(){
			System.out.println("Dog eating");
			}
			
			static public void running(){
			System.out.println("Dog running");
			}
			
			void barking(){
			System.out.println("Dog barking");
			}
			
}
			
			
class Cat extends Animal{
			void eating(){
			System.out.println("Cat eating");
			}
			
			static public void running(){
			System.out.println("Cat running");
			}
			
			void barking(){
			System.out.println("Cat barking");
			}
			
}


class lab27{

		public static void main(String args[]){
			
			Animal a=null;
			
			a=new Dog();
			a.eating();
			a.sleeping();
			
			a.running();
			/*bcoz of static running() a.running call the animal class runnning method for ex:
			class Hello{
			void m1(){}
			static void m2(){}
			}
			class Lab{ psvm(){
			Hello h=null;
			h.m2();
			}
			}
			*/
			
			//a.barking();
			
			a=new Cat();
			
			a.eating();
			a.sleeping();
			
			a.running();
			
			/*bcoz of static running() a.running call the animal class runnning method for ex:
			class Hello{
			void m1(){}
			static void m2(){}
			}
			class Lab{ psvm(){
			Hello h=null;
			h.m2();
			}
			}
			*/
			
			//a.barking();
		
		}
	
}