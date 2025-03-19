
import java.io.*;


class IOLab7 {

	public static void main(String[] args)throws IOException {
		try{
			File f=new File("jlcindia\\Hello.txt");
				
				f.createNewFile();
				f.deleteOnExit();

			File f2=new File("jlcindia\\Hi.txt");

				f2.createNewFile();
			System.out.println("f2.isHidden()"+f2.isHidden());
			//System.out.println("f2.delete()"+f2.delete());

			System.out.println("File Created");
			

			File f3=new File("jlcindia\\Default User");
			f3.mkdir();
			System.out.println("f3.isHidden()"+f3.isHidden());
			File f4=new File("ABC.txt");
			f4.createNewFile();
			System.out.println("After creating the file");
			System.out.println("f4.isHidden()"+f4.isHidden());

			Runtime.getRuntime().exec("attrib +H ABC.txt");//make file ABC.txt as hidden

		}catch(Exception e){
			e.printStackTrace();
		 }

	}

}
