package com.techno.techunt.iq.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;
import org.springframework.beans.factory.annotation.Autowired;

import com.techno.techunt.iq.actions.to.UserTO;
import com.techno.techunt.iq.service.UserService;

public class RegisterAction extends Action {
 
 @Autowired
 private UserService userService;
public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	 String page="success";
	 DynaValidatorForm dvf=(DynaValidatorForm) form;
	 String unm=dvf.get("username").toString();
	 String pwd=dvf.get("password").toString();
	 String stname=dvf.get("studname").toString();
	 String stemail=dvf.get("studemail").toString();
	 String stphone=dvf.get("studphone").toString();
	 String brname=dvf.get("branchname").toString();
	 String batchid=dvf.get("batchid").toString();
	 String studid=dvf.get("studid").toString();
	 
	 
	 UserTO uto=new UserTO(brname, batchid, studid, stname, stemail, new Long(stphone), unm, pwd, "New","Student",0);
	 request.setAttribute("UTO", uto);
	 if(userService.registerUser(uto)){
		 page="success";
	 }else{
		 page="invalid";
	 }
	 
	 return mapping.findForward(page);
}
}
