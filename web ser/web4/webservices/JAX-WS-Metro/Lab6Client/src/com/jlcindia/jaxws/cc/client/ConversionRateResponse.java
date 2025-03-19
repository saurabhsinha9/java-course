package com.jlcindia.jaxws.cc.client;

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
 *         &lt;element name=&quot;ConversionRateResult&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}double&quot;/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "conversionRateResult" })
@XmlRootElement(name = "ConversionRateResponse")
public class ConversionRateResponse {

	@XmlElement(name = "ConversionRateResult")
	protected double conversionRateResult;

	/**
	 * Gets the value of the conversionRateResult property.
	 * 
	 */
	public double getConversionRateResult() {
		return conversionRateResult;
	}

	/**
	 * Sets the value of the conversionRateResult property.
	 * 
	 */
	public void setConversionRateResult(double value) {
		this.conversionRateResult = value;
	}

}
