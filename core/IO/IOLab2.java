//Example using byte input stream

import java.io.*;


public class IOLab2{
	public static void main(String args[]){
	

try{
	BufferedInputStream bis=new BufferedInputStream(System.in);

	PrintStream ps=System.out;
	System.out.println("Enter Data");
	
	char ch=' ';
	int x=0;

	do{
	x=bis.read();
	ch=(char)x;
	ps.println("****");
	ps.write(ch);
	ps.println("****");
	System.out.println(ch);
	}while(x!=10);

	}catch(Exception e){
	
		e.printStackTrace();
	}

	}
}


