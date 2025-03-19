
package com.jlcindia.cxf;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.2.12
 * Fri Jun 29 13:35:58 IST 2012
 * Generated source version: 2.2.12
 * 
 */
 
public class Hello_PortTypeServer{

    protected Hello_PortTypeServer() throws Exception {
        System.out.println("Starting Server");
        Object implementor = new com.jlcindia.cxf.Hello();
        String address = "http://localhost:5555/HelloPort";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws Exception { 
        new Hello_PortTypeServer();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
 
 