//Example using Buffered Reader and Print Stream
import java.io.*;


public class IOLab3{
	public static void main(String args[]){
	

try{
	InputStreamReader isr=new InputStreamReader(System.in);
	Reader rd=new BufferedReader(isr);

	PrintStream ps=System.out;
	System.out.println("Enter Data");
	
	char ch=' ';
	

	do{
	int b=rd.read();
	ch=(char)b;
	//ps.println("****");
	ps.write(b);
	//ps.println("#####");
	//System.out.println(ch);
	}while(ch!='\n');

	}catch(Exception e){
	
		e.printStackTrace();
	}

	}
}


