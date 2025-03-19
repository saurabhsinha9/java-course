package com.jlcindia.dom;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMUtil {

	public static Document parseXML(String fname) {
		Document doc=null;
		try {
			DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
			DocumentBuilder db=dbf.newDocumentBuilder();
			doc=db.parse(fname);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doc;
	}

	public static String getTagData(Element stu, String tname) {
		System.out.println(stu+"\t***"+tname);
		NodeList eles=stu.getElementsByTagName(tname);
		System.out.println(eles);
		Element e=(Element) eles.item(0);
		System.out.println("*"+e);
		String data=DOMUtil.getData(e);
		System.out.println(data);
		return data;
	}

	private static String getData(Element ele) {
		Node node=ele.getFirstChild();
		String data=null;
		if(node instanceof CharacterData){
			CharacterData cd=(CharacterData) node;
			data=cd.getData();
		}
		return data;
	}

}
