class lab16{
public static void main(String args[]){
double d=9.9;
switch(d){
case 9.9:System.out.println("9.9");
default:System.out.println("invalid number");
}
}
}
/*
o/p----------------->
lab16.java:4: possible loss of precision
found   : double
required: int
switch(d){
       ^
lab16.java:5: possible loss of precision
found   : double
required: int
case 9.9:System.out.println("9.9");
     ^
2 errors
*/