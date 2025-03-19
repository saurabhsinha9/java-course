package com.jlcindia.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class SAXParser {
	public static void main(String[] args) {
		System.out.println("main");
		try {
			//create reader object
			XMLReader reader=XMLReaderFactory.createXMLReader("org.apache.xerces.parsers.SAXParser");
			//create Instance of handler class
			JLCHandler jh=new JLCHandler();
			//registering with the reader
			reader.setContentHandler(jh);
			//parse the xml line by line
			reader.parse("src/jlc.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class JLCHandler extends DefaultHandler{
	
	public void startDocument() throws SAXException {
		System.out.println("Document reading started");
	}
	
	public void endDocument() throws SAXException {
		System.out.println("Document reading ended");
	}
	
	public void startElement(String ns, String tn, String tln,Attributes atts) throws SAXException {
		System.out.println(tn+" Element is started");
		int no=atts.getLength();
		System.out.println("No. of attribute  for "+tn+" are "+no);
		for(int i=0;i<no;i++){
			System.out.println(atts.getLocalName(i)+"\t"+atts.getValue(i));
		}
	}

	public void endElement(String ns, String tn, String tln)
			throws SAXException {
	System.out.println(tn+" Element is ended");
	}

	public void characters(char[] ch, int start, int total)
			throws SAXException {
		String str=new String(ch, start, total);
		System.out.println(str);
	}
}
