
package com.ctg.dms.customerprofile.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}ACCOUNTTYPE" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}ACCOUNTTYPE_SINCE_DT" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}ADDRESSLIST" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}CONTACTLIST" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}COO_DT" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}CUSTOMERNAME" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}DATEOFBIRTH" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}EMAILLIST" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}ICCID" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}IMSI" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}MSISDN" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}MSISDN_ACTIVATED_DT" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}MSISDN_REPLACEMENT_DT" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}PHONELIST" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}PORTIN_DT" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}PRICE_PLAN_EFFECTIVE_DATE" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}PRICE_PLAN_NAME" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}RESPONSEDATETIME" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}SERVICEENDDATE" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}SERVICESTATUS" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}SIM_REPLACEMENT_DT" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}STATUS"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "H1UK_IDU_GET_CUSTOMER_OUTPUT")
public class H1UK_IDU_GET_CUSTOMER_OUTPUT {

    @XmlElement(name = "ACCOUNTTYPE")
    protected String accounttype;
    @XmlElement(name = "ACCOUNTTYPE_SINCE_DT")
    protected String accounttypeSINCEDT;
    @XmlElement(name = "ADDRESSLIST")
    protected ADDRESSLIST addresslist;
    @XmlElement(name = "CONTACTLIST")
    protected CONTACTLIST contactlist;
    @XmlElement(name = "COO_DT")
    protected String cooDT;
    @XmlElement(name = "CUSTOMERNAME")
    protected CUSTOMERNAME customername;
    @XmlElement(name = "DATEOFBIRTH")
    protected String dateofbirth;
    @XmlElement(name = "EMAILLIST")
    protected EMAILLIST emaillist;
    @XmlElement(name = "ICCID")
    protected String iccid;
    @XmlElement(name = "IMSI")
    protected String imsi;
    @XmlElement(name = "MSISDN")
    protected MSISDN msisdn;
    @XmlElement(name = "MSISDN_ACTIVATED_DT")
    protected String msisdnACTIVATEDDT;
    @XmlElement(name = "MSISDN_REPLACEMENT_DT")
    protected String msisdnREPLACEMENTDT;
    @XmlElement(name = "PHONELIST")
    protected PHONELIST phonelist;
    @XmlElement(name = "PORTIN_DT")
    protected String portinDT;
    @XmlElement(name = "PRICE_PLAN_EFFECTIVE_DATE")
    protected String pricePLANEFFECTIVEDATE;
    @XmlElement(name = "PRICE_PLAN_NAME")
    protected String pricePLANNAME;
    @XmlElement(name = "RESPONSEDATETIME")
    protected String responsedatetime;
    @XmlElement(name = "SERVICEENDDATE")
    protected String serviceenddate;
    @XmlElement(name = "SERVICESTATUS")
    protected String servicestatus;
    @XmlElement(name = "SIM_REPLACEMENT_DT")
    protected String simREPLACEMENTDT;
    @XmlElement(name = "STATUS", required = true)
    protected STATUS status;

    /**
     * Gets the value of the accounttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTTYPE() {
        return accounttype;
    }

    /**
     * Sets the value of the accounttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTTYPE(String value) {
        this.accounttype = value;
    }

    /**
     * Gets the value of the accounttype_SINCE_DT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTTYPE_SINCE_DT() {
        return accounttypeSINCEDT;
    }

    /**
     * Sets the value of the accounttype_SINCE_DT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTTYPE_SINCE_DT(String value) {
        this.accounttypeSINCEDT = value;
    }

    /**
     * Gets the value of the addresslist property.
     * 
     * @return
     *     possible object is
     *     {@link ADDRESSLIST }
     *     
     */
    public ADDRESSLIST getADDRESSLIST() {
        return addresslist;
    }

    /**
     * Sets the value of the addresslist property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDRESSLIST }
     *     
     */
    public void setADDRESSLIST(ADDRESSLIST value) {
        this.addresslist = value;
    }

    /**
     * Gets the value of the contactlist property.
     * 
     * @return
     *     possible object is
     *     {@link CONTACTLIST }
     *     
     */
    public CONTACTLIST getCONTACTLIST() {
        return contactlist;
    }

    /**
     * Sets the value of the contactlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTACTLIST }
     *     
     */
    public void setCONTACTLIST(CONTACTLIST value) {
        this.contactlist = value;
    }

    /**
     * Gets the value of the coo_DT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOO_DT() {
        return cooDT;
    }

    /**
     * Sets the value of the coo_DT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOO_DT(String value) {
        this.cooDT = value;
    }

    /**
     * Gets the value of the customername property.
     * 
     * @return
     *     possible object is
     *     {@link CUSTOMERNAME }
     *     
     */
    public CUSTOMERNAME getCUSTOMERNAME() {
        return customername;
    }

