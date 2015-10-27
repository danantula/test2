package com.ctg.dms.srqType.data;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ServiceRequestTypeData")
public class ServiceRequestTypeData {
	
	@XmlElement(required = true)
	protected ArrayList<Detail> Detail;
	
	@XmlElement(required = false)
	protected ArrayList<ColumnsGroup> ColumnsGroup;

	public ArrayList<Detail> getDetail() {
		return Detail;
	}

	public void setDetail(ArrayList<Detail> detail) {
		Detail = detail;
	}

	public ArrayList<ColumnsGroup> getColumnsGroup() {
		return ColumnsGroup;
	}

	public void setColumnsGroup(ArrayList<ColumnsGroup> columsGroup) {
		ColumnsGroup = columsGroup;
	}
}
