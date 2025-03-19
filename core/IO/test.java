import java.io.*;

public class test {

	
	public static void main(String[] args) {
		readFromFile();

	}
	
	static void readFromFile(){
		PrintStream ps=null;
		
		FileReader fr=null;
		
		try{
			ps=System.out;
			fr=new FileReader("jlc.doc");

			
		
			char ch=' ';
			do{
				int b=fr.read();
				ch=(char)b;
				
				ps.write(b);
				
				}while(ch!=';');

		}catch(Exception e){
			
			e.printStackTrace();
		}
		finally{
			
			try{
				if(ps!=null){
				ps.close();
				}
				if(fr!=null){
				fr.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
