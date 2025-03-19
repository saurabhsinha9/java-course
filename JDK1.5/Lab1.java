
import java.util.ArrayList;
import java.util.Iterator;

class A{
	
	ArrayList<String> m1(){
		ArrayList<String> al=new ArrayList<String>();
		al.add("sri");
		
		return al;
	}
}
class  B{
	void show(){
		A a=new A();
		ArrayList<String> al=a.m1();
	}
}

public class Lab1 {
public static void main(String[] args) {
	B b=new B();
	b.show();
}
}
