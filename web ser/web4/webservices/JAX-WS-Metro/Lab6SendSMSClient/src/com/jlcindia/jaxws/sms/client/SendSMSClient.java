package com.jlcindia.jaxws.sms.client;

public class SendSMSClient {

	
	public static void main(String[] args) {
		SendSMS ss=new SendSMS();
		SendSMSSoap sss=ss.getSendSMSSoap();
		SMSResult sr=sss.sendSMSToIndia("9590032900", "saurabhsinha9@gmail.com", "Hi How are you");
		System.out.println(sr.toString());
	}

}