    /**
     * Sets the value of the customername property.
     * 
     * @param value
     *     allowed object is
     *     {@link CUSTOMERNAME }
     *     
     */
    public void setCUSTOMERNAME(CUSTOMERNAME value) {
        this.customername = value;
    }

    /**
     * Gets the value of the dateofbirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATEOFBIRTH() {
        return dateofbirth;
    }

    /**
     * Sets the value of the dateofbirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATEOFBIRTH(String value) {
        this.dateofbirth = value;
    }

    /**
     * Gets the value of the emaillist property.
     * 
     * @return
     *     possible object is
     *     {@link EMAILLIST }
     *     
     */
    public EMAILLIST getEMAILLIST() {
        return emaillist;
    }

    /**
     * Sets the value of the emaillist property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMAILLIST }
     *     
     */
    public void setEMAILLIST(EMAILLIST value) {
        this.emaillist = value;
    }

    /**
     * Gets the value of the iccid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICCID() {
        return iccid;
    }

    /**
     * Sets the value of the iccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICCID(String value) {
        this.iccid = value;
    }

    /**
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMSI() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMSI(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link MSISDN }
     *     
     */
    public MSISDN getMSISDN() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSISDN }
     *     
     */
    public void setMSISDN(MSISDN value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the msisdn_ACTIVATED_DT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSISDN_ACTIVATED_DT() {
        return msisdnACTIVATEDDT;
    }

    /**
     * Sets the value of the msisdn_ACTIVATED_DT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSISDN_ACTIVATED_DT(String value) {
        this.msisdnACTIVATEDDT = value;
    }

    /**
     * Gets the value of the msisdn_REPLACEMENT_DT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSISDN_REPLACEMENT_DT() {
        return msisdnREPLACEMENTDT;
    }

    /**
     * Sets the value of the msisdn_REPLACEMENT_DT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSISDN_REPLACEMENT_DT(String value) {
        this.msisdnREPLACEMENTDT = value;
    }

    /**
     * Gets the value of the phonelist property.
     * 
     * @return
     *     possible object is
     *     {@link PHONELIST }
     *     
     */
    public PHONELIST getPHONELIST() {
        return phonelist;
    }

    /**
     * Sets the value of the phonelist property.
     * 
     * @param value
     *     allowed object is
     *     {@link PHONELIST }
     *     
     */
    public void setPHONELIST(PHONELIST value) {
        this.phonelist = value;
    }

    /**
     * Gets the value of the portin_DT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPORTIN_DT() {
        return portinDT;
    }

    /**
     * Sets the value of the portin_DT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPORTIN_DT(String value) {
        this.portinDT = value;
    }

    /**
     * Gets the value of the price_PLAN_EFFECTIVE_DATE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICE_PLAN_EFFECTIVE_DATE() {
        return pricePLANEFFECTIVEDATE;
    }

    /**
     * Sets the value of the price_PLAN_EFFECTIVE_DATE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICE_PLAN_EFFECTIVE_DATE(String value) {
        this.pricePLANEFFECTIVEDATE = value;
    }

    /**
     * Gets the value of the price_PLAN_NAME property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICE_PLAN_NAME() {
        return pricePLANNAME;
    }

    /**
     * Sets the value of the price_PLAN_NAME property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICE_PLAN_NAME(String value) {
        this.pricePLANNAME = value;
    }

    /**
     * Gets the value of the responsedatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSEDATETIME() {
        return responsedatetime;
    }

    /**
     * Sets the value of the responsedatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSEDATETIME(String value) {
        this.responsedatetime = value;
    }

    /**
     * Gets the value of the serviceenddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVICEENDDATE() {
        return serviceenddate;
    }

    /**
     * Sets the value of the serviceenddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVICEENDDATE(String value) {
        this.serviceenddate = value;
    }

    /**
     * Gets the value of the servicestatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVICESTATUS() {
        return servicestatus;
    }

    /**
     * Sets the value of the servicestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVICESTATUS(String value) {
        this.servicestatus = value;
    }

    /**
     * Gets the value of the sim_REPLACEMENT_DT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIM_REPLACEMENT_DT() {
        return simREPLACEMENTDT;
    }

    /**
     * Sets the value of the sim_REPLACEMENT_DT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIM_REPLACEMENT_DT(String value) {
        this.simREPLACEMENTDT = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link STATUS }
     *     
     */
    public STATUS getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link STATUS }
     *     
     */
    public void setSTATUS(STATUS value) {
        this.status = value;
    }

	@Override
	public String toString() {
		return "H1UK_IDU_GET_CUSTOMER_OUTPUT [accounttype=" + accounttype + ", accounttypeSINCEDT=" + accounttypeSINCEDT + ", addresslist="
				+ addresslist + ", contactlist=" + contactlist + ", cooDT=" + cooDT + ", customername=" + customername + ", dateofbirth="
				+ dateofbirth + ", emaillist=" + emaillist + ", iccid=" + iccid + ", imsi=" + imsi + ", msisdn=" + msisdn + ", msisdnACTIVATEDDT="
				+ msisdnACTIVATEDDT + ", msisdnREPLACEMENTDT=" + msisdnREPLACEMENTDT + ", phonelist=" + phonelist + ", portinDT=" + portinDT
				+ ", pricePLANEFFECTIVEDATE=" + pricePLANEFFECTIVEDATE + ", pricePLANNAME=" + pricePLANNAME + ", responsedatetime="
				+ responsedatetime + ", serviceenddate=" + serviceenddate + ", servicestatus=" + servicestatus + ", simREPLACEMENTDT="
				+ simREPLACEMENTDT + ", status=" + status + "]";
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public String getAccounttypeSINCEDT() {
		return accounttypeSINCEDT;
	}

	public void setAccounttypeSINCEDT(String accounttypeSINCEDT) {
		this.accounttypeSINCEDT = accounttypeSINCEDT;
	}

	public ADDRESSLIST getAddresslist() {
		return addresslist;
	}

	public void setAddresslist(ADDRESSLIST addresslist) {
		this.addresslist = addresslist;
	}

	public CONTACTLIST getContactlist() {
		return contactlist;
	}

	public void setContactlist(CONTACTLIST contactlist) {
		this.contactlist = contactlist;
	}

	public String getCooDT() {
		return cooDT;
	}

	public void setCooDT(String cooDT) {
		this.cooDT = cooDT;
	}

	public CUSTOMERNAME getCustomername() {
		return customername;
	}

	public void setCustomername(CUSTOMERNAME customername) {
		this.customername = customername;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public EMAILLIST getEmaillist() {
		return emaillist;
	}

	public void setEmaillist(EMAILLIST emaillist) {
		this.emaillist = emaillist;
	}

	public String getIccid() {
		return iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public MSISDN getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(MSISDN msisdn) {
		this.msisdn = msisdn;
	}

	public String getMsisdnACTIVATEDDT() {
		return msisdnACTIVATEDDT;
	}

	public void setMsisdnACTIVATEDDT(String msisdnACTIVATEDDT) {
		this.msisdnACTIVATEDDT = msisdnACTIVATEDDT;
	}

	public String getMsisdnREPLACEMENTDT() {
		return msisdnREPLACEMENTDT;
	}

	public void setMsisdnREPLACEMENTDT(String msisdnREPLACEMENTDT) {
		this.msisdnREPLACEMENTDT = msisdnREPLACEMENTDT;
	}

	public PHONELIST getPhonelist() {
		return phonelist;
	}

	public void setPhonelist(PHONELIST phonelist) {
		this.phonelist = phonelist;
	}

	public String getPortinDT() {
		return portinDT;
	}

	public void setPortinDT(String portinDT) {
		this.portinDT = portinDT;
	}

	public String getPricePLANEFFECTIVEDATE() {
		return pricePLANEFFECTIVEDATE;
	}

	public void setPricePLANEFFECTIVEDATE(String pricePLANEFFECTIVEDATE) {
		this.pricePLANEFFECTIVEDATE = pricePLANEFFECTIVEDATE;
	}

	public String getPricePLANNAME() {
		return pricePLANNAME;
	}

	public void setPricePLANNAME(String pricePLANNAME) {
		this.pricePLANNAME = pricePLANNAME;
	}

	public String getResponsedatetime() {
		return responsedatetime;
	}

	public void setResponsedatetime(String responsedatetime) {
		this.responsedatetime = responsedatetime;
	}

	public String getServiceenddate() {
		return serviceenddate;
	}

	public void setServiceenddate(String serviceenddate) {
		this.serviceenddate = serviceenddate;
	}

	public String getServicestatus() {
		return servicestatus;
	}

	public void setServicestatus(String servicestatus) {
		this.servicestatus = servicestatus;
	}

	public String getSimREPLACEMENTDT() {
		return simREPLACEMENTDT;
	}

	public void setSimREPLACEMENTDT(String simREPLACEMENTDT) {
		this.simREPLACEMENTDT = simREPLACEMENTDT;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

}
