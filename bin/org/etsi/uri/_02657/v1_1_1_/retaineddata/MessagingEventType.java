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
 * <p>Java class for MessagingEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessagingEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="mSOriginatingSMSinMSC" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="mSTerminatingSMSinMSC" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="shortMessageDelivery" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="mMMessage" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="mMNotification" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="mMDeliveryReport" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="mMReadReply" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessagingEventType", propOrder = {
    "msOriginatingSMSinMSC",
    "msTerminatingSMSinMSC",
    "shortMessageDelivery",
    "mmMessage",
    "mmNotification",
    "mmDeliveryReport",
    "mmReadReply"
})
public class MessagingEventType {

    @XmlElement(name = "mSOriginatingSMSinMSC")
    protected NULL msOriginatingSMSinMSC;
    @XmlElement(name = "mSTerminatingSMSinMSC")
    protected NULL msTerminatingSMSinMSC;
    protected NULL shortMessageDelivery;
    @XmlElement(name = "mMMessage")
    protected NULL mmMessage;
    @XmlElement(name = "mMNotification")
    protected NULL mmNotification;
    @XmlElement(name = "mMDeliveryReport")
    protected NULL mmDeliveryReport;
    @XmlElement(name = "mMReadReply")
    protected NULL mmReadReply;

    /**
     * Gets the value of the msOriginatingSMSinMSC property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getMSOriginatingSMSinMSC() {
        return msOriginatingSMSinMSC;
    }

    /**
     * Sets the value of the msOriginatingSMSinMSC property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setMSOriginatingSMSinMSC(NULL value) {
        this.msOriginatingSMSinMSC = value;
    }

    /**
     * Gets the value of the msTerminatingSMSinMSC property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getMSTerminatingSMSinMSC() {
        return msTerminatingSMSinMSC;
    }

    /**
     * Sets the value of the msTerminatingSMSinMSC property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setMSTerminatingSMSinMSC(NULL value) {
        this.msTerminatingSMSinMSC = value;
    }

    /**
     * Gets the value of the shortMessageDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getShortMessageDelivery() {
        return shortMessageDelivery;
    }

    /**
     * Sets the value of the shortMessageDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setShortMessageDelivery(NULL value) {
        this.shortMessageDelivery = value;
    }

    /**
     * Gets the value of the mmMessage property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getMMMessage() {
        return mmMessage;
    }

    /**
     * Sets the value of the mmMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setMMMessage(NULL value) {
        this.mmMessage = value;
    }

    /**
     * Gets the value of the mmNotification property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getMMNotification() {
        return mmNotification;
    }

    /**
     * Sets the value of the mmNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setMMNotification(NULL value) {
        this.mmNotification = value;
    }

    /**
     * Gets the value of the mmDeliveryReport property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getMMDeliveryReport() {
        return mmDeliveryReport;
    }

    /**
     * Sets the value of the mmDeliveryReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setMMDeliveryReport(NULL value) {
        this.mmDeliveryReport = value;
    }

    /**
     * Gets the value of the mmReadReply property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getMMReadReply() {
        return mmReadReply;
    }

    /**
     * Sets the value of the mmReadReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setMMReadReply(NULL value) {
        this.mmReadReply = value;
    }

}
