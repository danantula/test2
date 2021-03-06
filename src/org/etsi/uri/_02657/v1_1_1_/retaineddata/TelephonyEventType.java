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

import org.etsi.uri._02657.v1_3_1_1.retaineddata.NationalTelephonyEventType;


/**
 * <p>Java class for TelephonyEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelephonyEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="basicEventType" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}BasicEventType"/>
 *         &lt;element name="callConferenceEventType" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}CallConferenceEventType"/>
 *         &lt;element name="callForwardingEventType" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}CallForwardingEventType"/>
 *         &lt;element name="messagingEventType" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}MessagingEventType"/>
 *         &lt;element name="prepayServiceEventType" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}PrepayServiceEventType"/>
 *         &lt;element ref="{http://uri.etsi.org/02657/v1.3.1#1/RetainedData}nationalTelephonyEventType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephonyEventType", propOrder = {
    "basicEventType",
    "callConferenceEventType",
    "callForwardingEventType",
    "messagingEventType",
    "prepayServiceEventType",
    "nationalTelephonyEventType"
})
public class TelephonyEventType {

    protected BasicEventType basicEventType;
    protected CallConferenceEventType callConferenceEventType;
    protected CallForwardingEventType callForwardingEventType;
    protected MessagingEventType messagingEventType;
    protected PrepayServiceEventType prepayServiceEventType;
    @XmlElement(namespace = "http://uri.etsi.org/02657/v1.3.1#1/RetainedData")
    protected NationalTelephonyEventType nationalTelephonyEventType;

    /**
     * Gets the value of the basicEventType property.
     * 
     * @return
     *     possible object is
     *     {@link BasicEventType }
     *     
     */
    public BasicEventType getBasicEventType() {
        return basicEventType;
    }

    /**
     * Sets the value of the basicEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicEventType }
     *     
     */
    public void setBasicEventType(BasicEventType value) {
        this.basicEventType = value;
    }

    /**
     * Gets the value of the callConferenceEventType property.
     * 
     * @return
     *     possible object is
     *     {@link CallConferenceEventType }
     *     
     */
    public CallConferenceEventType getCallConferenceEventType() {
        return callConferenceEventType;
    }

    /**
     * Sets the value of the callConferenceEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallConferenceEventType }
     *     
     */
    public void setCallConferenceEventType(CallConferenceEventType value) {
        this.callConferenceEventType = value;
    }

    /**
     * Gets the value of the callForwardingEventType property.
     * 
     * @return
     *     possible object is
     *     {@link CallForwardingEventType }
     *     
     */
    public CallForwardingEventType getCallForwardingEventType() {
        return callForwardingEventType;
    }

    /**
     * Sets the value of the callForwardingEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallForwardingEventType }
     *     
     */
    public void setCallForwardingEventType(CallForwardingEventType value) {
        this.callForwardingEventType = value;
    }

    /**
     * Gets the value of the messagingEventType property.
     * 
     * @return
     *     possible object is
     *     {@link MessagingEventType }
     *     
     */
    public MessagingEventType getMessagingEventType() {
        return messagingEventType;
    }

    /**
     * Sets the value of the messagingEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessagingEventType }
     *     
     */
    public void setMessagingEventType(MessagingEventType value) {
        this.messagingEventType = value;
    }

    /**
     * Gets the value of the prepayServiceEventType property.
     * 
     * @return
     *     possible object is
     *     {@link PrepayServiceEventType }
     *     
     */
    public PrepayServiceEventType getPrepayServiceEventType() {
        return prepayServiceEventType;
    }

    /**
     * Sets the value of the prepayServiceEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepayServiceEventType }
     *     
     */
    public void setPrepayServiceEventType(PrepayServiceEventType value) {
        this.prepayServiceEventType = value;
    }

    /**
     * Gets the value of the nationalTelephonyEventType property.
     * 
     * @return
     *     possible object is
     *     {@link NationalTelephonyEventType }
     *     
     */
    public NationalTelephonyEventType getNationalTelephonyEventType() {
        return nationalTelephonyEventType;
    }

    /**
     * Sets the value of the nationalTelephonyEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalTelephonyEventType }
     *     
     */
    public void setNationalTelephonyEventType(NationalTelephonyEventType value) {
        this.nationalTelephonyEventType = value;
    }

}
