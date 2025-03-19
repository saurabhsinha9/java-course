package com.jlcindia.spring.mvc.mail.service;

import com.jlcindia.spring.mvc.model.Enquiry;

public class MailFormatter {
	public String getEnquiryMailMessage(Enquiry enq){
		String msg="<font color=blue size=15>";
		msg=msg+"Hi "+enq.getName()+"<br><br>";
		msg=msg+"Warm Greeting... from Java Learning Center"+"<br>";
		msg=msg+"we have your Course enquiry Information as follows"+"<br>";
		msg=msg+"Enquiry Id :"+enq.getEnquiryID()+"<br>";
		msg=msg+"Name :"+enq.getName()+"<br>";
		msg=msg+"Email :"+enq.getEmail()+"<br>";
		msg=msg+"Phone :"+enq.getPhone()+"<br>";
		msg=msg+"Suitable Timings :"+enq.getTimings()+"<br><br><br>";
		msg=msg+"You can revert us"+"<br>";
		msg=msg+"with the Enquiry Id :"+enq.getEnquiryID()+"<br>";
		msg=msg+"For any further queries"+"<br><br><br><br>";
		msg=msg+"Thanking you"+"<br>";
		msg=msg+"JLC Team</font>";
		return msg;
	}
}
