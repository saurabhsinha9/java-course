class lab22{
public static void main(String args[]){
int n=Integer.parseInt(args[0]);
if(n==1){
System.out.println(n+" is not prime");
}
else{
int c=0;
int x=0;
for(int i=2;i<=n/2;i++){
x++;
if(n%i==0){
c++;
break;
}
}
System.out.println(x);

if(c==0){
System.out.println(n+"is prime");
}
else{
System.out.println(n+"is not prime");
}
}
}
}