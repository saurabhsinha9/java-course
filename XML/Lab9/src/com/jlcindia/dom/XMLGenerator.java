package com.jlcindia.dom;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class XMLGenerator {
	
	static Document doc=null;
	public static void printToFile(String fname) {
		try {
			OutputFormat of=new OutputFormat(doc);
			of.setIndenting(true);
			FileOutputStream fos=new FileOutputStream(new File(fname));
			XMLSerializer xs=new XMLSerializer(fos, of);
			xs.serialize(doc);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void createXML(ArrayList<StudentTO> al) {
		try {
			XMLGenerator.createDoc();
			Element root=doc.createElement("sausoft");
			Iterator<StudentTO> it=al.iterator();
			while(it.hasNext()){
				StudentTO sto=it.next();
				Element stu=createStudent(sto);
				root.appendChild(stu);
			}
			doc.appendChild(root);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createDoc() {
		try {
			DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
			DocumentBuilder db=dbf.newDocumentBuilder();
			doc=db.newDocument();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static Element createStudent(StudentTO sto) {
		Element stu=doc.createElement("student");
		stu.setAttribute("sid", sto.getSid());
		Element sn=createNewElement("sname",sto.getSname());
		stu.appendChild(sn);
		Element em=createNewElement("email",sto.getEmail());
		stu.appendChild(em);
		Element ph=createNewElement("phone",sto.getPhone());
		stu.appendChild(ph);
		Element dob=createNewElement("dob",sto.getDob());
		stu.appendChild(dob);
		Element quali=createNewElement("quali",sto.getQuali());
		stu.appendChild(quali);
		return stu;
	}

	private static Element createNewElement(String ename, String text) {
		Element ele=doc.createElement(ename);
		Text txt=doc.createTextNode(text);
		ele.appendChild(txt);
		return ele;
	}

	

}
