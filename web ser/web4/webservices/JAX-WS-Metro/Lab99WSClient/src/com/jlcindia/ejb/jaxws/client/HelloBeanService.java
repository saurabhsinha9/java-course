package com.jlcindia.ejb.jaxws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
 * HelloBeanService service = new HelloBeanService();
 * HelloBean portType = service.getHelloBeanPort();
 * portType.getMessage(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "HelloBeanService", targetNamespace = "http://ejb3.jlcindia.com/", wsdlLocation = "http://127.0.0.1:7777/Lab99/HelloBean?wsdl")
public class HelloBeanService extends Service {

	private final static URL HELLOBEANSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(com.jlcindia.ejb.jaxws.client.HelloBeanService.class
					.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.jlcindia.ejb.jaxws.client.HelloBeanService.class
					.getResource(".");
			url = new URL(baseUrl, "http://127.0.0.1:7777/Lab99/HelloBean?wsdl");
		} catch (MalformedURLException e) {
			logger
					.warning("Failed to create URL for the wsdl Location: 'http://127.0.0.1:7777/Lab99/HelloBean?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		HELLOBEANSERVICE_WSDL_LOCATION = url;
	}

	public HelloBeanService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public HelloBeanService() {
		super(HELLOBEANSERVICE_WSDL_LOCATION, new QName(
				"http://ejb3.jlcindia.com/", "HelloBeanService"));
	}

	/**
	 * 
	 * @return returns HelloBean
	 */
	@WebEndpoint(name = "HelloBeanPort")
	public HelloBean getHelloBeanPort() {
		return super.getPort(new QName("http://ejb3.jlcindia.com/",
				"HelloBeanPort"), HelloBean.class);
	}

}
