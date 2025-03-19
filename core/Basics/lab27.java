class lab27{
public static void main(String args[]){
JLC1:
for(int i=1;i<=4;i++){
System.out.println("");
System.out.println("i="+i);

JLC2:
for(int j=1;j<9;j++){
System.out.println("j="+j);
if(j<=3){
System.out.print("		*		");
}

else if(j<=5){
continue JLC2;
}
else{
continue JLC1;
}
}
System.out.println("");
}
System.out.println("");
System.out.println("Done");
}
}