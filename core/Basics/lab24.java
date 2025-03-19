class lab24{
static int fact(int x){
if(x==1||x==0){
return 1;
}
return x*fact(x-1);
}
public static void main(String args[]){
int n=Integer.parseInt(args[0]);
int f=fact(n);
System.out.println("factorial of"+n+"is"+f);
}
}