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


/**
 * <p>Java class for ResponseRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recordNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="recordPayload" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}RetainedDataRecord"/>
 *         &lt;element name="additionalInformation" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}AdditionalInformation" minOccurs="0"/>
 *         &lt;element name="nationalRecordPayload" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NationalRecordPayload" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseRecord", propOrder = {
    "recordNumber",
    "recordPayload",
    "additionalInformation",
    "nationalRecordPayload"
})
public class ResponseRecord {

    @XmlElement(required = true)
    protected BigInteger recordNumber;
    @XmlElement(required = true)
    protected RetainedDataRecord recordPayload;
    protected AdditionalInformation additionalInformation;
    protected NationalRecordPayload nationalRecordPayload;

    /**
     * Gets the value of the recordNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordNumber() {
        return recordNumber;
    }

    /**
     * Sets the value of the recordNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordNumber(BigInteger value) {
        this.recordNumber = value;
    }

    /**
     * Gets the value of the recordPayload property.
     * 
     * @return
     *     possible object is
     *     {@link RetainedDataRecord }
     *     
     */
    public RetainedDataRecord getRecordPayload() {
        return recordPayload;
    }

    /**
     * Sets the value of the recordPayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetainedDataRecord }
     *     
     */
    public void setRecordPayload(RetainedDataRecord value) {
        this.recordPayload = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation }
     *     
     */
    public AdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation }
     *     
     */
    public void setAdditionalInformation(AdditionalInformation value) {
        this.additionalInformation = value;
    }

    /**
     * Gets the value of the nationalRecordPayload property.
     * 
     * @return
     *     possible object is
     *     {@link NationalRecordPayload }
     *     
     */
    public NationalRecordPayload getNationalRecordPayload() {
        return nationalRecordPayload;
    }

    /**
     * Sets the value of the nationalRecordPayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalRecordPayload }
     *     
     */
    public void setNationalRecordPayload(NationalRecordPayload value) {
        this.nationalRecordPayload = value;
    }

}
