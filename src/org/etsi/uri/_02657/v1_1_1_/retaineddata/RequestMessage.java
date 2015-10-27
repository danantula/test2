//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.14 at 10:55:58 AM BST 
//


package org.etsi.uri._02657.v1_1_1_.retaineddata;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestPriority" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}RequestPriority" minOccurs="0"/>
 *         &lt;element name="requestParameters" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}RequestConstraints" minOccurs="0"/>
 *         &lt;element name="deliveryPointHIB" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}DeliveryPointHIB" minOccurs="0"/>
 *         &lt;element name="maxHits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="nationalRequestParameters" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NationalRequestParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMessage", propOrder = {
    "requestPriority",
    "requestParameters",
    "deliveryPointHIB",
    "maxHits",
    "nationalRequestParameters"
})
public class RequestMessage {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] requestPriority;
    protected RequestConstraints requestParameters;
    protected String deliveryPointHIB;
    protected BigInteger maxHits;
    protected NationalRequestParameters nationalRequestParameters;

    /**
     * Gets the value of the requestPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getRequestPriority() {
        return requestPriority;
    }

    /**
     * Sets the value of the requestPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestPriority(byte[] value) {
        this.requestPriority = ((byte[]) value);
    }

    /**
     * Gets the value of the requestParameters property.
     * 
     * @return
     *     possible object is
     *     {@link RequestConstraints }
     *     
     */
    public RequestConstraints getRequestParameters() {
        return requestParameters;
    }

    /**
     * Sets the value of the requestParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestConstraints }
     *     
     */
    public void setRequestParameters(RequestConstraints value) {
        this.requestParameters = value;
    }

    /**
     * Gets the value of the deliveryPointHIB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPointHIB() {
        return deliveryPointHIB;
    }

    /**
     * Sets the value of the deliveryPointHIB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPointHIB(String value) {
        this.deliveryPointHIB = value;
    }

    /**
     * Gets the value of the maxHits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxHits() {
        return maxHits;
    }

    /**
     * Sets the value of the maxHits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxHits(BigInteger value) {
        this.maxHits = value;
    }

    /**
     * Gets the value of the nationalRequestParameters property.
     * 
     * @return
     *     possible object is
     *     {@link NationalRequestParameters }
     *     
     */
    public NationalRequestParameters getNationalRequestParameters() {
        return nationalRequestParameters;
    }

    /**
     * Sets the value of the nationalRequestParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalRequestParameters }
     *     
     */
    public void setNationalRequestParameters(NationalRequestParameters value) {
        this.nationalRequestParameters = value;
    }

}