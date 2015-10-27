package com.ctg.dms.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Column {

	@XmlAttribute(required = true)
	protected String name;
	
	/*
	 * This is xpath in RDHI.
	 */
	@XmlAttribute(required = false)
	protected String rdhiXpath;
	
	/*
	 * Whether this column is a mandatory column.
	 */
	@XmlAttribute(required = true)
	protected boolean mandatory;
	
	/*
	 * This is the path under DMSData where data is available.
	 */
	@XmlAttribute(required = true)
	protected String dotWalkPath;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRdhiXpath() {
		return rdhiXpath;
	}

	public void setRdhiXpath(String xpath) {
		this.rdhiXpath = xpath;
	}

	public boolean isMandatory() {
		return mandatory;
	}

	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}

	public String getDotWalkPath() {
		return dotWalkPath;
	}

	public void setDotWalkPath(String dotWalkPath) {
		this.dotWalkPath = dotWalkPath;
	}
	
	
	
}
