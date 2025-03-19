
import java.io.*;


class IOLab8 {

	public static void main(String[] args)throws IOException {
		try{
			

			byte by[]={'J','L','C','I','N','D','I','A','*'}	;


			ByteArrayInputStream bais=new ByteArrayInputStream(by);
			ByteArrayOutputStream baos=new ByteArrayOutputStream();
			char c=' ';
			
			do{
				int b=bais.read();
				    c=(char)b;
				if(c!='*'){
					baos.write(b);
					System.out.println(c);
				}

			}while(c!='*');
			String jlc=baos.toString();
			System.out.println("Given Array as String "+jlc);
		}catch(Exception e){
			e.printStackTrace();
		 }

	}

}
