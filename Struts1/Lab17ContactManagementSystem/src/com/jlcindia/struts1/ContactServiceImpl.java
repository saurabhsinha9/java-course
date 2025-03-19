package com.jlcindia.struts1;

import java.util.List;
public class ContactServiceImpl implements ContactService {

	public int addContact(ContactTO cto){
		return DAOFactory.getContactDAO().addContact(cto);
	}
	

	public int updateContact(ContactTO cto){
		return DAOFactory.getContactDAO().updateContact(cto);
	}
	

	public ContactTO getContactByEmail(String email){
		return DAOFactory.getContactDAO().getContactByEmail(email);
	}
	

	public List<ContactTO>getAllContacts(int start,int total){
		return DAOFactory.getContactDAO().getAllContacts(start,total);
	}
	

	public int getTotalNumberOfRecords(){
		return DAOFactory.getContactDAO().getTotalNumberOfRecords();
	}
	

	public int deleteContact(String cid){
		return DAOFactory.getContactDAO().deleteContact(cid);
	}
	
}
