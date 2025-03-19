
import java.io.*;


class IOLab9 {

	public static void main(String[] args)throws IOException {
		try{
			

			char ch[]={'J','L','C','I','N','D','I','A','*'}	;


			CharArrayReader car=new CharArrayReader(ch);
			CharArrayWriter caw=new CharArrayWriter();
			char c=' ';
			
			do{
				int b=car.read();
				    c=(char)b;
				if(c!='*'){
					caw.write(b);
					System.out.println(c);
				}

			}while(c!='*');
			String jlc=caw.toString();
			System.out.println("Given Array as String "+jlc);
		}catch(Exception e){
			e.printStackTrace();
		 }

	}

}
