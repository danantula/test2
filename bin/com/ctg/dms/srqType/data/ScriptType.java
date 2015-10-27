package com.ctg.dms.srqType.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Detail")
public class ScriptType {

	@XmlAttribute(required = true)
	protected String name;
	
	@XmlAttribute(required = false)
	protected String jaxPath;
	
	@XmlAttribute(required = false)
	protected String rdhiQuestion;
	
	@XmlAttribute(required = false)
	protected String period;
	
	@XmlAttribute(required = false)
	protected String columnsGroup;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJaxPath() {
		return jaxPath;
	}

	public void setJaxPath(String xpath) {
		this.jaxPath = xpath;
	}

	public String getRdhiQuestion() {
		return rdhiQuestion;
	}

	public void setRdhiQuestion(String rdhiQuestion) {
		this.rdhiQuestion = rdhiQuestion;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getColumnsGroup() {
		return columnsGroup;
	}

	public void setColumnsGroup(String columnsGroup) {
		this.columnsGroup = columnsGroup;
	}	
	
}
