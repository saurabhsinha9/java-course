
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.jlcindia.cxf;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.12
 * Fri Jun 29 14:23:56 IST 2012
 * Generated source version: 2.2.12
 * 
 */

@javax.jws.WebService(
                      serviceName = "StudentServiceService",
                      portName = "StudentServicePort",
                      targetNamespace = "http://cxf.jlcindia.com/",
                      wsdlLocation = "http://localhost:5555/StudentServicePort?wsdl",
                      endpointInterface = "com.jlcindia.cxf.StudentService")
                      
public class StudentServiceImpl implements StudentService {

    private static final Logger LOG = Logger.getLogger(StudentServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.jlcindia.cxf.StudentService#getStudent(java.lang.String  arg0 )*
     */
    public com.jlcindia.cxf.Student getStudent(java.lang.String arg0) { 
        LOG.info("Executing operation getStudent");
        System.out.println(arg0);
        try {
            com.jlcindia.cxf.Student _return = new com.jlcindia.cxf.Student();
            _return.setEmail("Email756027669");
            _return.setFname("Fname-747465475");
            _return.setLname("Lname1263390808");
            _return.setSid("Sid832856406");
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.jlcindia.cxf.StudentService#addStudent(com.jlcindia.cxf.Student  arg0 )*
     */
    public void addStudent(com.jlcindia.cxf.Student arg0) { 
        LOG.info("Executing operation addStudent");
        System.out.println(arg0);
        try {
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
