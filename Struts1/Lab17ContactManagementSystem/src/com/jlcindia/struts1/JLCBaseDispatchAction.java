package com.jlcindia.struts1;

import org.apache.struts.actions.DispatchAction;

public class JLCBaseDispatchAction extends DispatchAction {

	static ContactService contactService;
	static{
		contactService = new ContactServiceImpl();
	}
	
}
