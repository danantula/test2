//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-793 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.18 at 03:38:40 PM GMT 
//


package com.ctg.dms.customerprofile.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}ERROR_CODE" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}ERROR_DESCRIPTION" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}STATUS_CODE"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "STATUS")
public class STATUS {

    @XmlElement(name = "ERROR_CODE")
    protected String errorCODE;
    @XmlElement(name = "ERROR_DESCRIPTION")
    protected String errorDESCRIPTION;
    @XmlElement(name = "STATUS_CODE")
    protected int statusCODE;

    /**
     * Gets the value of the error_CODE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERROR_CODE() {
        return errorCODE;
    }

    /**
     * Sets the value of the error_CODE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERROR_CODE(String value) {
        this.errorCODE = value;
    }

    /**
     * Gets the value of the error_DESCRIPTION property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERROR_DESCRIPTION() {
        return errorDESCRIPTION;
    }

    /**
     * Sets the value of the error_DESCRIPTION property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERROR_DESCRIPTION(String value) {
        this.errorDESCRIPTION = value;
    }

    /**
     * Gets the value of the status_CODE property.
     * 
     */
    public int getSTATUS_CODE() {
        return statusCODE;
    }

    /**
     * Sets the value of the status_CODE property.
     * 
     */
    public void setSTATUS_CODE(int value) {
        this.statusCODE = value;
    }

	public String getErrorCODE() {
		return errorCODE;
	}

	public void setErrorCODE(String errorCODE) {
		this.errorCODE = errorCODE;
	}

	public String getErrorDESCRIPTION() {
		return errorDESCRIPTION;
	}

	public void setErrorDESCRIPTION(String errorDESCRIPTION) {
		this.errorDESCRIPTION = errorDESCRIPTION;
	}

	public int getStatusCODE() {
		return statusCODE;
	}

	public void setStatusCODE(int statusCODE) {
		this.statusCODE = statusCODE;
	}

}