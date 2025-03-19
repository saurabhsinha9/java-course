class lab42{
public static void main(String args[]){
int x[][][]=new int[3][3][3];
for(int i=0;i<x.length;i++){
for(int j=0;j<x[i].length;j++){
for(int k=0;k<x[i][j].length;k++){
System.out.print(x[i][j][k]+"	");
}
System.out.println("");
}
System.out.println("");
System.out.println("");
}
x[0][0][0]=111;
x[1][1][1]=222;
x[2][2][2]=333;
for(int i=0;i<x.length;i++){
for(int j=0;j<x[i].length;j++){
for(int k=0;k<x[i][j].length;k++){
System.out.print(x[i][j][k]+"	");
}
System.out.println("");
}
System.out.println("");
System.out.println("");
}
}
}