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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for IPAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="iPv4BinaryAddress">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary">
 *               &lt;length value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="iPv6BinaryAddress">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary">
 *               &lt;length value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="iPTextAddress">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="7"/>
 *               &lt;maxLength value="45"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPAddress", propOrder = {
    "iPv4BinaryAddress",
    "iPv6BinaryAddress",
    "ipTextAddress"
})
public class IPAddress {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] iPv4BinaryAddress;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] iPv6BinaryAddress;
    @XmlElement(name = "iPTextAddress")
    protected String ipTextAddress;

    /**
     * Gets the value of the iPv4BinaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getIPv4BinaryAddress() {
        return iPv4BinaryAddress;
    }

    /**
     * Sets the value of the iPv4BinaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPv4BinaryAddress(byte[] value) {
        this.iPv4BinaryAddress = ((byte[]) value);
    }

    /**
     * Gets the value of the iPv6BinaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getIPv6BinaryAddress() {
        return iPv6BinaryAddress;
    }

    /**
     * Sets the value of the iPv6BinaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPv6BinaryAddress(byte[] value) {
        this.iPv6BinaryAddress = ((byte[]) value);
    }

    /**
     * Gets the value of the ipTextAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPTextAddress() {
        return ipTextAddress;
    }

    /**
     * Sets the value of the ipTextAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPTextAddress(String value) {
        this.ipTextAddress = value;
    }

}
