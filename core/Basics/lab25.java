class lab25{
static int reversenum(int n){
int rev=0;
while(n!=0){
int r=n%10;
rev=rev*10+r;
n=n/10;
}
return rev;
}

static int sumdigit(int n){
int sum=0;
while(n!=0){
int s=n%10;
sum+=s;
n=n/10;
}
return sum;
}

static int finddigit1(int n){
int count=0;
if(n==0){
count =1;
}
else{
while(n!=0){
int fd1=n%10;
count++;
n=n/10;
}
}
return count;
}

static int finddigit2(int n){
int count=0;
if(n==0){
count =1;
}
do{
int fd2=n%10;
count++;
n=n/10;
}while(n!=0);

return count;
}

public static void main(String args[]){
int n=Integer.parseInt(args[0]);
int r=reversenum(n);
System.out.println("reverse of"+n+"is    "+r);
int s=sumdigit(n);
System.out.println("sum of all digit of"+n+"is    "+s);
int fd1=finddigit1(n);
System.out.println("no of all digit of"+n+"is    "+fd1);
int fd2=finddigit2(n);
System.out.println("no of all digit of"+n+"is    "+fd2);
}
}