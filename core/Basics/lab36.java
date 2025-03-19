class Hello{
int p=99;
public String toString(){
return "jlc :"+p;
}
}
class lab36{
static int a[];
public static void main(String args[]){
System.out.println(a);
a=new int[5];
System.out.println(a);
for(int i=0;i<a.length;i++){
System.out.print(a[i]+"	");
}
System.out.println("");
a[0]=10;
a[2]=30;
a[4]=50;
for(int i=0;i<a.length;i++){
System.out.print(a[i]+"	");
}
System.out.println("");
double x[]={10.1,10.2,10.3,10.4,10.5};
for(int i=0;i<x.length;i++){
System.out.print(x[i]+"	");
}
System.out.println("");
x[2]=30.1;
for(int i=0;i<x.length;i++){
System.out.print(x[i]+"	");
}
System.out.println("");

//x[5]=30.1;	//ArrayIndexOutOfBoundsException

String str[]={"aa","bb","cc"};
for(int i=0;i<str.length;i++){
System.out.print(str[i]+"	");
}
System.out.println("");

String st[]=new String[3];
st[0]="111";
st[1]="222";
st[2]="333";
for(int i=0;i<st.length;i++){
System.out.print(st[i]+"	");
}
System.out.println("");
Hello h1=new Hello();
Hello h2=new Hello();
Hello h3=new Hello();
System.out.println(h1);
System.out.println(h2);
System.out.println(h3);

Hello h[]=new Hello[3];
for(int i=0;i<h.length;i++){
System.out.print(h[i]+"	");
}
System.out.println("");
h[0]=h1;
h[1]=h2;
h[2]=h3;
for(int i=0;i<h.length;i++){
System.out.print(h[i]+"	");
}
System.out.println("");
}
}