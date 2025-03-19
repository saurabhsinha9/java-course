interface Animal{

void eating();

}


class Hello{

			void show(final String name){
			 final int x=10;
			
			Animal ani=new Animal(){
			public void eating(){
			System.out.println("Anno-eating() by "+name+""+x);
			}
			};

			class Dog implements Animal{

					public void eating(){
					System.out.println("Dog-eating()by "+name+""+x);
					}
					
			}

			}
}


class lab38{

		public static void main(String args[]){

					Hello h=new Hello();
					h.show("saurabh");

		}
		
}