//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.14 at 10:55:58 AM BST 
//


package org.etsi.uri._02657.v1_3_1_1.retaineddata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.etsi.uri._02657.v1_1_1_.retaineddata.MapDatum;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="latitudeDec" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="longitudeDec" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="4"/>
 *               &lt;maxLength value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mapDatum" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}MapDatum" minOccurs="0"/>
 *         &lt;element name="azimuth" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="359"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "", propOrder = {
    "latitudeDec",
    "longitudeDec",
    "mapDatum",
    "azimuth"
})
@XmlRootElement(name = "geoCoordinatesDec")
public class GeoCoordinatesDec {

    protected String latitudeDec;
    protected String longitudeDec;
    protected MapDatum mapDatum;
    protected Integer azimuth;

    /**
     * Gets the value of the latitudeDec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitudeDec() {
        return latitudeDec;
    }

    /**
     * Sets the value of the latitudeDec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitudeDec(String value) {
        this.latitudeDec = value;
    }

    /**
     * Gets the value of the longitudeDec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitudeDec() {
        return longitudeDec;
    }

    /**
     * Sets the value of the longitudeDec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitudeDec(String value) {
        this.longitudeDec = value;
    }

    /**
     * Gets the value of the mapDatum property.
     * 
     * @return
     *     possible object is
     *     {@link MapDatum }
     *     
     */
    public MapDatum getMapDatum() {
        return mapDatum;
    }

    /**
     * Sets the value of the mapDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapDatum }
     *     
     */
    public void setMapDatum(MapDatum value) {
        this.mapDatum = value;
    }

    /**
     * Gets the value of the azimuth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAzimuth() {
        return azimuth;
    }

    /**
     * Sets the value of the azimuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAzimuth(Integer value) {
        this.azimuth = value;
    }

}
