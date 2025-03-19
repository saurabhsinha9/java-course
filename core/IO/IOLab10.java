

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



class Account implements Serializable{
	int accno;
	double amt;
	transient String atype;
	static String country;
	Account(int accno, double amt, String atype,String country) {
		super();
		this.accno = accno;
		this.amt = amt;
		this.atype = atype;
		this.country=country;
	}
	
	public String toString() {
		return "Account [accno=" + accno + ", amt=" + amt + ", atype=" + atype
				+ ", country=" + country +"]";
	}
}
class IOLab10{
	public static void main(String args[]){
		serialize();
		deSerialize();
		
	}


	static void serialize() {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try{
			fos=new FileOutputStream("accounts.txt");
			oos=new ObjectOutputStream(fos);
			Account a1=new Account(11,1000,"SA","India");
			Account a2=new Account(12,2000,"CA","India");
			Account a3=new Account(13,3000,"CA","India");
			Account a4=new Account(14,5000,"SA","India");
			Account a5=new Account(15,1000,"CA","India");
			
			
			oos.writeObject(a1);
			oos.writeObject(a2);
			oos.writeObject(a3);
			oos.writeObject(a4);
			oos.writeObject(a5);
			System.out.println("Done");
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				if(fos!=null){
					fos.close();
				}
				if(oos!=null){
					oos.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	

	 static void deSerialize() {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try{
			fis=new FileInputStream("accounts.txt");
			ois=new ObjectInputStream(fis);
			for(int i=0;i<4;i++){
				Account acc=(Account) ois.readObject();
				System.out.println(acc);
				System.out.println("done");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				if(fis!=null){
					fis.close();
				}
				if(ois!=null){
					ois.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
