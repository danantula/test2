package com.ctg.dms.srqType.data;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateRange")
public class DateRange {

	@XmlElement(required = true)
	protected ArrayList<ScriptType> scriptType;

	public ArrayList<ScriptType> getScriptType() {
		return scriptType;
	}

	public void setScriptType(ArrayList<ScriptType> scriptType) {
		this.scriptType = scriptType;
	}
			
}
