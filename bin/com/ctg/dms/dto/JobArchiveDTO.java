package com.ctg.dms.dto;

import java.util.Calendar;

import com.ctg.dms.dto.validator.DtoValidationException;
import com.ctg.dms.dto.validator.DtoValidationSource;

public class JobArchiveDTO extends BaseDTO {
	
	private Long jobArchiveId;
	private Long idJobDetails;
	private String jobRef;
	private Long reqId;
	private String reqRef;
	private String scriptName;
	private Calendar createdOn;
	private Calendar processStartedOn;
	private Calendar processStoppedOn;
	private Calendar intoTransform;
	private Calendar transformStoppedOn;
	private String status;
	private String fulfillmentMethod;
	private String queueType;
	private byte[] jobEvents;
	private int retries;
	private int reruns;
	private boolean isTranformedOne;
	
	
	public Calendar getTransformStoppedOn() {
		return transformStoppedOn;
	}
	public void setTransformStoppedOn(Calendar transformStoppedOn) {
		this.transformStoppedOn = transformStoppedOn;
	}
	public Long getIdJobDetails() {
		return idJobDetails;
	}
	public void setIdJobDetails(Long idJobDetails) {
		this.idJobDetails = idJobDetails;
	}
	public Long getJobArchiveId() {
		return jobArchiveId;
	}
	public void setJobArchiveId(Long jobId) {
		this.jobArchiveId = jobId;
	}
	public String getJobRef() {
		return jobRef;
	}
	public void setJobRef(String jobRef) {
		this.jobRef = jobRef;
	}
	public Long getReqId() {
		return reqId;
	}
	public void setReqId(Long reqId) {
		this.reqId = reqId;
	}
	public String getReqRef() {
		return reqRef;
	}
	public void setReqRef(String reqRef) {
		this.reqRef = reqRef;
	}
	public String getScriptName() {
		return scriptName;
	}
	public void setScriptName(String scriptName) {
		this.scriptName = scriptName;
	}
	public Calendar getIntoTransform() {
		return intoTransform;
	}
	public void setIntoTransform(Calendar intoTransform) {
		this.intoTransform = intoTransform;
	}
	public Calendar getProcessStartedOn() {
		return processStartedOn;
	}
	public void setProcessStartedOn(Calendar processStartedOn) {
		this.processStartedOn = processStartedOn;
	}
	public Calendar getProcessStoppedOn() {
		return processStoppedOn;
	}
	public void setProcessStoppedOn(Calendar processStoppedOn) {
		this.processStoppedOn = processStoppedOn;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFulfillmentMethod() {
		return fulfillmentMethod;
	}
	public void setFulfillmentMethod(String fulfillmentMethod) {
		this.fulfillmentMethod = fulfillmentMethod;
	}
	public String getQueueType() {
		return queueType;
	}
	public void setQueueType(String queueType) {
		this.queueType = queueType;
	}
	public byte[] getJobEvents() {
		return jobEvents;
	}
	public void setJobEvents(byte[] jobEvents) {
		this.jobEvents = jobEvents;
	}
	public int getRetries() {
		return retries;
	}
	public void setRetries(int retries) {
		this.retries = retries;
	}
	public int getReruns() {
		return reruns;
	}
	public void setReruns(int reruns) {
		this.reruns = reruns;
	}
	public boolean isTranformedOne() {
		return isTranformedOne;
	}
	public void setTranformedOne(boolean isTranformedOne) {
		this.isTranformedOne = isTranformedOne;
	}
	public Calendar getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Calendar createdOn) {
		this.createdOn = createdOn;
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
