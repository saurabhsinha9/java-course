package com.jlcindia.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for courseTO complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name=&quot;courseTO&quot;&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *       &lt;sequence&gt;
 *         &lt;element name=&quot;cid&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}int&quot;/&gt;
 *         &lt;element name=&quot;cname&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;element name=&quot;cost&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}double&quot;/&gt;
 *         &lt;element name=&quot;faculty&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; minOccurs=&quot;0&quot;/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "courseTO", propOrder = { "cid", "cname", "cost", "faculty" })
public class CourseTO {

	protected int cid;
	protected String cname;
	protected double cost;
	protected String faculty;

	/**
	 * Gets the value of the cid property.
	 * 
	 */
	public int getCid() {
		return cid;
	}

	/**
	 * Sets the value of the cid property.
	 * 
	 */
	public void setCid(int value) {
		this.cid = value;
	}

	/**
	 * Gets the value of the cname property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCname() {
		return cname;
	}

	/**
	 * Sets the value of the cname property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCname(String value) {
		this.cname = value;
	}

	/**
	 * Gets the value of the cost property.
	 * 
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * Sets the value of the cost property.
	 * 
	 */
	public void setCost(double value) {
		this.cost = value;
	}

	/**
	 * Gets the value of the faculty property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFaculty() {
		return faculty;
	}

	/**
	 * Sets the value of the faculty property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFaculty(String value) {
		this.faculty = value;
	}

}
