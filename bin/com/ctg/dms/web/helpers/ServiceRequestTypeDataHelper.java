package com.ctg.dms.web.helpers;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.util.LabelValueBean;
import org.springframework.core.io.ClassPathResource;

import com.ctg.dms.common.DateRangeType;
import com.ctg.dms.srqType.data.Column;
import com.ctg.dms.srqType.data.ColumnsGroup;
import com.ctg.dms.srqType.data.Detail;
import com.ctg.dms.srqType.data.ScriptType;
import com.ctg.dms.srqType.data.ServiceRequestTypeData;

public class ServiceRequestTypeDataHelper {

	private static Unmarshaller unmarshaller;

	private static ServiceRequestTypeData serviceRequestTypeData;

	private static List<String> xpaths;

	private static Map<String, List<Column>> columnsGroupMap;

	public final void setUnmarshaller(Unmarshaller unmarshaller) {
		this.unmarshaller = unmarshaller;
	}

	public static ServiceRequestTypeData loadOtherDetailsXML() {
		if (serviceRequestTypeData != null)
			return serviceRequestTypeData;
		try {
			InputStream is=new ClassPathResource("serviceRequestTypeData.xml").getInputStream();
			serviceRequestTypeData = (ServiceRequestTypeData) unmarshaller.unmarshal(is);
		} catch (JAXBException e) {
			throw new RuntimeException("error unmarshalling serviceRequestTypeData.xml", e);
		}
		catch(Exception ex)
		{	ex.printStackTrace();
			throw new RuntimeException("error unmarshalling serviceRequestTypeData.xml", ex);}
		return serviceRequestTypeData;
	}

	public static List<Column> getColumsList(String columnGroupName) {
		if (StringUtils.isEmpty(columnGroupName))
			return null;
		if (columnsGroupMap == null) {
			columnsGroupMap = new HashMap<String, List<Column>>();
			ServiceRequestTypeData odd = loadOtherDetailsXML();
			if (odd!=null){
			for (ColumnsGroup cg : odd.getColumnsGroup()) {
				columnsGroupMap.put(cg.getName(), cg.getColumn());
			}
		}
		}
		return columnsGroupMap.get(columnGroupName);
	}
	
	public static List<Column> getColumnDetails(String commaSeparatedColumnNames,String columnGroupName){
		List<Column> cols = getColumsList(columnGroupName);
		List<Column> retList = new ArrayList<Column>();
		for (Column col : cols){
			if (commaSeparatedColumnNames.indexOf(col.getName())!=-1)
				retList.add(col);
		}
		
		return retList;
	}

	public static List<Column> getOptionalColumsList(String columnGroupName) {
		if (StringUtils.isEmpty(columnGroupName))
			return null;
		
		List<Column> full = getColumsList(columnGroupName);
		List<Column> retList = new ArrayList<Column>();
		if (full!=null && !full.isEmpty()){	
			for (Column t : full) {
				if (!t.isMandatory())
					retList.add(t);
			}
		}
		return retList;
	}

	public static ScriptType getScriptType(String detailParameter, DateRangeType dateRange, String scriptTypeName) {
		ServiceRequestTypeData odd = loadOtherDetailsXML();
		for (Detail d : odd.getDetail()) {
			if (d.getDetailParameter().equalsIgnoreCase(detailParameter)) {
				if (dateRange.equals(DateRangeType.DATE_RANGE_YES)) {
					if (d.getDateRange_YES() != null && d.getDateRange_YES().getScriptType() != null) {
						for (ScriptType s : d.getDateRange_YES().getScriptType()) {
							if (s.getName().equalsIgnoreCase(scriptTypeName))
								return s;
						}
					}
				} else if (dateRange.equals(DateRangeType.DATE_RANGE_DATE_TIME)) {
					if (d.getDateRange_DT() != null && d.getDateRange_DT().getScriptType() != null) {
						for (ScriptType s : d.getDateRange_YES().getScriptType()) {
							if (s.getName().equalsIgnoreCase(scriptTypeName))
								return s;
						}
					}
				} else {
					if (d.getDateRange_NO() != null && d.getDateRange_NO().getScriptType() != null) {
						for (ScriptType s : d.getDateRange_NO().getScriptType()) {
							if (s.getName().equalsIgnoreCase(scriptTypeName))
								return s;
						}
					}
				}
			}

		}
		return null;
	}

