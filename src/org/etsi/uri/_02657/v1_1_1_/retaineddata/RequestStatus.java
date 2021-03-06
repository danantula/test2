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
 * <p>Java class for RequestStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ready" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="incompleteResultsReady" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="failureResponseReady" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="notReady" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="error" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}FurtherInformation"/>
 *         &lt;element name="inDelivery" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="invalidRequestID" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestStatus", propOrder = {
    "ready",
    "incompleteResultsReady",
    "failureResponseReady",
    "notReady",
    "error",
    "inDelivery",
    "invalidRequestID"
})
public class RequestStatus {

    protected NULL ready;
    protected NULL incompleteResultsReady;
    protected NULL failureResponseReady;
    protected NULL notReady;
    protected FurtherInformation error;
    protected NULL inDelivery;
    protected NULL invalidRequestID;

    /**
     * Gets the value of the ready property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getReady() {
        return ready;
    }

    /**
     * Sets the value of the ready property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setReady(NULL value) {
        this.ready = value;
    }

    /**
     * Gets the value of the incompleteResultsReady property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getIncompleteResultsReady() {
        return incompleteResultsReady;
    }

    /**
     * Sets the value of the incompleteResultsReady property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setIncompleteResultsReady(NULL value) {
        this.incompleteResultsReady = value;
    }

    /**
     * Gets the value of the failureResponseReady property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getFailureResponseReady() {
        return failureResponseReady;
    }

    /**
     * Sets the value of the failureResponseReady property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setFailureResponseReady(NULL value) {
        this.failureResponseReady = value;
    }

    /**
     * Gets the value of the notReady property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getNotReady() {
        return notReady;
    }

    /**
     * Sets the value of the notReady property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setNotReady(NULL value) {
        this.notReady = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link FurtherInformation }
     *     
     */
    public FurtherInformation getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link FurtherInformation }
     *     
     */
    public void setError(FurtherInformation value) {
        this.error = value;
    }

    /**
     * Gets the value of the inDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getInDelivery() {
        return inDelivery;
    }

    /**
     * Sets the value of the inDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setInDelivery(NULL value) {
        this.inDelivery = value;
    }

    /**
     * Gets the value of the invalidRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getInvalidRequestID() {
        return invalidRequestID;
    }

    /**
     * Sets the value of the invalidRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setInvalidRequestID(NULL value) {
        this.invalidRequestID = value;
    }

}
