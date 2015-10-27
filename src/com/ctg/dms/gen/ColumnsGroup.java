package com.ctg.dms.gen;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnsGroup", propOrder = { "Column" })
public class ColumnsGroup {

	@XmlAttribute(required = true)
	protected String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement(required = false)
	protected ArrayList<Column> Column;


	public ArrayList<Column> getColumn() {
		return Column;
	}

	public void setColumn(ArrayList<Column> column) {
		Column = column;
	}
	
}
