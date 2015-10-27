package com.ctg.dms.common;

import java.io.Serializable;

public class DataDictionaryItem implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7190078688692682047L;
	private String sortOrder;
	private String description;
	private String attribute;
	private String xmlColumn;
	
	public String getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	public String getXmlColumn() {
		return xmlColumn;
	}
	public void setXmlColumn(String xmlColumn) {
		this.xmlColumn = xmlColumn;
	}
	
}
