package com.ctg.dms.dto.validator;

public enum DtoValidationSource {
	
	SOURCE_RDHI("SOURCE_RDHI"),
	SOURCE_WEB("SOURCE_WEB"),
	SOURCE_MANGO("SOURCE_MANGO");
	 
	private String source;
	 
	private DtoValidationSource(String source) {
	this.source = source;
	}
	 
	public String getSource() {
	return source;
	}
	 
	public void setSource(String source) {
	this.source = source;
	}
	 

}