	public static List<Column> getMandatoryColumsList(String columnGroupName) {
		List<Column> full = getColumsList(columnGroupName);
		List<Column> retList = new ArrayList<Column>();
		if (full != null && !full.isEmpty()) {
			for (Column t : full) {
				if (t.isMandatory())
					retList.add(t);
			}
		}
		return retList;
	}

	public static String getOtherDetailHintText(String detailParameter) {
		ServiceRequestTypeData odd = loadOtherDetailsXML();
		for (Detail d : odd.getDetail()) {
			if (d.getDetailParameter().equalsIgnoreCase(detailParameter))
				return d.getHintText();
		}
		return "";
	}
	

	public static List<LabelValueBean> getScriptTypes(String detailParameter, DateRangeType dateRange) {
		ServiceRequestTypeData odd = loadOtherDetailsXML();
		for (Detail d : odd.getDetail()) {
			if (d.getDetailParameter().equalsIgnoreCase(detailParameter)) {
				if (dateRange.equals(DateRangeType.DATE_RANGE_YES)) {
					if (d.getDateRange_YES() != null && d.getDateRange_YES().getScriptType() != null)
						return genScriptTypes(d.getDateRange_YES().getScriptType());
				} else if (dateRange.equals(DateRangeType.DATE_RANGE_DATE_TIME)) {
					if (d.getDateRange_DT() != null && d.getDateRange_DT().getScriptType() != null)
						return genScriptTypes(d.getDateRange_DT().getScriptType());
				} else {
					if (d.getDateRange_NO() != null && d.getDateRange_NO().getScriptType() != null)
						return genScriptTypes(d.getDateRange_NO().getScriptType());
				}
			}

		}
		return genScriptTypes(new ArrayList<ScriptType>());
	}

	private static List<LabelValueBean> genScriptTypes(ArrayList<ScriptType> types) {
		List<LabelValueBean> ret = new ArrayList<LabelValueBean>();
		for (ScriptType s : types) {
			ret.add(new LabelValueBean(s.getName(), s.getName()));
		}
		//adding a type called other.
		ret.add(new LabelValueBean("OTHER", "OTHER"));
		return ret;
	}

	public static String getRdhiQuestion(String detailParameter, DateRangeType dateRange, String scriptType) {
		if (StringUtils.isNotEmpty(scriptType)) {
			ServiceRequestTypeData odd = loadOtherDetailsXML();
			for (Detail d : odd.getDetail()) {
				if (d.getDetailParameter().equalsIgnoreCase(detailParameter)) {
					if (dateRange.equals(DateRangeType.DATE_RANGE_YES)) {
						if (d.getDateRange_YES() != null && d.getDateRange_YES().getScriptType() != null) {
							for (ScriptType s : d.getDateRange_YES().getScriptType()) {
								if (s.getName().equalsIgnoreCase(scriptType))
									return s.getRdhiQuestion();
							}
						}
					}else if (dateRange.equals(DateRangeType.DATE_RANGE_DATE_TIME)) {
						if (d.getDateRange_DT() != null && d.getDateRange_DT().getScriptType() != null) {
							for (ScriptType s : d.getDateRange_DT().getScriptType()) {
								if (s.getName().equalsIgnoreCase(scriptType))
									return s.getRdhiQuestion();
							}
						}
					} else {
						if (d.getDateRange_NO() != null && d.getDateRange_NO().getScriptType() != null) {
							for (ScriptType s : d.getDateRange_NO().getScriptType()) {
								if (s.getName().equalsIgnoreCase(scriptType))
									return s.getRdhiQuestion();
							}
						}
					}
				}

			}
		}
		return null;
	}

	
	public static List<String> getAllDetailXpaths() {
		if (xpaths == null) {
			xpaths = new ArrayList<String>();
			ServiceRequestTypeData odd = loadOtherDetailsXML();
			for (Detail d : odd.getDetail()) {
				if (d.getDateRange_NO() != null) {
					for (ScriptType s : d.getDateRange_NO().getScriptType()) {
						if (StringUtils.isNotEmpty(s.getJaxPath()) && !xpaths.contains(s.getJaxPath()))
							xpaths.add(s.getJaxPath());
					}
				}
				if (d.getDateRange_YES() != null) {
					for (ScriptType s : d.getDateRange_YES().getScriptType()) {
						if (StringUtils.isNotEmpty(s.getJaxPath()) && !xpaths.contains(s.getJaxPath()))
							xpaths.add(s.getJaxPath());
					}
				}
				if (d.getDateRange_DT() != null) {
					for (ScriptType s : d.getDateRange_DT().getScriptType()) {
						if (StringUtils.isNotEmpty(s.getJaxPath()) && !xpaths.contains(s.getJaxPath()))
							xpaths.add(s.getJaxPath());
					}
				}
			}

		}
		return xpaths;
	}

