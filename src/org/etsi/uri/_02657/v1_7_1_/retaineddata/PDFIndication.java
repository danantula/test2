//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.14 at 10:55:58 AM BST 
//


package org.etsi.uri._02657.v1_7_1_.retaineddata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.etsi.uri._02657.v1_1_1_.retaineddata.NULL;


/**
 * <p>Java class for PDFIndication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDFIndication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="doNotCreate" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="required" type="{http://uri.etsi.org/02657/v1.7.1#/RetainedData}PDFCreationDetails"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDFIndication", propOrder = {
    "doNotCreate",
    "required"
})
public class PDFIndication {

    protected NULL doNotCreate;
    protected PDFCreationDetails required;

    /**
     * Gets the value of the doNotCreate property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getDoNotCreate() {
        return doNotCreate;
    }

    /**
     * Sets the value of the doNotCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setDoNotCreate(NULL value) {
        this.doNotCreate = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link PDFCreationDetails }
     *     
     */
    public PDFCreationDetails getRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFCreationDetails }
     *     
     */
    public void setRequired(PDFCreationDetails value) {
        this.required = value;
    }

}