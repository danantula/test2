//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.14 at 10:55:58 AM BST 
//


package org.etsi.uri._02657.v1_1_1_.retaineddata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExemptionExpiry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExemptionExpiry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="expiryDate" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}GeneralizedTime"/>
 *         &lt;element name="indefinite" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExemptionExpiry", propOrder = {
    "expiryDate",
    "indefinite"
})
public class ExemptionExpiry {

    protected String expiryDate;
    protected NULL indefinite;

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the indefinite property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getIndefinite() {
        return indefinite;
    }

    /**
     * Sets the value of the indefinite property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setIndefinite(NULL value) {
        this.indefinite = value;
    }

}
