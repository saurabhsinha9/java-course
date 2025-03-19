package com.techno.techunt.iq.actions;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;
import org.springframework.beans.factory.annotation.Autowired;

import com.techno.techunt.iq.service.CompanyService;
import com.techno.techunt.iq.service.PostQuestichenService;
import com.techno.techunt.iq.service.QuestionService;
import com.techno.techunt.iq.service.TopicService;

public class PostQuestionAction extends Action{
	
	@Autowired
	 PostQuestichenService postQuestionService;
	
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		TimeZone zone=TimeZone.getTimeZone("Asia/Calcutta");
		Calendar cal=Calendar.getInstance(zone,new Locale("en","IN"));
		DynaValidatorForm dvf=(DynaValidatorForm) form;
		String compname=dvf.get("compname").toString();
		String topicid=dvf.get("topicid").toString();
		String questichen=dvf.get("question").toString();
		String page="";
		boolean flag=false;
		
		 flag=postQuestionService.savePostQuestichen();
		if(flag){
			page="success";
		}else{
			page="invalid";
		}
	
		return mapping.findForward(page);
		
		
	}

}
