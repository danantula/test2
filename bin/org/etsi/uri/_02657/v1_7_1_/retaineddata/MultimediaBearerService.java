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

import org.etsi.uri._02657.v1_1_1_.retaineddata.NULL;


/**
 * <p>Java class for MultimediaBearerService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultimediaBearerService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="speech" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="data" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="fax" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="video" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="emergencyCall" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultimediaBearerService", propOrder = {
    "speech",
    "data",
    "fax",
    "video",
    "emergencyCall"
})
public class MultimediaBearerService {

    protected NULL speech;
    protected NULL data;
    protected NULL fax;
    protected NULL video;
    protected NULL emergencyCall;

    /**
     * Gets the value of the speech property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getSpeech() {
        return speech;
    }

    /**
     * Sets the value of the speech property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setSpeech(NULL value) {
        this.speech = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setData(NULL value) {
        this.data = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setFax(NULL value) {
        this.fax = value;
    }

    /**
     * Gets the value of the video property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getVideo() {
        return video;
    }

    /**
     * Sets the value of the video property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setVideo(NULL value) {
        this.video = value;
    }

    /**
     * Gets the value of the emergencyCall property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getEmergencyCall() {
        return emergencyCall;
    }

    /**
     * Sets the value of the emergencyCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setEmergencyCall(NULL value) {
        this.emergencyCall = value;
    }

}