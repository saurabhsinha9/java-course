package com.techno.techunt.iq.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;
import org.springframework.beans.factory.annotation.Autowired;

import com.techno.techunt.iq.service.BranchService;
import com.techno.techunt.iq.service.TopicService;

public class AddTopicAction extends Action{
	@Autowired
    TopicService topicService;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
	
		DynaValidatorForm dvf=(DynaValidatorForm) form;
		String page="";
		boolean flag=false;
		String topicname=dvf.get("topicname").toString();
		 flag=topicService.addTopic(topicname);
		if(flag){
			page="success";
		}else{
			page="invalid";
		}
	
		return mapping.findForward(page);
	}

}
