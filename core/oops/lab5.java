class student{

int sid;
String sname;
String email;
long phone;

	void student(){ 			/*normal method*/
	System.out.println("method student");
	}

	student(){ //default constructor
	System.out.println("0 args cons");
	}

	student(int id,String sn,String em){
	System.out.println("3 args cons");
	sid=id;
	sname=sn;
	email=em;
	}

	student(int id,String sn,String em,long ph){
	System.out.println("4 args cons");
	sid=id;
	sname=sn;
	email=em;
	phone=ph;
	}

	void show(){
	System.out.println("show()");
	System.out.println(sid);
	System.out.println(sname);
	System.out.println(email);
	System.out.println(phone);
	}

}


class lab5{

public static void main(String args[]){

student s1=new student();
s1.show();
student s2=new student(100,"saurabh","s.in",54);
s2.show();
student s3=new student(100,"gaurav","g.in");
s3.show();
s1.student();

}

}