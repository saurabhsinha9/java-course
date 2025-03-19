class lab37{
public static void main(String args[]){
int a[]=new int[3];
System.out.println(a);
for(int i=0;i<a.length;i++){
System.out.print(a[i]+"	");
}
System.out.println("");
a=new int[5];
System.out.println(a);
for(int i=0;i<a.length;i++){
System.out.print(a[i]+"	");
}
System.out.println("");
//a={1,2,3};
a[2]=99;
for(int i=0;i<a.length;i++){
System.out.print(a[i]+"	");
}
System.out.println("");
double x[]={10.1,10.2,10.3,10.4,10.5};
for(int i=0;i<x.length;i++){
System.out.print(x[i]+"	");
}
System.out.println("");
System.out.println(x);
x[2]=99.9;
for(int i=0;i<x.length;i++){
System.out.print(x[i]+"	");
}
System.out.println("");
//x={1.1,1.2,1.3};
x=new double[3];
System.out.println(x);
for(int i=0;i<x.length;i++){
System.out.print(x[i]+"	");
}
System.out.println("");
x[0]=1.1;
x[1]=1.2;
x[2]=1.3;
for(int i=0;i<x.length;i++){
System.out.print(x[i]+"	");
}
System.out.println("");

}
}