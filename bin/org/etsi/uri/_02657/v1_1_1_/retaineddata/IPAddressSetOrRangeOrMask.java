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
 * <p>Java class for IPAddressSetOrRangeOrMask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPAddressSetOrRangeOrMask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="set">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="IPAddress" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}IPAddress"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="range" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}IPRange"/>
 *         &lt;element name="mask" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}IPMask"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPAddressSetOrRangeOrMask", propOrder = {
    "set",
    "range",
    "mask"
})
public class IPAddressSetOrRangeOrMask {

    protected IPAddressSetOrRangeOrMask.Set set;
    protected IPRange range;
    protected IPMask mask;

    /**
     * Gets the value of the set property.
     * 
     * @return
     *     possible object is
     *     {@link IPAddressSetOrRangeOrMask.Set }
     *     
     */
    public IPAddressSetOrRangeOrMask.Set getSet() {
        return set;
    }

    /**
     * Sets the value of the set property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPAddressSetOrRangeOrMask.Set }
     *     
     */
    public void setSet(IPAddressSetOrRangeOrMask.Set value) {
        this.set = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link IPRange }
     *     
     */
    public IPRange getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPRange }
     *     
     */
    public void setRange(IPRange value) {
        this.range = value;
    }

    /**
     * Gets the value of the mask property.
     * 
     * @return
     *     possible object is
     *     {@link IPMask }
     *     
     */
    public IPMask getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPMask }
     *     
     */
    public void setMask(IPMask value) {
        this.mask = value;
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
     *         &lt;element name="IPAddress" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}IPAddress"/>
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
        "ipAddress"
    })
    public static class Set {

        @XmlElement(name = "IPAddress")
        protected List<IPAddress> ipAddress;

        /**
         * Gets the value of the ipAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ipAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIPAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IPAddress }
         * 
         * 
         */
        public List<IPAddress> getIPAddress() {
            if (ipAddress == null) {
                ipAddress = new ArrayList<IPAddress>();
            }
            return this.ipAddress;
        }

    }

}
