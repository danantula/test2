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
 * <p>Java class for RetainedDataPayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetainedDataPayload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="requestMessage" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}RequestMessage"/>
 *         &lt;element name="requestAcknowledgement" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}RequestAcknowledgement"/>
 *         &lt;element name="responseMessage" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}ResponseMessage"/>
 *         &lt;element name="responseAcknowledgement" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}ResponseAcknowledgement"/>
 *         &lt;element name="errorMessage" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}FurtherInformation"/>
 *         &lt;element name="cancelMessage" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}CancelMessage"/>
 *         &lt;element name="cancelAcknowledgement" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}CancelAcknowledgement"/>
 *         &lt;element name="getstatusMessage" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}GetStatusMessage"/>
 *         &lt;element name="statusMessage" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}StatusMessage"/>
 *         &lt;element name="getResultsMessage" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}GetResultsMessage"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetainedDataPayload", propOrder = {
    "requestMessage",
    "requestAcknowledgement",
    "responseMessage",
    "responseAcknowledgement",
    "errorMessage",
    "cancelMessage",
    "cancelAcknowledgement",
    "getstatusMessage",
    "statusMessage",
    "getResultsMessage"
})
public class RetainedDataPayload {

    protected RequestMessage requestMessage;
    protected RequestAcknowledgement requestAcknowledgement;
    protected ResponseMessage responseMessage;
    protected ResponseAcknowledgement responseAcknowledgement;
    protected FurtherInformation errorMessage;
    protected CancelMessage cancelMessage;
    protected CancelAcknowledgement cancelAcknowledgement;
    protected GetStatusMessage getstatusMessage;
    protected StatusMessage statusMessage;
    protected GetResultsMessage getResultsMessage;

    /**
     * Gets the value of the requestMessage property.
     * 
     * @return
     *     possible object is
     *     {@link RequestMessage }
     *     
     */
    public RequestMessage getRequestMessage() {
        return requestMessage;
    }

    /**
     * Sets the value of the requestMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestMessage }
     *     
     */
    public void setRequestMessage(RequestMessage value) {
        this.requestMessage = value;
    }

    /**
     * Gets the value of the requestAcknowledgement property.
     * 
     * @return
     *     possible object is
     *     {@link RequestAcknowledgement }
     *     
     */
    public RequestAcknowledgement getRequestAcknowledgement() {
        return requestAcknowledgement;
    }

    /**
     * Sets the value of the requestAcknowledgement property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestAcknowledgement }
     *     
     */
    public void setRequestAcknowledgement(RequestAcknowledgement value) {
        this.requestAcknowledgement = value;
    }

    /**
     * Gets the value of the responseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMessage }
     *     
     */
    public ResponseMessage getResponseMessage() {
        return responseMessage;
    }

    /**
     * Sets the value of the responseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMessage }
     *     
     */
    public void setResponseMessage(ResponseMessage value) {
        this.responseMessage = value;
    }

    /**
     * Gets the value of the responseAcknowledgement property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseAcknowledgement }
     *     
     */
    public ResponseAcknowledgement getResponseAcknowledgement() {
        return responseAcknowledgement;
    }

    /**
     * Sets the value of the responseAcknowledgement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseAcknowledgement }
     *     
     */
    public void setResponseAcknowledgement(ResponseAcknowledgement value) {
        this.responseAcknowledgement = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link FurtherInformation }
     *     
     */
    public FurtherInformation getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link FurtherInformation }
     *     
     */
    public void setErrorMessage(FurtherInformation value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the cancelMessage property.
     * 
     * @return
     *     possible object is
     *     {@link CancelMessage }
     *     
     */
    public CancelMessage getCancelMessage() {
        return cancelMessage;
    }

    /**
     * Sets the value of the cancelMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelMessage }
     *     
     */
    public void setCancelMessage(CancelMessage value) {
        this.cancelMessage = value;
    }

    /**
     * Gets the value of the cancelAcknowledgement property.
     * 
     * @return
     *     possible object is
     *     {@link CancelAcknowledgement }
     *     
     */
    public CancelAcknowledgement getCancelAcknowledgement() {
        return cancelAcknowledgement;
    }

    /**
     * Sets the value of the cancelAcknowledgement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelAcknowledgement }
     *     
     */
    public void setCancelAcknowledgement(CancelAcknowledgement value) {
        this.cancelAcknowledgement = value;
    }

    /**
     * Gets the value of the getstatusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link GetStatusMessage }
     *     
     */
    public GetStatusMessage getGetstatusMessage() {
        return getstatusMessage;
    }

    /**
     * Sets the value of the getstatusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetStatusMessage }
     *     
     */
    public void setGetstatusMessage(GetStatusMessage value) {
        this.getstatusMessage = value;
    }

    /**
     * Gets the value of the statusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link StatusMessage }
     *     
     */
    public StatusMessage getStatusMessage() {
        return statusMessage;
    }

    /**
     * Sets the value of the statusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusMessage }
     *     
     */
    public void setStatusMessage(StatusMessage value) {
        this.statusMessage = value;
    }

    /**
     * Gets the value of the getResultsMessage property.
     * 
     * @return
     *     possible object is
     *     {@link GetResultsMessage }
     *     
     */
    public GetResultsMessage getGetResultsMessage() {
        return getResultsMessage;
    }

    /**
     * Sets the value of the getResultsMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetResultsMessage }
     *     
     */
    public void setGetResultsMessage(GetResultsMessage value) {
        this.getResultsMessage = value;
    }

}