//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.14 at 10:55:58 AM BST 
//


package org.etsi.uri._02657.v1_1_1_.retaineddata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequiredByReason complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequiredByReason">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="bailDate" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="courtDate" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="personInCustody" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="section81" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}NULL"/>
 *         &lt;element name="other" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredByReason", propOrder = {
    "bailDate",
    "courtDate",
    "personInCustody",
    "section81",
    "other"
})
public class RequiredByReason {

    protected NULL bailDate;
    protected NULL courtDate;
    protected NULL personInCustody;
    protected NULL section81;
    protected String other;

    /**
     * Gets the value of the bailDate property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getBailDate() {
        return bailDate;
    }

    /**
     * Sets the value of the bailDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setBailDate(NULL value) {
        this.bailDate = value;
    }

    /**
     * Gets the value of the courtDate property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getCourtDate() {
        return courtDate;
    }

    /**
     * Sets the value of the courtDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setCourtDate(NULL value) {
        this.courtDate = value;
    }

    /**
     * Gets the value of the personInCustody property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getPersonInCustody() {
        return personInCustody;
    }

    /**
     * Sets the value of the personInCustody property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setPersonInCustody(NULL value) {
        this.personInCustody = value;
    }

    /**
     * Gets the value of the section81 property.
     * 
     * @return
     *     possible object is
     *     {@link NULL }
     *     
     */
    public NULL getSection81() {
        return section81;
    }

    /**
     * Sets the value of the section81 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NULL }
     *     
     */
    public void setSection81(NULL value) {
        this.section81 = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther(String value) {
        this.other = value;
    }

}