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
 * <p>Java class for MsgServiceUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MsgServiceUsage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="msgTransmission" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}MsgTransmission"/>
 *         &lt;element name="msgStoreOperation" type="{http://uri.etsi.org/02657/v1.1.1#/RetainedData}MsgStoreOperation"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsgServiceUsage", propOrder = {
    "msgTransmission",
    "msgStoreOperation"
})
public class MsgServiceUsage {

    protected MsgTransmission msgTransmission;
    protected MsgStoreOperation msgStoreOperation;

    /**
     * Gets the value of the msgTransmission property.
     * 
     * @return
     *     possible object is
     *     {@link MsgTransmission }
     *     
     */
    public MsgTransmission getMsgTransmission() {
        return msgTransmission;
    }

    /**
     * Sets the value of the msgTransmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgTransmission }
     *     
     */
    public void setMsgTransmission(MsgTransmission value) {
        this.msgTransmission = value;
    }

    /**
     * Gets the value of the msgStoreOperation property.
     * 
     * @return
     *     possible object is
     *     {@link MsgStoreOperation }
     *     
     */
    public MsgStoreOperation getMsgStoreOperation() {
        return msgStoreOperation;
    }

    /**
     * Sets the value of the msgStoreOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgStoreOperation }
     *     
     */
    public void setMsgStoreOperation(MsgStoreOperation value) {
        this.msgStoreOperation = value;
    }

}
