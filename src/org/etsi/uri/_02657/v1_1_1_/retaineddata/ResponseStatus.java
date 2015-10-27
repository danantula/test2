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
 * <p>Java class for ResponseStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="responseComplete" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="responseIncomplete" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="responseUnavailable" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="responseFailed" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}FurtherInformation"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseStatus", propOrder = {
    "responseComplete",
    "responseIncomplete",
    "responseUnavailable",
    "responseFailed"
})
public class ResponseStatus {

    protected NULL responseComplete;
    protected NULL responseIncomplete;
    protected NULL responseUnavailable;
    protected FurtherInformation responseFailed;

    /**
     * Gets the value of the responseComplete property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getResponseComplete() {
        return responseComplete;
    }

    /**
     * Sets the value of the responseComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setResponseComplete(NULL value) {
        this.responseComplete = value;
    }

    /**
     * Gets the value of the responseIncomplete property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getResponseIncomplete() {
        return responseIncomplete;
    }

    /**
     * Sets the value of the responseIncomplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setResponseIncomplete(NULL value) {
        this.responseIncomplete = value;
    }

    /**
     * Gets the value of the responseUnavailable property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getResponseUnavailable() {
        return responseUnavailable;
    }

    /**
     * Sets the value of the responseUnavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setResponseUnavailable(NULL value) {
        this.responseUnavailable = value;
    }

    /**
     * Gets the value of the responseFailed property.
     * 
     * @return
     *     possible object is
     *     {@link FurtherInformation }
     *     
     */
    public FurtherInformation getResponseFailed() {
        return responseFailed;
    }

    /**
     * Sets the value of the responseFailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link FurtherInformation }
     *     
     */
    public void setResponseFailed(FurtherInformation value) {
        this.responseFailed = value;
    }

}
