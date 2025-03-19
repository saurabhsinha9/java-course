class lab7{
public static void main(String args[]){
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int max=(a>b)?a:b;
System.out.println("max="+max);
int min=(a<b)?a:b;
System.out.println("min="+min);
}
}