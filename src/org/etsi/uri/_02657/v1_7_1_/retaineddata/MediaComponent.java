//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.14 at 10:55:58 AM BST 
//


package org.etsi.uri._02657.v1_7_1_.retaineddata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MediaComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaComponent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="time" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}GeneralizedTime" minOccurs="0"/>
 *         &lt;element name="mediaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mediaDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mediaInitiator" type="{http://uri.etsi.org/02657/v1.7.1#/RetainedData}PartyIdentity" minOccurs="0"/>
 *         &lt;element name="accessCorrelationID" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *         &lt;element name="nationalMultimediaMediaComponent" type="{http://uri.etsi.org/02657/v1.7.1#/RetainedData}NationalMultimediaMediaComponent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaComponent", propOrder = {
    "time",
    "mediaName",
    "mediaDescription",
    "mediaInitiator",
    "accessCorrelationID",
    "nationalMultimediaMediaComponent"
})
public class MediaComponent {

    protected String time;
    protected String mediaName;
    protected String mediaDescription;
    protected String mediaInitiator;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] accessCorrelationID;
    protected NationalMultimediaMediaComponent nationalMultimediaMediaComponent;

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
     * Gets the value of the mediaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaName() {
        return mediaName;
    }

    /**
     * Sets the value of the mediaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaName(String value) {
        this.mediaName = value;
    }

    /**
     * Gets the value of the mediaDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaDescription() {
        return mediaDescription;
    }

    /**
     * Sets the value of the mediaDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaDescription(String value) {
        this.mediaDescription = value;
    }

    /**
     * Gets the value of the mediaInitiator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaInitiator() {
        return mediaInitiator;
    }

    /**
     * Sets the value of the mediaInitiator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaInitiator(String value) {
        this.mediaInitiator = value;
    }

    /**
     * Gets the value of the accessCorrelationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAccessCorrelationID() {
        return accessCorrelationID;
    }

    /**
     * Sets the value of the accessCorrelationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessCorrelationID(byte[] value) {
        this.accessCorrelationID = ((byte[]) value);
    }

    /**
     * Gets the value of the nationalMultimediaMediaComponent property.
     * 
     * @return
     *     possible object is
     *     {@link NationalMultimediaMediaComponent }
     *     
     */
    public NationalMultimediaMediaComponent getNationalMultimediaMediaComponent() {
        return nationalMultimediaMediaComponent;
    }

    /**
     * Sets the value of the nationalMultimediaMediaComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalMultimediaMediaComponent }
     *     
     */
    public void setNationalMultimediaMediaComponent(NationalMultimediaMediaComponent value) {
        this.nationalMultimediaMediaComponent = value;
    }

}