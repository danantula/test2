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
 * <p>Java class for RequiredByLegislation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequiredByLegislation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ripa" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredByLegislation", propOrder = {
    "ripa"
})
public class RequiredByLegislation {

    protected NULL ripa;

    /**
     * Gets the value of the ripa property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getRipa() {
        return ripa;
    }

    /**
     * Sets the value of the ripa property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setRipa(NULL value) {
        this.ripa = value;
    }

}