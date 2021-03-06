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


/**
 * <p>Java class for MultimediaBillingRecords complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultimediaBillingRecords">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="time" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}GeneralizedTime" minOccurs="0"/>
 *         &lt;element name="place" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="currency" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationalMultimediaBillingRecords" type="{http://uri.etsi.org/02657/v1.7.1#/RetainedData}NationalMultimediaBillingRecords" minOccurs="0"/>
 *         &lt;element name="multimediaTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="multimediaTransactionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultimediaBillingRecords", propOrder = {
    "time",
    "place",
    "amount",
    "currency",
    "method",
    "nationalMultimediaBillingRecords",
    "multimediaTransactionID",
    "multimediaTransactionStatus"
})
public class MultimediaBillingRecords {

    protected String time;
    protected String place;
    protected Double amount;
    protected String currency;
    protected String method;
    protected NationalMultimediaBillingRecords nationalMultimediaBillingRecords;
    protected String multimediaTransactionID;
    protected String multimediaTransactionStatus;

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlace(String value) {
        this.place = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Gets the value of the nationalMultimediaBillingRecords property.
     * 
     * @return
     *     possible object is
     *     {@link NationalMultimediaBillingRecords }
     *     
     */
    public NationalMultimediaBillingRecords getNationalMultimediaBillingRecords() {
        return nationalMultimediaBillingRecords;
    }

    /**
     * Sets the value of the nationalMultimediaBillingRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalMultimediaBillingRecords }
     *     
     */
    public void setNationalMultimediaBillingRecords(NationalMultimediaBillingRecords value) {
        this.nationalMultimediaBillingRecords = value;
    }

    /**
     * Gets the value of the multimediaTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultimediaTransactionID() {
        return multimediaTransactionID;
    }

    /**
     * Sets the value of the multimediaTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultimediaTransactionID(String value) {
        this.multimediaTransactionID = value;
    }

    /**
     * Gets the value of the multimediaTransactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultimediaTransactionStatus() {
        return multimediaTransactionStatus;
    }

    /**
     * Sets the value of the multimediaTransactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultimediaTransactionStatus(String value) {
        this.multimediaTransactionStatus = value;
    }

}
