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

import org.etsi.uri._02657.v1_7_1_.retaineddata.PDFIndication;


/**
 * <p>Java class for AdditionalParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requiredByDetails" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}RequiredByDetails" minOccurs="0"/>
 *         &lt;element name="dSARExemption" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}DSARExemption" minOccurs="0"/>
 *         &lt;element name="additionalSecurityMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultFields" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}ResultFields" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/02657/v1.7.1#/RetainedData}pdfIndication" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalParameters", propOrder = {
    "requiredByDetails",
    "dsarExemption",
    "additionalSecurityMeasure",
    "resultFields",
    "pdfIndication"
})
public class AdditionalParameters {

    protected RequiredByDetails requiredByDetails;
    @XmlElement(name = "dSARExemption")
    protected DSARExemption dsarExemption;
    protected String additionalSecurityMeasure;
    protected String resultFields;
    @XmlElement(namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData")
    protected PDFIndication pdfIndication;

    /**
     * Gets the value of the requiredByDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredByDetails }
     *     
     */
    public RequiredByDetails getRequiredByDetails() {
        return requiredByDetails;
    }

    /**
     * Sets the value of the requiredByDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredByDetails }
     *     
     */
    public void setRequiredByDetails(RequiredByDetails value) {
        this.requiredByDetails = value;
    }

    /**
     * Gets the value of the dsarExemption property.
     * 
     * @return
     *     possible object is
     *     {@link DSARExemption }
     *     
     */
    public DSARExemption getDSARExemption() {
        return dsarExemption;
    }

    /**
     * Sets the value of the dsarExemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSARExemption }
     *     
     */
    public void setDSARExemption(DSARExemption value) {
        this.dsarExemption = value;
    }

    /**
     * Gets the value of the additionalSecurityMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalSecurityMeasure() {
        return additionalSecurityMeasure;
    }

    /**
     * Sets the value of the additionalSecurityMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalSecurityMeasure(String value) {
        this.additionalSecurityMeasure = value;
    }

    /**
     * Gets the value of the resultFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultFields() {
        return resultFields;
    }

    /**
     * Sets the value of the resultFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultFields(String value) {
        this.resultFields = value;
    }

    /**
     * Gets the value of the pdfIndication property.
     * 
     * @return
     *     possible object is
     *     {@link PDFIndication }
     *     
     */
    public PDFIndication getPdfIndication() {
        return pdfIndication;
    }

    /**
     * Sets the value of the pdfIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFIndication }
     *     
     */
    public void setPdfIndication(PDFIndication value) {
        this.pdfIndication = value;
    }

}
