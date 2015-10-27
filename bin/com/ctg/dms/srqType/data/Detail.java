package com.ctg.dms.srqType.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import org.springframework.util.StringUtils;

@XmlAccessorType(XmlAccessType.FIELD)
public class Detail {

	@XmlAttribute(required = true)
	protected String name;
	
	@XmlElement(required = true)
	protected String detailParameter ;
	
	@XmlElement(required = true)
	protected String detailLabel ;

	@XmlElement(required = true)
	protected String hintText ;
	
	@XmlElement(required = true)
	protected String validations ;
	
	@XmlElement(required = false)
	protected String businessValidations ;
	
	@XmlElement(required = false)
	protected String decoder ;
	
	@XmlElement(required = false)
	protected DateRange dateRange_YES ;
	
	@XmlElement(required = false)
	protected DateRange dateRange_NO ;
	
	@XmlElement(required = false)
	protected DateRange dateRange_DT ; //single date time.

	@XmlElement(required = false)
	private List<String> detailNamesList;
	
	@XmlElement(required = false)
	private List<String> detailValidationsList;
	
	@XmlElement(required = false)
	private List<String> regex;
	
	@XmlElement(required = false)
	private List<String> validationMsg;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	public String getDetailParameter() {
		return detailParameter;
	}

	public void setDetailParameter(String detailParameter) {
		this.detailParameter = detailParameter;
	}

	public DateRange getDateRange_DT() {
		return dateRange_DT;
	}

	public void setDateRange_DT(DateRange dateRange_DT) {
		this.dateRange_DT = dateRange_DT;
	}
	
	public List<String> getRegex() {
		return regex;
	}

	public void setRegex(List<String> regex) {
		this.regex = regex;
	}
	
	

	public List<String> getValidationMsg() {
		return validationMsg;
	}

	public void setValidationMsg(List<String> validationMsg) {
		this.validationMsg = validationMsg;
	}

	@Override
	public boolean equals(Object obj) {
		Detail obj1 = (Detail)obj ;
		if (this.name.equals(obj1.getName()))
			return true;
		return false;
	}

	public List<String> getDetailNamesList() {
		if (detailNamesList == null || detailNamesList.isEmpty()){
			setDetailNamesList(Arrays.asList(StringUtils.delimitedListToStringArray(this.detailParameter, ",")));
		}
		return detailNamesList;
	}

	public void setDetailNamesList(List<String> detailNamesList) {
		if (getDetailParameter() != null && !getDetailParameter().isEmpty()){
			this.detailNamesList = new ArrayList<String>(Arrays.asList(StringUtils.delimitedListToStringArray(getDetailParameter(), ",")));
			return;
		}
		
		this.detailNamesList = detailNamesList;
	}

	public List<String> getDetailValidationsList() {
		if (detailValidationsList == null || detailValidationsList.isEmpty()){
			setDetailValidationsList(Arrays.asList(StringUtils.delimitedListToStringArray(this.validations, ",")));
		}
		return detailValidationsList;
	}

	protected void setDetailValidationsList(List<String> detailValidationsList) {
		if (getValidations() != null && !getValidations().isEmpty()){
			this.detailValidationsList = new ArrayList<String>(Arrays.asList(StringUtils.delimitedListToStringArray(getValidations(), ",")));
			return;
		}
		this.detailValidationsList = detailValidationsList;
	}

	public String getDetailLabel() {
		return detailLabel;
	}

	public void setDetailLabel(String detailLabel) {
		this.detailLabel = detailLabel;
	}

	public String getBusinessValidations() {
		return businessValidations;
	}

	public void setBusinessValidations(String businessValidations) {
		this.businessValidations = businessValidations;
	}
	
	
}
