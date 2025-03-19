package com.jlcindia.dom;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Attr;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMParser {

	public static void main(String[] args) {
		try {
			DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
			DocumentBuilder db=dbf.newDocumentBuilder();
			Document doc=db.parse("src/customers.xml");
			//Dispaly emails
			NodeList emnl=doc.getElementsByTagName("email");
			System.out.println(emnl.getLength());
			for(int i=0;i<emnl.getLength();i++){
				Node n=emnl.item(i);
				Element emailEle=(Element) n;
				Node nn=(Node) emailEle.getFirstChild();
				CharacterData cd=(CharacterData) nn;
				String emailId=cd.getData();
				System.out.println(emailId);
			}
			//Display cid and city
			NodeList custnl=doc.getElementsByTagName("customer");
			System.out.println(custnl.getLength());
			for(int i=0;i<custnl.getLength();i++){
				Element custEle=(Element) custnl.item(i);
				String cid=custEle.getAttribute("cid");
				String city=custEle.getAttribute("city");
				System.out.println(cid+"\t"+city);
			}
			
			//Display cid and city
			NodeList cnl=doc.getElementsByTagName("customer");
			System.out.println(cnl.getLength());
			for(int i=0;i<cnl.getLength();i++){
				Element custEle=(Element) cnl.item(i);
				NamedNodeMap nnp=custEle.getAttributes();
				for(int j=0;j<nnp.getLength();i++){
					Attr attr=(Attr) nnp.item(j);
					System.out.println(attr.getName()+"\t"+attr.getValue());
				}
				String cid=custEle.getAttribute("cid");
				String city=custEle.getAttribute("city");
				System.out.println(cid+"\t"+city);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
