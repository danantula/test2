//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.14 at 10:55:58 AM BST 
//


package org.etsi.uri._02657.v1_3_1_1.retaineddata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.etsi.uri._02657.v1_1_1_.retaineddata.NULL;


/**
 * <p>Java class for DisclosureOwnershipStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisclosureOwnershipStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="dataHeld" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="partialDataHeld" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="noDataHeld" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisclosureOwnershipStatus", propOrder = {
    "dataHeld",
    "partialDataHeld",
    "noDataHeld"
})
public class DisclosureOwnershipStatus {

    protected NULL dataHeld;
    protected NULL partialDataHeld;
    protected NULL noDataHeld;

    /**
     * Gets the value of the dataHeld property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getDataHeld() {
        return dataHeld;
    }

    /**
     * Sets the value of the dataHeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setDataHeld(NULL value) {
        this.dataHeld = value;
    }

    /**
     * Gets the value of the partialDataHeld property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getPartialDataHeld() {
        return partialDataHeld;
    }

    /**
     * Sets the value of the partialDataHeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setPartialDataHeld(NULL value) {
        this.partialDataHeld = value;
    }

    /**
     * Gets the value of the noDataHeld property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getNoDataHeld() {
        return noDataHeld;
    }

    /**
     * Sets the value of the noDataHeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setNoDataHeld(NULL value) {
        this.noDataHeld = value;
    }

}
