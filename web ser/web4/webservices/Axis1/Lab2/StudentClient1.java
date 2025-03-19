package org.jlcindia.axis;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.encoding.XMLType;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;

public class StudentClient1 {
	public static void main(String[] args) {
		try{
		String endpoint="http://localhost:9999/axis/services/urn:StudentService";
		Service service=new Service();
		Call call=(Call)service.createCall();
		call.setTargetEndpointAddress(new java.net.URL(endpoint));
		call.setOperationName("addStudent");
		Student stu=new Student();
		stu.setSid("JLC-99");
		stu.setFname("Saurabh");
		stu.setLname("Sinha");
		stu.setEmail("saurabh@jlc");
		QName qn=new QName("urn:Student","student");
		BeanSerializerFactory bsf=new BeanSerializerFactory(Student.class,qn);
		BeanDeserializerFactory bdf=new BeanDeserializerFactory(Student.class,qn);
		call.registerTypeMapping(Student.class, qn, bsf, bdf);
		call.setReturnType(XMLType.XSD_STRING);
		call.addParameter("student",qn,ParameterMode.IN);
		String s=(String)call.invoke(new Object[]{stu});
		System.out.println(s);
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
