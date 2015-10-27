//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.14 at 10:55:58 AM BST 
//


package org.etsi.uri._02657.v1_1_1_.retaineddata;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NAServiceUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAServiceUsage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="naAccessTime" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}GeneralizedTime" minOccurs="0"/>
 *         &lt;element name="naAuthID" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NAAuthID" minOccurs="0"/>
 *         &lt;element name="nwAccessType" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NwAccessType" minOccurs="0"/>
 *         &lt;element name="naStatus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="unknown" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *                   &lt;element name="succeeded" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *                   &lt;element name="failed" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *                   &lt;element name="rejected" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="interval" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}TimeSpan" minOccurs="0"/>
 *         &lt;element name="naDeviceId" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NADeviceId" minOccurs="0"/>
 *         &lt;element name="naNwElementID" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NANwElementID" minOccurs="0"/>
 *         &lt;element name="naAssignedAddress" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="NAAssignedAddress" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NAAssignedAddress"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="location" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}Location" minOccurs="0"/>
 *         &lt;element name="dialUpInformation" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}DialUpInformation" minOccurs="0"/>
 *         &lt;element name="gprsInformation" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}GprsInformation" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/02657/v1.3.1#1/RetainedData}octetsDownloaded" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/02657/v1.3.1#1/RetainedData}octetsUploaded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAServiceUsage", propOrder = {
    "naAccessTime",
    "naAuthID",
    "nwAccessType",
    "naStatus",
    "interval",
    "naDeviceId",
    "naNwElementID",
    "naAssignedAddress",
    "location",
    "dialUpInformation",
    "gprsInformation",
    "octetsDownloaded",
    "octetsUploaded"
})
public class NAServiceUsage {

    protected String naAccessTime;
    protected String naAuthID;
    protected NwAccessType nwAccessType;
    protected NAServiceUsage.NaStatus naStatus;
    protected TimeSpan interval;
    protected String naDeviceId;
    protected String naNwElementID;
    protected NAServiceUsage.NaAssignedAddress naAssignedAddress;
    protected Location location;
    protected DialUpInformation dialUpInformation;
    protected GprsInformation gprsInformation;
    @XmlElement(namespace = "http://uri.etsi.org/02657/v1.3.1#1/RetainedData")
    protected BigInteger octetsDownloaded;
    @XmlElement(namespace = "http://uri.etsi.org/02657/v1.3.1#1/RetainedData")
    protected BigInteger octetsUploaded;

    /**
     * Gets the value of the naAccessTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaAccessTime() {
        return naAccessTime;
    }

    /**
     * Sets the value of the naAccessTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaAccessTime(String value) {
        this.naAccessTime = value;
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
     * Gets the value of the nwAccessType property.
     * 
     * @return
     *     possible object is
     *     {@link NwAccessType }
     *     
     */
    public NwAccessType getNwAccessType() {
        return nwAccessType;
    }

    /**
     * Sets the value of the nwAccessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NwAccessType }
     *     
     */
    public void setNwAccessType(NwAccessType value) {
        this.nwAccessType = value;
    }

    /**
     * Gets the value of the naStatus property.
     * 
     * @return
     *     possible object is
     *     {@link NAServiceUsage.NaStatus }
     *     
     */
    public NAServiceUsage.NaStatus getNaStatus() {
        return naStatus;
    }

