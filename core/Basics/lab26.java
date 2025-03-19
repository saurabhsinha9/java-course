class lab26{
public static void main(String args[]){
for(int i=1;i<=25;i++){
System.out.println(i);
System.out.println("Begin-loop");
if(i<=5){
continue;
}
else if(i<=10){
System.out.println(i);
}
else{
break;
}
System.out.println("End-loop");
}
System.out.println("done");
}
}