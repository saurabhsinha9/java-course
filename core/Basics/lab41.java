class lab41{
public static void main(String args[]){
int x[][]=new int[3][3];
for(int i=0;i<x.length;i++){
for(int j=0;j<x[i].length;j++){
System.out.print(x[i][j]+"	");
}
System.out.println("");
}
System.out.println("");
System.out.println("");
x[0][0]=11;
x[1][1]=22;
x[2][2]=33;
for(int i=0;i<x.length;i++){
for(int j=0;j<x[i].length;j++){
System.out.print(x[i][j]+"	");
}
System.out.println("");
}
System.out.println("");
System.out.println("");
int a[][]={{1,2,3,9},{2,3,4},{4,5,6},{5,6,7,8}};
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
System.out.print(a[i][j]+"	");
}
System.out.println("");
}
System.out.println("");
System.out.println("");
int s[][]=new int[3][];
for(int i=0;i<s.length;i++){
System.out.print(s[i]+"	");
}
System.out.println("");
System.out.println("");
System.out.println("");
s[0]=new int[3];
s[1]=new int[4];
s[2]=new int[2];
for(int i=0;i<s.length;i++){
for(int j=0;j<s[i].length;j++){
System.out.print(s[i][j]+"	");
}
System.out.println("");
}
System.out.println("");
System.out.println("");

}
}