    /**
     * Sets the value of the naStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link NAServiceUsage.NaStatus }
     *     
     */
    public void setNaStatus(NAServiceUsage.NaStatus value) {
        this.naStatus = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpan }
     *     
     */
    public TimeSpan getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpan }
     *     
     */
    public void setInterval(TimeSpan value) {
        this.interval = value;
    }

    /**
     * Gets the value of the naDeviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaDeviceId() {
        return naDeviceId;
    }

    /**
     * Sets the value of the naDeviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaDeviceId(String value) {
        this.naDeviceId = value;
    }

    /**
     * Gets the value of the naNwElementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaNwElementID() {
        return naNwElementID;
    }

    /**
     * Sets the value of the naNwElementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaNwElementID(String value) {
        this.naNwElementID = value;
    }

    /**
     * Gets the value of the naAssignedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link NAServiceUsage.NaAssignedAddress }
     *     
     */
    public NAServiceUsage.NaAssignedAddress getNaAssignedAddress() {
        return naAssignedAddress;
    }

    /**
     * Sets the value of the naAssignedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link NAServiceUsage.NaAssignedAddress }
     *     
     */
    public void setNaAssignedAddress(NAServiceUsage.NaAssignedAddress value) {
        this.naAssignedAddress = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the dialUpInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DialUpInformation }
     *     
     */
    public DialUpInformation getDialUpInformation() {
        return dialUpInformation;
    }

    /**
     * Sets the value of the dialUpInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DialUpInformation }
     *     
     */
    public void setDialUpInformation(DialUpInformation value) {
        this.dialUpInformation = value;
    }

    /**
     * Gets the value of the gprsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link GprsInformation }
     *     
     */
    public GprsInformation getGprsInformation() {
        return gprsInformation;
    }

    /**
     * Sets the value of the gprsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GprsInformation }
     *     
     */
    public void setGprsInformation(GprsInformation value) {
        this.gprsInformation = value;
    }

    /**
     * Gets the value of the octetsDownloaded property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOctetsDownloaded() {
        return octetsDownloaded;
    }

    /**
     * Sets the value of the octetsDownloaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOctetsDownloaded(BigInteger value) {
        this.octetsDownloaded = value;
    }

    /**
     * Gets the value of the octetsUploaded property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOctetsUploaded() {
        return octetsUploaded;
    }

    /**
     * Sets the value of the octetsUploaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOctetsUploaded(BigInteger value) {
        this.octetsUploaded = value;
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
     *         &lt;element name="NAAssignedAddress" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NAAssignedAddress"/>
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
        "naAssignedAddress"
    })
    public static class NaAssignedAddress {

        @XmlElement(name = "NAAssignedAddress")
        protected List<NAAssignedAddress> naAssignedAddress;

        /**
         * Gets the value of the naAssignedAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the naAssignedAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNAAssignedAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NAAssignedAddress }
         * 
         * 
         */
        public List<NAAssignedAddress> getNAAssignedAddress() {
            if (naAssignedAddress == null) {
                naAssignedAddress = new ArrayList<NAAssignedAddress>();
            }
            return this.naAssignedAddress;
        }

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
     *       &lt;choice>
     *         &lt;element name="unknown" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
     *         &lt;element name="succeeded" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
     *         &lt;element name="failed" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
     *         &lt;element name="rejected" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "unknown",
        "succeeded",
        "failed",
        "rejected"
    })
    public static class NaStatus {

        protected NULL unknown;
        protected NULL succeeded;
        protected NULL failed;
        protected NULL rejected;

        /**
         * Gets the value of the unknown property.
         * 
         * @return
         *     possible object is
         *     {@link NULL }
         *     
         */
        public NULL getUnknown() {
            return unknown;
        }

        /**
         * Sets the value of the unknown property.
         * 
         * @param value
         *     allowed object is
         *     {@link NULL }
         *     
         */
        public void setUnknown(NULL value) {
            this.unknown = value;
        }

        /**
         * Gets the value of the succeeded property.
         * 
         * @return
         *     possible object is
         *     {@link NULL }
         *     
         */
        public NULL getSucceeded() {
            return succeeded;
        }

        /**
         * Sets the value of the succeeded property.
         * 
         * @param value
         *     allowed object is
         *     {@link NULL }
         *     
         */
        public void setSucceeded(NULL value) {
            this.succeeded = value;
        }

        /**
         * Gets the value of the failed property.
         * 
         * @return
         *     possible object is
         *     {@link NULL }
         *     
         */
        public NULL getFailed() {
            return failed;
        }

        /**
         * Sets the value of the failed property.
         * 
         * @param value
         *     allowed object is
         *     {@link NULL }
         *     
         */
        public void setFailed(NULL value) {
            this.failed = value;
        }

        /**
         * Gets the value of the rejected property.
         * 
         * @return
         *     possible object is
         *     {@link NULL }
         *     
         */
        public NULL getRejected() {
            return rejected;
        }

        /**
         * Sets the value of the rejected property.
         * 
         * @param value
         *     allowed object is
         *     {@link NULL }
         *     
         */
        public void setRejected(NULL value) {
            this.rejected = value;
        }

    }

}
