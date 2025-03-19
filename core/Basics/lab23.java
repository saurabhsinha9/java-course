class lab23{
public static void main(String args[]){
int n=Integer.parseInt(args[0]);
int fact=1;
for(int i=1;i<=n;i++){
fact=fact*i;
}
System.out.println("factorial of"+n+"is"+fact);


int fact1=1;
int i=1;
while(i<=n){
fact1=fact1*i;
i++;
}
System.out.println("factorial of"+n+"is"+fact1);
}
}