package org.jlcindia.axis.client;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;

public class StudentClient2 {
	public static void main(String[] args) {
		try{
		String endpoint="http://localhost:7777/Jlc/services/urn:StudentService";
		Service service=new Service();
		Call call=(Call)service.createCall();
		call.setTargetEndpointAddress(new java.net.URL(endpoint));
		call.setOperationName("getStudent");
	
		QName qn=new QName("urn:Student","student");
		BeanSerializerFactory bsf=new BeanSerializerFactory(Student.class,qn);
		BeanDeserializerFactory bdf=new BeanDeserializerFactory(Student.class,qn);
		call.registerTypeMapping(Student.class, qn, bsf, bdf);
		
		call.addParameter("sid",XMLType.XSD_STRING,ParameterMode.IN);
		call.setReturnType(qn);
		Object obj=call.invoke(new Object[]{"JLC-99"});
		Student s1=(Student) obj;
		System.out.println(s1);
		
		
		Student s2=(Student)call.invoke(new Object[]{"JLC-88"});
		System.out.println(s2);
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
