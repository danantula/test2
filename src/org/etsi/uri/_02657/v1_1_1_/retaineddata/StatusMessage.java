//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.14 at 10:55:58 AM BST 
//


package org.etsi.uri._02657.v1_1_1_.retaineddata;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusResponse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="StatusResponse" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}StatusResponse"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusMessage", propOrder = {
    "statusResponse"
})
public class StatusMessage {

    @XmlElement(required = true)
    protected StatusMessage.StatusResponse statusResponse;

    /**
     * Gets the value of the statusResponse property.
     * 
     * @return
     *     possible object is
     *     {@link StatusMessage.StatusResponse }
     *     
     */
    public StatusMessage.StatusResponse getStatusResponse() {
        return statusResponse;
    }

    /**
     * Sets the value of the statusResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusMessage.StatusResponse }
     *     
     */
    public void setStatusResponse(StatusMessage.StatusResponse value) {
        this.statusResponse = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="StatusResponse" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}StatusResponse"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "statusResponse"
    })
    public static class StatusResponse {

        @XmlElement(name = "StatusResponse")
        protected List<org.etsi.uri._02657.v1_1_1_.retaineddata.StatusResponse> statusResponse;

        /**
         * Gets the value of the statusResponse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statusResponse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatusResponse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link org.etsi.uri._02657.v1_1_1_.retaineddata.StatusResponse }
         * 
         * 
         */
        public List<org.etsi.uri._02657.v1_1_1_.retaineddata.StatusResponse> getStatusResponse() {
            if (statusResponse == null) {
                statusResponse = new ArrayList<org.etsi.uri._02657.v1_1_1_.retaineddata.StatusResponse>();
            }
            return this.statusResponse;
        }

    }

}
