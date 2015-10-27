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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.etsi.uri._02657.v1_7_1_.retaineddata.PDFVerification;


/**
 * <p>Java class for PDFCopyInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDFCopyInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdfCopyURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/02657/v1.7.1#/RetainedData}pdfCopyFile" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/02657/v1.7.1#/RetainedData}pdfVerification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDFCopyInformation", propOrder = {
    "pdfCopyURI",
    "pdfCopyFile",
    "pdfVerification"
})
public class PDFCopyInformation {

    protected String pdfCopyURI;
    @XmlElement(namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] pdfCopyFile;
    @XmlElement(namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData")
    protected PDFVerification pdfVerification;

    /**
     * Gets the value of the pdfCopyURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfCopyURI() {
        return pdfCopyURI;
    }

    /**
     * Sets the value of the pdfCopyURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfCopyURI(String value) {
        this.pdfCopyURI = value;
    }

    /**
     * Gets the value of the pdfCopyFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getPdfCopyFile() {
        return pdfCopyFile;
    }

    /**
     * Sets the value of the pdfCopyFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfCopyFile(byte[] value) {
        this.pdfCopyFile = ((byte[]) value);
    }

    /**
     * Gets the value of the pdfVerification property.
     * 
     * @return
     *     possible object is
     *     {@link PDFVerification }
     *     
     */
    public PDFVerification getPdfVerification() {
        return pdfVerification;
    }

    /**
     * Sets the value of the pdfVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFVerification }
     *     
     */
    public void setPdfVerification(PDFVerification value) {
        this.pdfVerification = value;
    }

}