class lab8{
public static void main(String args[]){
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
System.out.println("max="+max);
int min=(a<b)?((a<c)?a:c):((b<c)?b:c);
System.out.println("min="+min);
}
}