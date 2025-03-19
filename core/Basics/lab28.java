class lab28{
public static void main(String args[]){
int n=Integer.parseInt(args[0]);
for(int i=1;i<n/2+1;i++){
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println("");
}
for(int i=1;i<=n/2;i++){
for(int j=n/2;j>=i;j--){
System.out.print("*");
}
System.out.println("");
}
}
}