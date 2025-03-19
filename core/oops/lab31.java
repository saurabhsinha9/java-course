interface i1{

		int a=10;
		int b=20;
		int c=30;
		
} 


interface i2 extends i1{

				void m1();
				void m3();
				
}


interface i3{

			public final static int x=100;
			public final static int y=200;
			public final static int c=300;
			
}


interface i4{

			public abstract void m2();

}


interface i5 extends i3,i4{

			public abstract void show();
			public abstract void m3();
			
}


class Hello implements i2,i5{

			public void m1(){
			System.out.println("m1");
			}

			public void m2(){
			System.out.println("m2");
			}

			public void m3(){
			System.out.println("m3");
			}

			public void show(){
			System.out.println(a);
			System.out.println(b);
			System.out.println(x);
			System.out.println(y);
			//System.out.println(c);
			System.out.println(i2.c);//when class is implementing two or more interface that contain some variable common then to reference these use the interface name
			System.out.println(i5.c);//when class is implementing two or more interface that contain some variable common then to reference these use the interface name
			}

}
class lab31{

		public static void main(String args[]){

			i2 obj=new Hello();
			
			obj.m1();
			obj.m3();
			//obj.show();
			
			i5 obj1=new Hello();
			
			obj1.m2();
			obj1.m3();
			obj1.show();
			
}
}