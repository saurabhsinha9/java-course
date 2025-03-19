package com.jlcindia.dom;

import java.util.ArrayList;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;


public class StudentReader {
	
	static Document doc=null;
	public static ArrayList<StudentTO> getStudents(String fname) {
		doc=DOMUtil.parseXML(fname);
		Element rele=doc.getDocumentElement();
		System.out.println(rele);
		NodeList students=rele.getElementsByTagName("student");
		System.out.println(students);
		ArrayList<StudentTO> al=new ArrayList<StudentTO>();
		System.out.println(students.getLength());
		for(int i=0;i<students.getLength();i++){
			StudentTO sto=new StudentTO();
			Element stu=(Element) students.item(i);
			System.out.println(stu);
			NamedNodeMap map=stu.getAttributes();
			System.out.println(map);
			Attr attr=(Attr) map.item(i);
			System.out.println(attr);
			String sid=attr.getValue();
			String sname=DOMUtil.getTagData(stu,"sname");
			String email=DOMUtil.getTagData(stu,"email");
			String phone=DOMUtil.getTagData(stu,"phone");
			String dob=DOMUtil.getTagData(stu,"dob");
			String quali=DOMUtil.getTagData(stu,"quali");
			sto.setSid(sid);
			sto.setSname(sname);
			sto.setEmail(email);
			sto.setPhone(phone);
			sto.setDob(dob);
			sto.setQuali(quali);
			al.add(sto);
		}
		return al;
	}

}
