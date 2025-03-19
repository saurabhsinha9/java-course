package com.jlcindia.axis2.hello;

import com.jlcindia.axis2.hello.HelloStub.GetMessage;
import com.jlcindia.axis2.hello.HelloStub.GetMessageResponse;

public class HelloClient {

	public static void main(String[] args) {
		try {
			HelloStub stub=new HelloStub();
			GetMessage gm=new GetMessage();
			gm.setName("Saurabh");
			GetMessageResponse gmr=stub.getMessage(gm);
			String msg=gmr.get_return();
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
