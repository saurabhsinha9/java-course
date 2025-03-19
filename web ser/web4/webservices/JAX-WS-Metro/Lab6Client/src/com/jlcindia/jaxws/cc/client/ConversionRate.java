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
 *         &lt;element name=&quot;FromCurrency&quot; type=&quot;{http://www.webserviceX.NET/}Currency&quot;/&gt;
 *         &lt;element name=&quot;ToCurrency&quot; type=&quot;{http://www.webserviceX.NET/}Currency&quot;/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "fromCurrency", "toCurrency" })
@XmlRootElement(name = "ConversionRate")
public class ConversionRate {

	@XmlElement(name = "FromCurrency", required = true)
	protected Currency fromCurrency;
	@XmlElement(name = "ToCurrency", required = true)
	protected Currency toCurrency;

	/**
	 * Gets the value of the fromCurrency property.
	 * 
	 * @return possible object is {@link Currency }
	 * 
	 */
	public Currency getFromCurrency() {
		return fromCurrency;
	}

	/**
	 * Sets the value of the fromCurrency property.
	 * 
	 * @param value
	 *            allowed object is {@link Currency }
	 * 
	 */
	public void setFromCurrency(Currency value) {
		this.fromCurrency = value;
	}

	/**
	 * Gets the value of the toCurrency property.
	 * 
	 * @return possible object is {@link Currency }
	 * 
	 */
	public Currency getToCurrency() {
		return toCurrency;
	}

	/**
	 * Sets the value of the toCurrency property.
	 * 
	 * @param value
	 *            allowed object is {@link Currency }
	 * 
	 */
	public void setToCurrency(Currency value) {
		this.toCurrency = value;
	}

}
