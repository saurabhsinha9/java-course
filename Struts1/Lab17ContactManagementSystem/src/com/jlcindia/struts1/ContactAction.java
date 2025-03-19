package com.jlcindia.struts1;

import javax.servlet.http.*;
import org.apache.struts.*;
import org.apache.struts.action.*;

import java.util.List;

public class ContactAction extends JLCBaseDispatchAction {

	int tor=5;
	int start=0;
	int tnor=0;
	int end=0;

//====================================AddContact=====================================
	
	public ActionForward addContact(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{
		
	    System.out.println("addContact()-ContactAction");	
		ContactForm cf=(ContactForm)af;
		ContactTO cto=new ContactTO(cf.getFname(),cf.getLname(),cf.getEmail(),cf.getPhone(),"Enabled");
		int x=contactService.addContact(cto);
		System.out.println(x);
		return am.findForward("addcontactstatus");
			
	}

//==================================SearchContact====================================
	
	public ActionForward searchContact(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{

		System.out.println("searchContact()-ContactAction");	
		req.getSession().removeAttribute("EDIT");
		ContactForm cf=(ContactForm)af;
		ContactTO cto=contactService.getContactByEmail(cf.getEmail());
		if(cto==null){
			req.setAttribute("NOT_FOUND","No Record Found with email "+cf.getEmail());
			return am.findForward("notfound");
			
		}else {
			cf.setContactId(cto.getContactId());
			cf.setFname(cto.getFname());
			cf.setLname(cto.getLname());
			cf.setPhone(cto.getPhone());
			cf.setStatus(cto.getStatus());
			
		}
		return am.findForward("updatecontact");

		}

//=================================UpdateContact=====================================
	
	public ActionForward updateContact(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{

		System.out.println("updateContact()-ContactAction");	
		req.getSession().removeAttribute("CID");
		ContactForm cf=(ContactForm)af;
		System.out.println(cf.getContactId());
		System.out.println(cf.getFname());
		System.out.println(cf.getLname());
		System.out.println(cf.getEmail());
		System.out.println(cf.getPhone());
		System.out.println(cf.getStatus());

		ContactTO cto=new ContactTO(cf.getContactId(),cf.getFname(),cf.getLname(),cf.getEmail(),cf.getPhone(),cf.getStatus());
		int x=contactService.updateContact(cto);
		System.out.println(x);
		HttpSession session=req.getSession();		
		Object obj=session.getAttribute("EDIT");
		if(obj!=null){
			session.setAttribute("EDIT","FALSE");
			List<ContactTO>clist=contactService.getAllContacts(start,tor);
			session.setAttribute("CLIST",clist);
			setNextPrevious(req);
			return am.findForward("showallcontactshome");
		}else{
			
			return am.findForward("updatecontactstatus");
		}
	}		
		
//==============================ShowAllContacts======================================
	
	public ActionForward showAllContacts(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{

		req.getSession().removeAttribute("CID");
		req.getSession().setAttribute("EDIT","FALSE");
		start=0;
		System.out.println("showAllContacts()-ContactAction");	
		tnor=contactService.getTotalNumberOfRecords();		
		List<ContactTO>clist=contactService.getAllContacts(start,tor);
			if(tnor<1){
				req.setAttribute("NOT_FOUND","No record Available");
				
			}else {
				end=tnor;
				if(end>tnor)
				end=tnor;
				HttpSession session=req.getSession();
				session.setAttribute("CLIST",clist);
				session.setAttribute("EDIT","FALSE");
				session.setAttribute("BEGIN",start+1);
				session.setAttribute("END",end);
				session.setAttribute("TNOR",tnor);
				
				if(tnor>end){
					req.setAttribute("SHOW_NEXT", "OK");
				}
			}
			return am.findForward("showallcontactshome"); 	
	}
			
//==============================ShowNextContacts=====================================
	
	public ActionForward showNextContacts(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{
		
		req.getSession().removeAttribute("CID");
		req.getSession().setAttribute("EDIT","FALSE");
		System.out.println("showNextContacts()-ContactAction");
		HttpSession session=req.getSession();
		Integer i1=(Integer)session.getAttribute("END");
		start=i1.intValue();
		tnor=contactService.getTotalNumberOfRecords();		

		List<ContactTO>clist=contactService.getAllContacts(start,tor);
		if(tnor<1){
			req.setAttribute("NOT_FOUND","No record Available");
			
		}else {
			end=start+tnor;
			if(end>tnor){
			end=tnor;
			}
			session.setAttribute("CLIST",clist);
			session.setAttribute("BEGIN",start+1);
			session.setAttribute("TNOR",tnor);
			session.setAttribute("END",end);
			setNextPrevious(req);
		}
		return am.findForward("showallcontactshome"); 	
}
		
//==============================ShowPreviousContacts=================================
	
	public ActionForward showPreviousContacts(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{
		
		req.getSession().removeAttribute("CID");
		req.getSession().setAttribute("EDIT","FALSE");
		System.out.println("showPreviousContacts()-ContactAction");
		HttpSession session=req.getSession();
		Integer i1=(Integer)session.getAttribute("BEGIN");
		start=i1.intValue()-tor-1;
		tnor=contactService.getTotalNumberOfRecords();		

		List<ContactTO>clist=contactService.getAllContacts(start,tor);
		if(tnor<1){
			req.setAttribute("NOT_FOUND","No record Available");
			
		}else {
			end=start+tnor;
			if(end>tnor){
			end=tnor;
			}
			session.setAttribute("CLIST",clist);
			session.setAttribute("BEGIN",start+1);
			session.setAttribute("TNOR",tnor);
			session.setAttribute("END",end);
			setNextPrevious(req);
		}
		return am.findForward("showallcontactshome"); 	
}

//===================================================================================
	
	public ActionForward editContact(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{

		System.out.println("editContact()-ContactAction");
		DynaActionForm daf=(DynaActionForm)af;
		String cid=daf.get("cid").toString();
		HttpSession session=req.getSession();
		session.setAttribute("EDIT","TRUE");
		session.setAttribute("CID","cid");
		setNextPrevious(req);
		return am.findForward("showallcontactshome"); 	
	}

//==============================DeleteContacts=======================================
	
	public ActionForward deleteContact(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{

		System.out.println("deleteContact()-ContactAction");
		req.getSession().removeAttribute("CID");
		req.getSession().setAttribute("EDIT","FALSE");

		DynaActionForm daf=(DynaActionForm)af;
		String cid=daf.get("cid").toString();
		int x=contactService.deleteContact(cid);
		System.out.println(x);
		if(x>0){
			req.setAttribute("DELETED","Record deleted Sucessfully");
			}
		
		tnor=contactService.getTotalNumberOfRecords();
		if(tnor<1){
			req.setAttribute("NOT_FOUND","No Record Available");
		}else{
			Integer i1=(Integer)req.getSession().getAttribute("BEGIN");
			start=i1.intValue();
			if(tnor<start){
				start=start-tor;
			}
			end=start+tor-1;
			if(end>tor){
				end=tnor;
			}
			List<ContactTO> clist=contactService.getAllContacts(start-1,tor);
			req.getSession().setAttribute("CLIST",clist);
			req.getSession().setAttribute("BEGIN",start);
			req.getSession().setAttribute("END",end);
			req.getSession().setAttribute("TNOR",tnor);
			setNextPrevious(req);
		}
		return am.findForward("showallcontactshome");
		}

	private void setNextPrevious(HttpServletRequest req){
		if(start+1>5){
			req.setAttribute("SHOW_PREVIOUS", "OK");
		}
		if(end<tnor){
			req.setAttribute("SHOW_NEXT", "OK");

		}
	}
	
}