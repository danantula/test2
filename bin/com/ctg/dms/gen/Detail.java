package com.ctg.dms.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Detail {

	@XmlAttribute(required = true)
	protected String name;
	
	@XmlElement(required = true)
	protected String detailParameter ;
	
	@XmlElement(required = true)
	protected String hintText ;
	
	@XmlElement(required = true)
	protected String validations ;
	
	@XmlElement(required = false)
	protected String decoder ;
	
	@XmlElement(required = false)
	protected DateRange dateRange_YES ;
	
	@XmlElement(required = false)
	protected DateRange dateRange_NO ;
	
	@XmlElement(required = false)
	protected DateRange dateRange_DT ; //single date time.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetailParameter() {
		return detailParameter;
	}

	public void setDetailParameter(String detailParameter) {
		this.detailParameter = detailParameter;
	}

	public String getHintText() {
		return hintText;
	}

	public void setHintText(String hintText) {
		this.hintText = hintText;
	}

	public String getValidations() {
		return validations;
	}

	public void setValidations(String validations) {
		this.validations = validations;
	}

	public DateRange getDateRange_YES() {
		return dateRange_YES;
	}

	public void setDateRange_YES(DateRange dateRange_YES) {
		this.dateRange_YES = dateRange_YES;
	}

	public DateRange getDateRange_NO() {
		return dateRange_NO;
	}

	public void setDateRange_NO(DateRange dateRange_NO) {
		this.dateRange_NO = dateRange_NO;
	}

	public String getDecoder() {
		return decoder;
	}

	public void setDecoder(String decoder) {
		this.decoder = decoder;
	}
	
	public DateRange getDateRange_DT() {
		return dateRange_DT;
	}

	public void setDateRange_DT(DateRange dateRange_DT) {
		this.dateRange_DT = dateRange_DT;
	}	
	
}
