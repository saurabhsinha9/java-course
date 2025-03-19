package com.jlcindia.varargs;

class A{
	void m1(){
		System.out.println("m1()");
	}
	void m1(int...x){
		System.out.println("m1(int...x)");
		for(int i:x){
			System.out.println(i);
		}
	}
	//not ok
	//void m1(int x[]){both are same}
	
	void m1(int x,int y){
		System.out.println("m1(int x,int y)");
	}
	
	void m1(String...x){
		System.out.println("m1(String...x)");
		for(String i:x){
			System.out.println(i);
		}
	}
	void m2(String...x){
		System.out.println("m2(String...x)");
		for(String i:x){
			System.out.println(i);
		}
	}
	void m2(String x,String y){
		System.out.println("m2(String x,String y)");
	}
	//not ok
	//void m3(int...x,String...y){}
	
	//not ok
	//void m4(int...x,int d,String y){}
	
	void m5(int d,String y,int...x){
		System.out.println("void m5(int d,String y,int...x)");
	}
	int sum(int...x){
		System.out.println("sum(int...x)");
		int sum=0;
		for(int a:x){
			sum=sum+a;
		}
		return sum;
	}
}
public class Lab1 {
	public static void main(String[] args) {
		A a=new A();
		a.m1();
		//a.m1(null);//ambiguous for m1(int...x) & m1(String...x)
		a.m1(5);
		a.m1(5,6);
		a.m1(5,6,7);
		a.m1("abc");
		a.m2("jlc");
		a.m2("jlc1","jlc2");
		a.m2("jlc1","jlc2","jlc3");
		int ar[]={5,6,7,8};
		a.m5(2, "saurabh", ar);
		a.m5(2, "saurabh", 6,7,8,9,10,11);
		int y=a.sum(ar);
		System.out.println(y);
		int z=a.sum(5,6,7,8);
		System.out.println(y==z);
	}

}
