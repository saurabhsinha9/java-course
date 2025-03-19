class lab21{
public static void main(String args[]){
int m=Integer.parseInt(args[0]);
int n=Integer.parseInt(args[1]);
//int m=1;
//int n=100;
System.out.println("m="+m);
System.out.println("n="+n);
for(int i=m;i<=n;i++){
System.out.println(i);
if(i%7==0){
System.out.println("7 divisible is"+i);
//System.out.println(i);
}
}
}
}