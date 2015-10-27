/**
 * 
 */
package com.ctg.dms.common;

import org.apache.commons.lang.StringUtils;

import com.ctg.dms.dao.impl.sql.COMMON_CONSTANTS;


public enum DateRangeType{
	DATE_RANGE_YES("Y"),
	DATE_RANGE_DATE_TIME("D"),
	DATE_RANGE_NO("N");
	
	private String dbValue;
	
	private DateRangeType(String dbVal){
		this.setDbValue(dbVal);
	}

	public void setDbValue(String dbVal) {
		this.dbValue = dbVal;
	}

	public String getDbValue() {
		return dbValue;
	}
	
	public static DateRangeType fromDbValue(String val){
		if (StringUtils.isEmpty(val))
			return DATE_RANGE_NO;
		val = val.trim() ;
		for (DateRangeType type : values()) {
			if(type.dbValue.equals(val)){
				return type;
			}
		}
		return null;
	}
	
	public static DateRangeType fromUIValue(String val){
		if (StringUtils.isEmpty(val) || val.equals(COMMON_CONSTANTS.DROPDOWN_SELECT_NO))
			return DATE_RANGE_NO;
		else if (StringUtils.isEmpty(val) || val.equals(COMMON_CONSTANTS.DROPDOWN_SELECT_YES))
			return DATE_RANGE_YES;
		else
			return DATE_RANGE_DATE_TIME ;
		
	}
	
}