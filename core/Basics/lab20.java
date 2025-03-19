class lab20{
public static void main(String args[]){
boolean x=true;
switch(x){
case true:System.out.println("ok");break;
case false:System.out.println("not-ok");
}
}
}
/*
o/p---------------->
lab20.java:4: incompatible types
found   : boolean
required: int
switch(x){
       ^
lab20.java:5: incompatible types
found   : boolean
required: int
case true:System.out.println("ok");break;
     ^
lab20.java:6: incompatible types
found   : boolean
required: int
case false:System.out.println("not-ok");
     ^
3 errors
*/