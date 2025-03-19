//Example using data input stream

import java.io.*;


public class IOLab1{
	public static void main(String args[]){
	

try{
	DataInputStream dis=new DataInputStream(System.in);

	System.out.println("Enter the first no");
	int a=Integer.parseInt(dis.readLine());
	
	System.out.println("Enter the second no");
	int b=Integer.parseInt(dis.readLine());
	
		int sum=a+b;
	System.out.println("sum	"+sum);
	}catch(Exception e){
	
		e.printStackTrace();
	}

	}
}


