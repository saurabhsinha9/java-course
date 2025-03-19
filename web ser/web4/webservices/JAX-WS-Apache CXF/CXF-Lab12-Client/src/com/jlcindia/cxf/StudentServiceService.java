
/*
 * 
 */

package com.jlcindia.cxf;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.12
 * Fri Jun 29 14:23:56 IST 2012
 * Generated source version: 2.2.12
 * 
 */


@WebServiceClient(name = "StudentServiceService", 
                  wsdlLocation = "http://localhost:5555/StudentServicePort?wsdl",
                  targetNamespace = "http://cxf.jlcindia.com/") 
public class StudentServiceService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://cxf.jlcindia.com/", "StudentServiceService");
    public final static QName StudentServicePort = new QName("http://cxf.jlcindia.com/", "StudentServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:5555/StudentServicePort?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:5555/StudentServicePort?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public StudentServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public StudentServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StudentServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return
     *     returns StudentService
     */
    @WebEndpoint(name = "StudentServicePort")
    public StudentService getStudentServicePort() {
        return super.getPort(StudentServicePort, StudentService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StudentService
     */
    @WebEndpoint(name = "StudentServicePort")
    public StudentService getStudentServicePort(WebServiceFeature... features) {
        return super.getPort(StudentServicePort, StudentService.class, features);
    }

}
