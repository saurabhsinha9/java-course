class lab9{
public static void main(String args[]){
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
int d=Integer.parseInt(args[3]);
int max=(a>b)?((a>c)?((a>d)?a:d):((c>d)?c:d)):((b>c)?((b>d)?b:((c>d)?c:d)):((c>d)?c:d));
System.out.println("max="+max);
int min=(a<b)?((a<c)?((a<d)?a:d):((c<d)?c:d)):((b<c)?((b<d)?b:((c<d)?c:d)):((c<d)?c:d));
System.out.println("min="+min);
}
}