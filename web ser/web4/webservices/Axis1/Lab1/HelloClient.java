package com.jlcindia.axis;

import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.encoding.XMLType;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class HelloClient {
	public static void main(String[] args) {
		try {
			String endpoint="http://localhost:9999/axis/services/urn:HelloService";
			String name="Saurabh";
			long d=95657986;
			Long phone=new Long(d);
			Service service=new Service();
			Call call=(Call)service.createCall();
			call.setTargetEndpointAddress(new java.net.URL(endpoint));
			call.setOperationName("getMessage");
			call.addParameter("name",XMLType.XSD_STRING,ParameterMode.IN);
			call.addParameter("phone", XMLType.XSD_LONG, ParameterMode.IN);
			call.setReturnType(XMLType.XSD_STRING);
			String val=(String)call.invoke(new Object[]{name,phone});
			System.out.println(val);
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}

}
