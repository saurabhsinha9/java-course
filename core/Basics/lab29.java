class lab29{
public static void main(String args[]){
int n=Integer.parseInt(args[0]);
for(int i=1;i<=4;i++){
for(int j=1;j<=4-i;j++){
System.out.print("  ");
}
for(int k=1;k<=i;k++){
System.out.print("	*	");
}
for(int m=1;m<=i-1;m++){
System.out.print("	*	");
}
System.out.println("");
}
int rows=4;
for(int i=1;i<=3;i++){
rows--;
for(int j=1;j<=i;j++){
System.out.print("  ");
}
for(int k=rows;k>=1;k--){
System.out.print("	*	");
}
for(int m=rows-1;m>=1;m--){
System.out.print("	*	");
}
System.out.println("");
}
}
}