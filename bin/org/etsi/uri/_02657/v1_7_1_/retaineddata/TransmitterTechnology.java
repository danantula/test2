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
 * <p>Java class for TransmitterTechnology complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransmitterTechnology">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="gen2G" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="gen3G" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransmitterTechnology", propOrder = {
    "gen2G",
    "gen3G"
})
public class TransmitterTechnology {

    protected NULL gen2G;
    protected NULL gen3G;

    /**
     * Gets the value of the gen2G property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getGen2G() {
        return gen2G;
    }

    /**
     * Sets the value of the gen2G property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setGen2G(NULL value) {
        this.gen2G = value;
    }

    /**
     * Gets the value of the gen3G property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getGen3G() {
        return gen3G;
    }

    /**
     * Sets the value of the gen3G property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setGen3G(NULL value) {
        this.gen3G = value;
    }

}
