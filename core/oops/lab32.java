interface i1{

			int a=10;

} 


class Hai{

			static int b=20;

}


class Hello extends Hai implements i1{

public void show(){
System.out.println(a);
System.out.println(b);
}

}


//class Hello1 implements i1 extends Hai {}
class lab32{

		public static void main(String args[]){
		
		Hello h= new Hello();

		h.show();

		}
		
}