//example using object
class customer{
int cid;
String cname;
String email;
long phone;
customer(){
}
customer(int cid,String cname,String email,long phone){
this.cid=cid;
this.cname=cname;
this.email=email;
this.phone=phone;
}
void show(){
System.out.println(cid+"\t"+cname+"\t"+email+"\t"+phone);
}
public int hashCode(){
// algo by user
System.out.println("inside hashCode()........");
int x=20; 
return x;
}
public boolean equals(Object o){
customer c=(customer)o;
if(this.cid==c.cid && this.cname.equals(c.cname)){
return true;
}
return false;
}
public String toString(){
return""+cid+"\t"+cname+"\t"+email+"\t"+phone;
}
}
class lab22{
public static void main(String args[]){
customer c1=new customer(101,"Sri","sri@jlc",9999);
customer c2=new customer(101,"Sri","sri@jlc",9999);
customer c3=new customer(102,"Sri","sri@jlc",9999);
c1.show();
System.out.println(c1.getClass());
System.out.println(c1.getClass().getName());
System.out.println(c1.hashCode());
System.out.println(c1.toString());
System.out.println(c2);
System.out.println(c1);
System.out.println(c1==c2);
System.out.println(c1.equals(c2));
System.out.println(c1==c3);
System.out.println(c1.equals(c3));
}
}
