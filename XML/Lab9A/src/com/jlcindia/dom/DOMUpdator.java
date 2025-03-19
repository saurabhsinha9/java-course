package com.jlcindia.dom;

import java.io.File;
import java.io.FileOutputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMUpdator {

	public static void main(String[] args) {
		
		try {
			DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
			DocumentBuilder db=dbf.newDocumentBuilder();
			Document doc=db.parse("jlc.xml");
			boolean flag=false;
			NodeList stunl=doc.getElementsByTagName("student");
			for(int i=0;i<stunl.getLength();i++){
				Element stud=(Element) stunl.item(i);
				String id=stud.getAttribute("sid");
				if(id.equals("99")){
					flag=true;
					NodeList nl=stud.getChildNodes();
					for(int j=0;j<nl.getLength();j++){
						Node node=nl.item(j);
						String nm=node.getNodeName();
						if(nm.equals("email"));
						Element elem=(Element) node;
						CharacterData cd=(CharacterData) elem.getFirstChild();
						cd.setData("dablu@jlc.com");
					}
				}
			}
			if(flag){
				OutputFormat of=new OutputFormat(doc);
				of.setIndenting(true);
				FileOutputStream fos=new FileOutputStream(new File("jlc1.xml"));
				XMLSerializer xs=new XMLSerializer(fos, of);
				xs.serialize(doc);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
