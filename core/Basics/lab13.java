class lab13{
public static void main(String args[]){
double d1=Double.parseDouble(args[0]);
double d2=Double.parseDouble(args[1]);
double max;
double min;
if(d1>d2){
max=d1;
min=d2;
}
else{
max=d2;
min=d1;
}
System.out.println("max="+max);
System.out.println("min="+min);
}
}