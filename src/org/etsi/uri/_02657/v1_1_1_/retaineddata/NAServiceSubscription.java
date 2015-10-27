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

import org.etsi.uri._02657.v1_3_1_2.retaineddata.AllocatedDeviceIDs;
import org.etsi.uri._02657.v1_7_1_.retaineddata.NationalNASubscription;


/**
 * <p>Java class for NAServiceSubscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAServiceSubscription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="validity" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}TimeSpan" minOccurs="0"/>
 *         &lt;element name="naServiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naProviderID" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NAProviderID" minOccurs="0"/>
 *         &lt;element name="naAuthID" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NAAuthID" minOccurs="0"/>
 *         &lt;element name="options" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installationAddress" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}AddressInformation" minOccurs="0"/>
 *         &lt;element name="fixIpAddress" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}IPAddress" minOccurs="0"/>
 *         &lt;element name="imsi" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}IMSI" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/02657/v1.3.1#2/RetainedData}allocatedDeviceIDs" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/02657/v1.7.1#/RetainedData}naServiceStatus" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/02657/v1.7.1#/RetainedData}registeredICCID" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/02657/v1.7.1#/RetainedData}nationalNASubscription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAServiceSubscription", propOrder = {
    "validity",
    "naServiceID",
    "naProviderID",
    "naAuthID",
    "options",
    "installationAddress",
    "fixIpAddress",
    "imsi",
    "allocatedDeviceIDs",
    "naServiceStatus",
    "registeredICCID",
    "nationalNASubscription"
})
public class NAServiceSubscription {

    protected TimeSpan validity;
    protected String naServiceID;
    protected String naProviderID;
    protected String naAuthID;
    protected String options;
    protected AddressInformation installationAddress;
    protected IPAddress fixIpAddress;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] imsi;
    @XmlElement(namespace = "http://uri.etsi.org/02657/v1.3.1#2/RetainedData")
    protected AllocatedDeviceIDs allocatedDeviceIDs;
    @XmlElement(namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData")
    protected String naServiceStatus;
    @XmlElement(namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData")
    protected String registeredICCID;
    @XmlElement(namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData")
    protected NationalNASubscription nationalNASubscription;

    /**
     * Gets the value of the validity property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpan }
     *     
     */
    public TimeSpan getValidity() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpan }
     *     
     */
    public void setValidity(TimeSpan value) {
        this.validity = value;
    }

    /**
     * Gets the value of the naServiceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaServiceID() {
        return naServiceID;
    }

    /**
     * Sets the value of the naServiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaServiceID(String value) {
        this.naServiceID = value;
    }

    /**
     * Gets the value of the naProviderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaProviderID() {
        return naProviderID;
    }

    /**
     * Sets the value of the naProviderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaProviderID(String value) {
        this.naProviderID = value;
    }

    /**
     * Gets the value of the naAuthID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaAuthID() {
        return naAuthID;
    }

    /**
     * Sets the value of the naAuthID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaAuthID(String value) {
        this.naAuthID = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptions(String value) {
        this.options = value;
    }

    /**
     * Gets the value of the installationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInformation }
     *     
     */
    public AddressInformation getInstallationAddress() {
        return installationAddress;
    }

    /**
     * Sets the value of the installationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInformation }
     *     
     */
    public void setInstallationAddress(AddressInformation value) {
        this.installationAddress = value;
    }

    /**
     * Gets the value of the fixIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link IPAddress }
     *     
     */
    public IPAddress getFixIpAddress() {
        return fixIpAddress;
    }

    /**
     * Sets the value of the fixIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPAddress }
     *     
     */
    public void setFixIpAddress(IPAddress value) {
        this.fixIpAddress = value;
    }

    /**
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getImsi() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsi(byte[] value) {
        this.imsi = ((byte[]) value);
    }

    /**
     * Gets the value of the allocatedDeviceIDs property.
     * 
     * @return
     *     possible object is
     *     {@link AllocatedDeviceIDs }
     *     
     */
    public AllocatedDeviceIDs getAllocatedDeviceIDs() {
        return allocatedDeviceIDs;
    }

    /**
     * Sets the value of the allocatedDeviceIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocatedDeviceIDs }
     *     
     */
    public void setAllocatedDeviceIDs(AllocatedDeviceIDs value) {
        this.allocatedDeviceIDs = value;
    }

    /**
     * Gets the value of the naServiceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaServiceStatus() {
        return naServiceStatus;
    }

    /**
     * Sets the value of the naServiceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaServiceStatus(String value) {
        this.naServiceStatus = value;
    }

    /**
     * Gets the value of the registeredICCID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredICCID() {
        return registeredICCID;
    }

    /**
     * Sets the value of the registeredICCID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredICCID(String value) {
        this.registeredICCID = value;
    }

    /**
     * Gets the value of the nationalNASubscription property.
     * 
     * @return
     *     possible object is
     *     {@link NationalNASubscription }
     *     
     */
    public NationalNASubscription getNationalNASubscription() {
        return nationalNASubscription;
    }

    /**
     * Sets the value of the nationalNASubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalNASubscription }
     *     
     */
    public void setNationalNASubscription(NationalNASubscription value) {
        this.nationalNASubscription = value;
    }

}