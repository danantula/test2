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
 * <p>Java class for GA_Polygon_Elements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GA_Polygon_Elements">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geographicalCoordinates" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}GeographicalCoordinates"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GA_Polygon_Elements", propOrder = {
    "geographicalCoordinates"
})
public class GAPolygonElements {

    @XmlElement(required = true)
    protected GeographicalCoordinates geographicalCoordinates;

    /**
     * Gets the value of the geographicalCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicalCoordinates }
     *     
     */
    public GeographicalCoordinates getGeographicalCoordinates() {
        return geographicalCoordinates;
    }

    /**
     * Sets the value of the geographicalCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicalCoordinates }
     *     
     */
    public void setGeographicalCoordinates(GeographicalCoordinates value) {
        this.geographicalCoordinates = value;
    }

}
