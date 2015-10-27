
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
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}ADDRESSLINE1" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}ADDRESSLINE2" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}ADDRESS_END_DT" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}ADDRESS_START_DT" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}COUNTRY" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}COUNTY" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}FLATNUMBER" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}HOUSENAME" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}HOUSENUMBER" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}POSTCODE" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}PRIMARY" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}PURPOSE_TYPE" minOccurs="0"/>
 *         &lt;element ref="{http://www.three.co.uk/midus/getcustomerdetails/bw/responseschema}TOWN" minOccurs="0"/>
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
@XmlRootElement(name = "ADDRESS")
public class ADDRESS {

    @XmlElement(name = "ADDRESSLINE1")
    protected String addressline1;
    @XmlElement(name = "ADDRESSLINE2")
    protected String addressline2;
    @XmlElement(name = "ADDRESS_END_DT")
    protected String addressENDDT;
    @XmlElement(name = "ADDRESS_START_DT")
    protected String addressSTARTDT;
    @XmlElement(name = "COUNTRY")
    protected String country;
    @XmlElement(name = "COUNTY")
    protected String county;
    @XmlElement(name = "FLATNUMBER")
    protected String flatnumber;
    @XmlElement(name = "HOUSENAME")
    protected String housename;
    @XmlElement(name = "HOUSENUMBER")
    protected String housenumber;
    @XmlElement(name = "POSTCODE")
    protected String postcode;
    @XmlElement(name = "PRIMARY")
    protected String primary;
    @XmlElement(name = "PURPOSE_TYPE")
    protected String purposeTYPE;
    @XmlElement(name = "TOWN")
    protected String town;

    /**
     * Gets the value of the addressline1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESSLINE1() {
        return addressline1;
    }

    /**
     * Sets the value of the addressline1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESSLINE1(String value) {
        this.addressline1 = value;
    }

    /**
     * Gets the value of the addressline2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESSLINE2() {
        return addressline2;
    }

    /**
     * Sets the value of the addressline2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESSLINE2(String value) {
        this.addressline2 = value;
    }

    /**
     * Gets the value of the address_END_DT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESS_END_DT() {
        return addressENDDT;
    }

    /**
     * Sets the value of the address_END_DT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESS_END_DT(String value) {
        this.addressENDDT = value;
    }

    /**
     * Gets the value of the address_START_DT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESS_START_DT() {
        return addressSTARTDT;
    }

    /**
     * Sets the value of the address_START_DT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESS_START_DT(String value) {
        this.addressSTARTDT = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRY() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRY(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTY() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTY(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the flatnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLATNUMBER() {
        return flatnumber;
    }

    /**
     * Sets the value of the flatnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLATNUMBER(String value) {
        this.flatnumber = value;
    }

    /**
     * Gets the value of the housename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOUSENAME() {
        return housename;
    }

    /**
     * Sets the value of the housename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOUSENAME(String value) {
        this.housename = value;
    }

    /**
     * Gets the value of the housenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOUSENUMBER() {
        return housenumber;
    }

    /**
     * Sets the value of the housenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOUSENUMBER(String value) {
        this.housenumber = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTCODE() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTCODE(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIMARY() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIMARY(String value) {
        this.primary = value;
    }

    /**
     * Gets the value of the purpose_TYPE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPURPOSE_TYPE() {
        return purposeTYPE;
    }

    /**
     * Sets the value of the purpose_TYPE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPURPOSE_TYPE(String value) {
        this.purposeTYPE = value;
    }

    /**
     * Gets the value of the town property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOWN() {
        return town;
    }

    /**
     * Sets the value of the town property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOWN(String value) {
        this.town = value;
    }

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getAddressENDDT() {
		return addressENDDT;
	}

	public void setAddressENDDT(String addressENDDT) {
		this.addressENDDT = addressENDDT;
	}

	public String getAddressSTARTDT() {
		return addressSTARTDT;
	}

	public void setAddressSTARTDT(String addressSTARTDT) {
		this.addressSTARTDT = addressSTARTDT;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getFlatnumber() {
		return flatnumber;
	}

	public void setFlatnumber(String flatnumber) {
		this.flatnumber = flatnumber;
	}

	public String getHousename() {
		return housename;
	}

	public void setHousename(String housename) {
		this.housename = housename;
	}

	public String getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPrimary() {
		return primary;
	}

	public void setPrimary(String primary) {
		this.primary = primary;
	}

	public String getPurposeTYPE() {
		return purposeTYPE;
	}

	public void setPurposeTYPE(String purposeTYPE) {
		this.purposeTYPE = purposeTYPE;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

}
