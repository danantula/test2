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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RetainedDataMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetainedDataMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rdHeaderId" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}ObjectIdentifier"/>
 *         &lt;element name="retainedDataHeader" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}RetainedDataHeader"/>
 *         &lt;element name="retainedDataPayload" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}RetainedDataPayload"/>
 *         &lt;element name="retainedDataDigest" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "retainedDataMessage")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetainedDataMessage", propOrder = {
    "rdHeaderId",
    "retainedDataHeader",
    "retainedDataPayload",
    "retainedDataDigest"
})
public class RetainedDataMessage {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rdHeaderId;
    @XmlElement(required = true)
    protected RetainedDataHeader retainedDataHeader;
    @XmlElement(required = true)
    protected RetainedDataPayload retainedDataPayload;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] retainedDataDigest;

    /**
     * Gets the value of the rdHeaderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRdHeaderId() {
        return rdHeaderId;
    }

    /**
     * Sets the value of the rdHeaderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRdHeaderId(String value) {
        this.rdHeaderId = value;
    }

    /**
     * Gets the value of the retainedDataHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RetainedDataHeader }
     *     
     */
    public RetainedDataHeader getRetainedDataHeader() {
        return retainedDataHeader;
    }

    /**
     * Sets the value of the retainedDataHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetainedDataHeader }
     *     
     */
    public void setRetainedDataHeader(RetainedDataHeader value) {
        this.retainedDataHeader = value;
    }

    /**
     * Gets the value of the retainedDataPayload property.
     * 
     * @return
     *     possible object is
     *     {@link RetainedDataPayload }
     *     
     */
    public RetainedDataPayload getRetainedDataPayload() {
        return retainedDataPayload;
    }

    /**
     * Sets the value of the retainedDataPayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetainedDataPayload }
     *     
     */
    public void setRetainedDataPayload(RetainedDataPayload value) {
        this.retainedDataPayload = value;
    }

    /**
     * Gets the value of the retainedDataDigest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getRetainedDataDigest() {
        return retainedDataDigest;
    }

    /**
     * Sets the value of the retainedDataDigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetainedDataDigest(byte[] value) {
        this.retainedDataDigest = ((byte[]) value);
    }

}