class A{

		int x=100;
		int a;
		int p=123;

}


class B extends A{

		int y=200;
		int a;

			B(int a,int b){
			
		super.a=b;
			this.a=a;
			}

			void m1(){
			int a=10;
			

			p=120;
			
			System.out.println(a);
			System.out.println(y);
			System.out.println(x);
			System.out.println(this.a);
			System.out.println(p);
			System.out.println(this.p);
			System.out.println(super.a);
			System.out.println(super.p);
			
			}
}


class lab22{
public static void main(String args[]){
B obj=new B(88,99);
obj.m1();
}
}