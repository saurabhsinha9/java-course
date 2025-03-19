class A{

		int a;
		int b;
					A(){
					System.out.println("A -default con");
					}
					
					A(int a,int b){
					System.out.println("A -2args con");
					this.a=a;
					this.b=b;
					}

}


class B extends A{

		int c;
		int d;

					B(){
					System.out.println("B -default con");
					}

					B(int c,int d){
					super(c,d);
					System.out.println("B -2args con");
					this.c=c;
					this.d=d;
					}

					B(int a,int b,int c,int d){
					super(a,b);
					System.out.println("B -4args con");
					this.c=c;
					this.d=d;
					}

}


class C extends B{

		int e;
		int f;

					C(){
					System.out.println("C -default con");
					}

					C(int e,int f){
					super(e,f);
					System.out.println("C -2args con");
					this.e=e;
					this.f=f;
					}

					C(int a,int b,int c,int d,int e,int f){
					super(a,b,c,d);
					System.out.println("C -6args con");
					this.e=e;
					this.f=f;
					}

					void show(){
					System.out.println("A-show");
					System.out.println(a);
					System.out.println(b);
					System.out.println(c);
					System.out.println(d);
					System.out.println(e);
					System.out.println(f);
					}

}


class lab19{

			public static void main(String args[]){

					//B obj=new B();
					//obj.show();

					//C obj1=new C();
					//obj1.show();

					//C obj2=new C(10,20);
					//obj2.show();

					C obj3=new C(11,12,13,14,15,16);
					//obj3.show();

			}

}



