class Arithmetic{

void sum(int a){
System.out.println(a+a);
}

void sum(double a){
System.out.println(a+a);
}

int sum(int a,int b){
return a+b;
}

void sum(double a,double b){
System.out.println(a+b);
}

void sum (int a,double b){
System.out.println(a+b);
}

void sum(double a,int b){
System.out.println(a+b);
}

}


class lab10{

public static void main(String arg[]){

Arithmetic ar= new Arithmetic();
ar.sum(10);
ar.sum(10.5);

int x=ar.sum(10,20);
System.out.println(x);

ar.sum(10.5,20.1);
ar.sum(10,12.5);
ar.sum(10.75,15);

}

}