	public static List<Detail> getDetailsUsingXpath(String xpath) {
		List<Detail> ret = new ArrayList<Detail>();
		
		Set<Detail> set = new HashSet<Detail>(); 

		ServiceRequestTypeData odd = loadOtherDetailsXML();
		for (Detail d : odd.getDetail()) {
			if (d.getDateRange_NO() != null) {
				for (ScriptType s : d.getDateRange_NO().getScriptType()) {
					if (StringUtils.isNotEmpty(s.getJaxPath()) && xpath.equals(s.getJaxPath()))
						set.add(d);
				}
			}
			if (d.getDateRange_YES() != null) {
				for (ScriptType s : d.getDateRange_YES().getScriptType()) {
					if (StringUtils.isNotEmpty(s.getJaxPath()) && xpath.equals(s.getJaxPath()))
						set.add(d);
				}
			}
			if (d.getDateRange_DT() != null) {
				for (ScriptType s : d.getDateRange_DT().getScriptType()) {
					if (StringUtils.isNotEmpty(s.getJaxPath()) && xpath.equals(s.getJaxPath()))
						set.add(d);
				}
			}
		}
		ret.addAll(set);
		return ret;
	}

	public static String[] getColumnNames(List<Column> cols) {
		List<String> ret = new ArrayList<String>();
		if (cols != null && !cols.isEmpty()) {
			for (Column c : cols) {
				ret.add(c.getName());
			}
		}
		if (ret.isEmpty())
			return null;
		return  ret.toArray(new String[ret.size()]);
	}

	public static String[] getChosenColumsLeavingMandatoryOnes(List<String> chosenList, String columnGroupName) {
		List<String> mandatory = Arrays.asList(getColumnNames(getMandatoryColumsList(columnGroupName)));
		List<String> retList = new ArrayList<String>();
		if (chosenList != null && !chosenList.isEmpty()) {
			for (String s : chosenList) {
				if (!mandatory.contains(s))
					retList.add(s);
			}
		}
		if (retList.isEmpty())
			return null;
		return retList.toArray(new String[retList.size()]);
	}

	public static String[] getOptionalColumsLeavingChosenOnes(List<String> chosenList, String columnGroupName) {
		List<String> tempList = Arrays.asList(getColumnNames(getOptionalColumsList(columnGroupName)));
		List<String> alloptional = new ArrayList<String>();
		alloptional.addAll(tempList);
		
		if (chosenList != null && !chosenList.isEmpty()) {
			for (String s : chosenList) {
				alloptional.remove(s);
			}
		}
		if (alloptional == null || alloptional.isEmpty())
			return null;
		return alloptional.toArray(new String[alloptional.size()]);
	}
	
	public static boolean listContainsValue(List<LabelValueBean> list, String value){
		if (list==null || list.isEmpty())
			return false;
		for (LabelValueBean l : list){
			if (l.getValue().equalsIgnoreCase(value))
				return true;
		}
		return false;
	}
}
