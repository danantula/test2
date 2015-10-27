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


/**
 * <p>Java class for MapDatum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MapDatum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="wGS84" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="wGS72" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="eD50" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="rD" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="potsdamDatum" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="datumAustria" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="eTRS89" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="nAD27" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="oSGB36" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="oSNI52" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="tM65" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="iTM" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element ref="{http://uri.etsi.org/02657/v1.7.1#/RetainedData}cH1903"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapDatum", propOrder = {
    "wgs84",
    "wgs72",
    "ed50",
    "rd",
    "potsdamDatum",
    "datumAustria",
    "etrs89",
    "nad27",
    "osgb36",
    "osni52",
    "tm65",
    "itm",
    "ch1903"
})
public class MapDatum {

    @XmlElement(name = "wGS84")
    protected NULL wgs84;
    @XmlElement(name = "wGS72")
    protected NULL wgs72;
    @XmlElement(name = "eD50")
    protected NULL ed50;
    @XmlElement(name = "rD")
    protected NULL rd;
    protected NULL potsdamDatum;
    protected NULL datumAustria;
    @XmlElement(name = "eTRS89")
    protected NULL etrs89;
    @XmlElement(name = "nAD27")
    protected NULL nad27;
    @XmlElement(name = "oSGB36")
    protected NULL osgb36;
    @XmlElement(name = "oSNI52")
    protected NULL osni52;
    @XmlElement(name = "tM65")
    protected NULL tm65;
    @XmlElement(name = "iTM")
    protected NULL itm;
    @XmlElement(name = "cH1903", namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData")
    protected NULL ch1903;

    /**
     * Gets the value of the wgs84 property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getWGS84() {
        return wgs84;
    }

    /**
     * Sets the value of the wgs84 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setWGS84(NULL value) {
        this.wgs84 = value;
    }

    /**
     * Gets the value of the wgs72 property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getWGS72() {
        return wgs72;
    }

    /**
     * Sets the value of the wgs72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setWGS72(NULL value) {
        this.wgs72 = value;
    }

    /**
     * Gets the value of the ed50 property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getED50() {
        return ed50;
    }

    /**
     * Sets the value of the ed50 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setED50(NULL value) {
        this.ed50 = value;
    }

    /**
     * Gets the value of the rd property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getRD() {
        return rd;
    }

    /**
     * Sets the value of the rd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setRD(NULL value) {
        this.rd = value;
    }

    /**
     * Gets the value of the potsdamDatum property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getPotsdamDatum() {
        return potsdamDatum;
    }

    /**
     * Sets the value of the potsdamDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setPotsdamDatum(NULL value) {
        this.potsdamDatum = value;
    }

    /**
     * Gets the value of the datumAustria property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getDatumAustria() {
        return datumAustria;
    }

    /**
     * Sets the value of the datumAustria property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setDatumAustria(NULL value) {
        this.datumAustria = value;
    }

    /**
     * Gets the value of the etrs89 property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getETRS89() {
        return etrs89;
    }

    /**
     * Sets the value of the etrs89 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setETRS89(NULL value) {
        this.etrs89 = value;
    }

    /**
     * Gets the value of the nad27 property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getNAD27() {
        return nad27;
    }

    /**
     * Sets the value of the nad27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setNAD27(NULL value) {
        this.nad27 = value;
    }

    /**
     * Gets the value of the osgb36 property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getOSGB36() {
        return osgb36;
    }

    /**
     * Sets the value of the osgb36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setOSGB36(NULL value) {
        this.osgb36 = value;
    }

    /**
     * Gets the value of the osni52 property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getOSNI52() {
        return osni52;
    }

    /**
     * Sets the value of the osni52 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setOSNI52(NULL value) {
        this.osni52 = value;
    }

    /**
     * Gets the value of the tm65 property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getTM65() {
        return tm65;
    }

    /**
     * Sets the value of the tm65 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setTM65(NULL value) {
        this.tm65 = value;
    }

    /**
     * Gets the value of the itm property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getITM() {
        return itm;
    }

    /**
     * Sets the value of the itm property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setITM(NULL value) {
        this.itm = value;
    }

    /**
     * Gets the value of the ch1903 property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getCH1903() {
        return ch1903;
    }

    /**
     * Sets the value of the ch1903 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setCH1903(NULL value) {
        this.ch1903 = value;
    }

}