package gen;

public class Generate {

	public static void main(String[] args) {
		String str[]={"-i","src/students.xsd","-package","com.jlcindia.jaxb"};
		org.exolab.castor.builder.SourceGeneratorMain.main(str);
		System.out.println("Done");
	}

}
