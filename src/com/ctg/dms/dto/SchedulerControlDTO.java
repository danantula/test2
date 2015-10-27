package com.ctg.dms.dto;

import java.util.Calendar;

import com.ctg.dms.dto.validator.DtoValidationException;
import com.ctg.dms.dto.validator.DtoValidationSource;

public final class SchedulerControlDTO extends BaseDTO{
	
	private static final long serialVersionUID = 1L;
	private Long schedulerCtrlId;
	private String type;
	private String value;
	private String description;
	private String createdBy;
	private Calendar createdOn;
	private String amendedBy;
	private Calendar amendedOn;
	
	public SchedulerControlDTO() {
	}
	
	public SchedulerControlDTO(String interfaceType){
		type = interfaceType;
	}
	
	public Long getSchedulerCtrlId() {
		return schedulerCtrlId;
	}
	public void setSchedulerCtrlId(Long schedulerCtrlId) {
		this.schedulerCtrlId = schedulerCtrlId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Calendar getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Calendar createdOn) {
		this.createdOn = createdOn;
	}
	public String getAmendedBy() {
		return amendedBy;
	}
	public void setAmendedBy(String amendedBy) {
		this.amendedBy = amendedBy;
	}
	public Calendar getAmendedOn() {
		return amendedOn;
	}
	public void setAmendedOn(Calendar amendedOn) {
		this.amendedOn = amendedOn;
	}

	@Override
	public void validateCommons() throws DtoValidationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validateBusiness() throws DtoValidationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validateSourceSpecific() throws DtoValidationException {
		// TODO Auto-generated method stub
		
	}

}
