package com.ctg.dms.dto.validator;


public class ValidationError {

	private String key;
	private String value;
	private String suffix;
	public ValidationError(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
	public String getKey() {
		return key;
	}
	public String getValue() {
		return value;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	@Override
	public String toString() {
		return "ValidationError [key=" + key + ", value=" + value + "]";
	}
	
	
}
