package com.ctg.dms.exception;

import org.apache.log4j.Logger;

public class DateConversionException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3714514164844487302L;
	private static final Logger log = Logger.getLogger(DateConversionException.class);
	private String info;

	
	public  DateConversionException(String info) {
		this.info = info ;
		log.error("Date Conversion Exception :" + info );		
	}
	
	public  DateConversionException(String info, Exception ex) {
		super(ex);
		this.info = info ;
		log.error("Date Conversion Exception :" + info + ex.getMessage());		
	}

	public String getInfo() {
		return info;
	}
}
