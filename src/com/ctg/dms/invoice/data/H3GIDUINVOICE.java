//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-793 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.18 at 03:38:41 PM GMT 
//


package com.ctg.dms.invoice.data;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accountnumber",
    "orgid",
    "billtositenumber",
    "transactiontype",
    "poreference",
    "statementperiod",
    "invoiceline"
})
@XmlRootElement(name = "H3GIDUINVOICE")
public class H3GIDUINVOICE {

    @XmlElement(name = "ACCOUNTNUMBER", required = true)
    protected String accountnumber;
    @XmlElement(name = "ORGID", required = true)
    protected String orgid;
    @XmlElement(name = "BILLTOSITENUMBER", required = true)
    protected String billtositenumber;
    @XmlElement(name = "TRANSACTIONTYPE", required = true)
    protected String transactiontype;
    @XmlElement(name = "POREFERENCE", required = true)
    protected String poreference;
    @XmlElement(name = "STATEMENTPERIOD", required = true)
    protected String statementperiod;
    @XmlElement(name = "INVOICELINE", required = true)
    protected List<INVOICELINE> invoiceline;

    /**
     * Gets the value of the accountnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTNUMBER() {
        return accountnumber;
    }

    /**
     * Sets the value of the accountnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTNUMBER(String value) {
        this.accountnumber = value;
    }

    /**
     * Gets the value of the orgid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORGID() {
        return orgid;
    }

    /**
     * Sets the value of the orgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORGID(String value) {
        this.orgid = value;
    }

    /**
     * Gets the value of the billtositenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBILLTOSITENUMBER() {
        return billtositenumber;
    }

    /**
     * Sets the value of the billtositenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBILLTOSITENUMBER(String value) {
        this.billtositenumber = value;
    }

    /**
     * Gets the value of the transactiontype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSACTIONTYPE() {
        return transactiontype;
    }

    /**
     * Sets the value of the transactiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSACTIONTYPE(String value) {
        this.transactiontype = value;
    }

    /**
     * Gets the value of the poreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOREFERENCE() {
        return poreference;
    }

    /**
     * Sets the value of the poreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOREFERENCE(String value) {
        this.poreference = value;
    }

    /**
     * Gets the value of the statementperiod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATEMENTPERIOD() {
        return statementperiod;
    }

    /**
     * Sets the value of the statementperiod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATEMENTPERIOD(String value) {
        this.statementperiod = value;
    }

    /**
     * Gets the value of the invoiceline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINVOICELINE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INVOICELINE }
     * 
     * 
     */
    public List<INVOICELINE> getINVOICELINE() {
        if (invoiceline == null) {
            invoiceline = new ArrayList<INVOICELINE>();
        }
        return this.invoiceline;
    }

}
