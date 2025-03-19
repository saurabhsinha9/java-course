package com.jlcindia.jaxws.sms.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *       &lt;sequence&gt;
 *         &lt;element name=&quot;SendSMSToIndiaResult&quot; type=&quot;{http://www.webserviceX.NET}SMSResult&quot; minOccurs=&quot;0&quot;/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "sendSMSToIndiaResult" })
@XmlRootElement(name = "SendSMSToIndiaResponse")
public class SendSMSToIndiaResponse {

	@XmlElement(name = "SendSMSToIndiaResult")
	protected SMSResult sendSMSToIndiaResult;

	/**
	 * Gets the value of the sendSMSToIndiaResult property.
	 * 
	 * @return possible object is {@link SMSResult }
	 * 
	 */
	public SMSResult getSendSMSToIndiaResult() {
		return sendSMSToIndiaResult;
	}

	/**
	 * Sets the value of the sendSMSToIndiaResult property.
	 * 
	 * @param value
	 *            allowed object is {@link SMSResult }
	 * 
	 */
	public void setSendSMSToIndiaResult(SMSResult value) {
		this.sendSMSToIndiaResult = value;
	}

}
