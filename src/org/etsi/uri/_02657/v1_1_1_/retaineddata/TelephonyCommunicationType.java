//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.14 at 10:55:58 AM BST 
//


package org.etsi.uri._02657.v1_1_1_.retaineddata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephonyCommunicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelephonyCommunicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="telephonyFixedCS" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="telephonyWirelessCS" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="sMS" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element ref="{http://uri.etsi.org/02657/v1.3.1#1/RetainedData}mMS"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephonyCommunicationType", propOrder = {
    "telephonyFixedCS",
    "telephonyWirelessCS",
    "sms",
    "mms"
})
public class TelephonyCommunicationType {

    protected NULL telephonyFixedCS;
    protected NULL telephonyWirelessCS;
    @XmlElement(name = "sMS")
    protected NULL sms;
    @XmlElement(name = "mMS", namespace = "http://uri.etsi.org/02657/v1.3.1#1/RetainedData")
    protected NULL mms;

    /**
     * Gets the value of the telephonyFixedCS property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getTelephonyFixedCS() {
        return telephonyFixedCS;
    }

    /**
     * Sets the value of the telephonyFixedCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setTelephonyFixedCS(NULL value) {
        this.telephonyFixedCS = value;
    }

    /**
     * Gets the value of the telephonyWirelessCS property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getTelephonyWirelessCS() {
        return telephonyWirelessCS;
    }

    /**
     * Sets the value of the telephonyWirelessCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setTelephonyWirelessCS(NULL value) {
        this.telephonyWirelessCS = value;
    }

    /**
     * Gets the value of the sms property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getSMS() {
        return sms;
    }

    /**
     * Sets the value of the sms property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setSMS(NULL value) {
        this.sms = value;
    }

    /**
     * Gets the value of the mms property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getMMS() {
        return mms;
    }

    /**
     * Sets the value of the mms property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setMMS(NULL value) {
        this.mms = value;
    }

}
