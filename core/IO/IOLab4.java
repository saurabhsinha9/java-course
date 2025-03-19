
import java.io.*;

class DataRW{
	
	static void WriteToFile(){
		
		try{
			BufferedInputStream bis=new BufferedInputStream(System.in);
			
			FileOutputStream fos=new FileOutputStream("jlc.txt");
			
			System.out.println("Enter Data");
			
			int x=0;

			do{
			x=bis.read();
			fos.write(x);
			}while(x!=10);
			System.out.println("Done");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	static void ReadFromFile(){
		
		try{
			System.out.println("");
			FileInputStream fis=new FileInputStream("jlc.txt");
			int x=0;
			char ch=' ';
			do{
				x=fis.read();
				ch=(char) x;
				System.out.println(ch);
			}while(x!=10);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}


class IOLab4 {

	public static void main(String[] args) {
	//DataRW.WriteToFile();
	DataRW.ReadFromFile();

	}

}
