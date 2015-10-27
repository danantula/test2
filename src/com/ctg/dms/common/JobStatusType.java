/**
 * 
 */
package com.ctg.dms.common;


public enum JobStatusType{
	JOB_NEW("JOB_NEW"),
	JOB_RUNNING("JOB_RUNNING"),
	JOB_READY_TO_TRANSFORM("JOB_READY_TO_TRANSFORM"),

	JOB_QUEUED_FOR_TRANSFORMATION("JOB_QUEUED_FOR_TRANSFORMATION"),
	JOB_TRANSFORM("JOB_TRANSFORM"),
	JOB_DONE("JOB_DONE"),

	JOB_FAILED("JOB_FAILED"),
	JOB_FAILED_AUTO_RETRY("JOB_FAILED_AUTO_RETRY"),
	JOB_KILLED("JOB_KILLED"),
	JOB_CLOSED("JOB_CLOSED");
	
	private String refDataType;
	private JobStatusType(String refDataType){
		this.refDataType = refDataType;
	}
	public long getId() {
		return new Long(0).longValue();
		//return RefDataMapping.getInstance().getRefDataId(refDataType);
	}
	public String getRefDataType() {
		return refDataType;
	}
	public String getValue() {
		return refDataType.toString();
		//return RefDataMapping.getInstance().getRefObjectForType(refDataType).getValue();
	}
	public static JobStatusType fromRefDataType(String refDataType){
		for (JobStatusType type : values()) {
			if(type.refDataType.equals(refDataType)){
				return type;
			}
		}
		return null;
	}
	public static JobStatusType fromId(long id){
		for (JobStatusType type : values()) {
			if(type.getId() == id){
				return type;
			}
		}
		return null;
	}
}