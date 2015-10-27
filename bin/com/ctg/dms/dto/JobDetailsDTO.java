package com.ctg.dms.dto;


import java.util.Arrays;
import java.util.Calendar;

import com.ctg.dms.dao.impl.sql.COMMON_CONSTANTS;


public final class JobDetailsDTO {

	private Long idJobDetails;
	private String jobRef;
	private Calendar createdOn;
	private String queueType;
	private String jobStatus;
	private byte[] jobEvents;
	private boolean killed;
	private int retries;
	private int reran;
	private Calendar processStartedOn;
	private Calendar processStoppedOn;
	private Calendar transformStartedOn;
	private Calendar transformStoppedOn;
	private String jobUrl;
	private String jobProcessorName;
	private Calendar heartBeat;
	private byte[] extraParameters;
	private boolean failure_notified;
	private String failure_message;


	private Long idServiceRequest;
	private String srqReqRef;
	private String srqGrade;
	private String srqDetailParameter;
	private Calendar srqDueByDate;
	private Boolean srqNoDataFound;
	private String srqFileNames;
	private Calendar srqStartDate;
	private Calendar srqEndDate;
	private String srqFulfilmentText;
	private String srqSpocRef;
	private String srqFieldsList;
	private String srqTimeZone;
	private int srqIntGrade;
	private byte[] dataDictionary;
	private String srqRaisedBy;
	
	private Long idAuthorisation;
	private String authSource;
	private String authUrn;
	private String authDesigPerson;
	private Calendar authDate;
	private Calendar authFrom;
	private Calendar authTo;
	private Calendar authCreatedOn;
	private String authSuppDetails;
	private String authPurpose;
	private String authRank;
	
	private Long idAuthority;
	private String authorityName;//short name
	private String authoritySpocUser; //first name + space + last name comes from authorisation
	private Boolean authorityPdfRequired;
	private String authorityApiRef;
	
	private Long idSrqType;
	private String srqtName;
	private String srqtDetailParameter;
	private String srqtDetailLabel;
	private String srqtScriptName;
	private String srqtFulfilmentMethod;
	private byte[] srqtStylesheet;
	private String srqtDateRange;
	private Long   srqtIdServerDetails;
	private String srqtDwhQuery;
	private Long   srqtMaxPDFSize;
	private byte[] srqtRdhiStylesheet;
	private String srqtRetainedTimeZone;
	private ServerDetailsDTO server;
	
	private Long idAuthType;
	private String authTypeName;
	private String authTypeCustom;
	
	private String csvFileName;
	private String pdfFileName;
	private byte[] xmlFileData;
	private byte[] csvFile;
	private byte[] pdfFile;
	private byte[] xmlFile;
	private byte[] responseFile;
	
	private Boolean srqXml;
	private Boolean srqPdf;
	private Boolean srqCsv;
	private Boolean srqJson;
	private String jsonFileName;
	private byte[] jsonFile;
	
	public String getSrqRaisedBy() {
		return srqRaisedBy;
	}
	public void setSrqRaisedBy(String srqRaisedBy) {
		this.srqRaisedBy = srqRaisedBy;
	}
	public String getAuthSuppDetails() {
		return authSuppDetails;
	}
	public void setAuthSuppDetails(String authSuppDetails) {
		this.authSuppDetails = authSuppDetails;
	}
	public String getAuthPurpose() {
		return authPurpose;
	}
	public void setAuthPurpose(String authPurpose) {
		this.authPurpose = authPurpose;
	}
	public String getAuthRank() {
		return authRank;
	}
	public void setAuthRank(String authRank) {
		this.authRank = authRank;
	}
	public String getAuthorityApiRef() {
		return authorityApiRef;
	}
	public void setAuthorityApiRef(String authorityApiRef) {
		this.authorityApiRef = authorityApiRef;
	}
	public Long getIdSrqType() {
		return idSrqType;
	}
	public void setIdSrqType(Long idSrqType) {
		this.idSrqType = idSrqType;
	}
	public Long getIdAuthType() {
		return idAuthType;
	}
	public void setIdAuthType(Long idAuthType) {
		this.idAuthType = idAuthType;
	}
	public boolean isFailure_notified() {
		return failure_notified;
	}
	public void setFailure_notified(boolean failure_notified) {
		this.failure_notified = failure_notified;
	}
	public Long getIdJobDetails() {
		return idJobDetails;
	}
	public void setIdJobDetails(Long idJobDetails) {
		this.idJobDetails = idJobDetails;
	}
	public String getJobRef() {
		return jobRef;
	}
	public void setJobRef(String jobRef) {
		this.jobRef = jobRef;
	}
	public Calendar getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Calendar createdOn) {
		this.createdOn = createdOn;
	}
	public String getQueueType() {
		return queueType;
	}
	public void setQueueType(String queueType) {
		this.queueType = queueType;
	}
	public String getJobStatus() {
		return jobStatus;
	}
	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}
	public byte[] getJobEvents() {
		return jobEvents;
	}
	public void setJobEvents(byte[] jobEvents) {
		this.jobEvents = jobEvents;
	}
	public String getFailure_message() {
		return failure_message;
	}
	public void setFailure_message(String failure_message) {
		this.failure_message = failure_message;
	}
	public String getAuthDesigPerson() {
		return authDesigPerson;
	}
	public void setAuthDesigPerson(String authDesigPerson) {
		this.authDesigPerson = authDesigPerson;
	}

	public String getSrqtRetainedTimeZone() {
		return srqtRetainedTimeZone;
	}
	public void setSrqtRetainedTimeZone(String srqtRetainedTimeZone) {
		this.srqtRetainedTimeZone = srqtRetainedTimeZone;
	}
	
	public boolean isKilled() {
		return killed;
	}
	public void setKilled(boolean killed) {
		this.killed = killed;
	}
	public int getRetries() {
		return retries;
	}
	public void setRetries(int retries) {
		this.retries = retries;
	}
	public int getReran() {
		return reran;
	}
	public Calendar getTransformStoppedOn() {
		return transformStoppedOn;
	}
	public void setTransformStoppedOn(Calendar transformStoppedOn) {
		this.transformStoppedOn = transformStoppedOn;
	}
	public void setReran(int reran) {
		this.reran = reran;
	}
	public Calendar getProcessStartedOn() {
		return processStartedOn;
	}
	public void setProcessStartedOn(Calendar processStartedOn) {
		this.processStartedOn = processStartedOn;
	}
	public Calendar getTransformStartedOn() {
		return transformStartedOn;
	}
	public void setTransformStartedOn(Calendar transformStartedOn) {
		this.transformStartedOn = transformStartedOn;
	}
	public Calendar getProcessStoppedOn() {
		return processStoppedOn;
	}
	public void setProcessStoppedOn(Calendar processStoppedOn) {
		this.processStoppedOn = processStoppedOn;
	}
	public String getJobUrl() {
		return jobUrl;
	}
	public void setJobUrl(String jobUrl) {
		this.jobUrl = jobUrl;
	}
	public String getJobProcessorName() {
		return jobProcessorName;
	}
	public void setJobProcessorName(String jobProcessorName) {
		this.jobProcessorName = jobProcessorName;
	}
	public Calendar getHeartBeat() {
		return heartBeat;
	}
	public void setHeartBeat(Calendar heartBeat) {
		this.heartBeat = heartBeat;
	}
	public byte[] getExtraParameters() {
		return extraParameters;
	}
	public void setExtraParameters(byte[] extraParameters) {
		this.extraParameters = extraParameters;
	}
	public Long getIdServiceRequest() {
		return idServiceRequest;
	}
	public void setIdServiceRequest(Long idServiceRequest) {
		this.idServiceRequest = idServiceRequest;
	}
	public String getSrqReqRef() {
		return srqReqRef;
	}
	public void setSrqReqRef(String srqReqRef) {
		this.srqReqRef = srqReqRef;
	}
	public String getSrqGrade() {
		return srqGrade;
	}
	public void setSrqGrade(String srqGrade) {
		this.srqGrade = srqGrade;
		if(COMMON_CONSTANTS.SRQ_GRADE_G1.equals(srqGrade))
			this.setSrqIntGrade(1);
		if(COMMON_CONSTANTS.SRQ_GRADE_G2.equals(srqGrade))
			this.setSrqIntGrade(2);
		if(COMMON_CONSTANTS.SRQ_GRADE_G3.equals(srqGrade))
			this.setSrqIntGrade(3);
	}
	public String getSrqDetailParameter() {
		return srqDetailParameter;
	}
	public void setSrqDetailParameter(String srqDetailParameter) {
		this.srqDetailParameter = srqDetailParameter;
	}
	public Calendar getSrqDueByDate() {
		return srqDueByDate;
	}
	public void setSrqDueByDate(Calendar srqDueByDate) {
		this.srqDueByDate = srqDueByDate;
	}
	public Boolean getSrqNoDataFound() {
		return srqNoDataFound;
	}
	public void setSrqNoDataFound(Boolean srqNoDataFound) {
		this.srqNoDataFound = srqNoDataFound;
	}
	public String getSrqFileNames() {
		return srqFileNames;
	}
	public void setSrqFileNames(String srqFileNames) {
		this.srqFileNames = srqFileNames;
	}
	public Calendar getSrqStartDate() {
		return srqStartDate;
	}
	public void setSrqStartDate(Calendar srqStartDate) {
		this.srqStartDate = srqStartDate;
	}
	public Calendar getSrqEndDate() {
		return srqEndDate;
	}
	public void setSrqEndDate(Calendar srqEndDate) {
		this.srqEndDate = srqEndDate;
	}
	public String getSrqFulfilmentText() {
		return srqFulfilmentText;
	}
	public void setSrqFulfilmentText(String srqFulfilmentText) {
		this.srqFulfilmentText = srqFulfilmentText;
	}
	public String getSrqSpocRef() {
		return srqSpocRef;
	}
	public void setSrqSpocRef(String srqSpocRef) {
		this.srqSpocRef = srqSpocRef;
	}
	public String getSrqFieldsList() {
		return srqFieldsList;
	}
	public void setSrqFieldsList(String srqFieldsList) {
		this.srqFieldsList = srqFieldsList;
	}
	public String getSrqTimeZone() {
		return srqTimeZone;
	}
	public void setSrqTimeZone(String srqTimeZone) {
		this.srqTimeZone = srqTimeZone;
	}
	public Long getIdAuthorisation() {
		return idAuthorisation;
	}
	public void setIdAuthorisation(Long idAuthorisation) {
		this.idAuthorisation = idAuthorisation;
	}
	public String getAuthSource() {
		return authSource;
	}
	public void setAuthSource(String authSource) {
		this.authSource = authSource;
	}
	public String getAuthUrn() {
		return authUrn;
	}
	public void setAuthUrn(String authUrn) {
		this.authUrn = authUrn;
	}
	public Calendar getAuthDate() {
		return authDate;
	}
	public void setAuthDate(Calendar authDate) {
		this.authDate = authDate;
	}
	public Calendar getAuthFrom() {
		return authFrom;
	}
	public void setAuthFrom(Calendar authFrom) {
		this.authFrom = authFrom;
	}
	public Calendar getAuthTo() {
		return authTo;
	}
	public void setAuthTo(Calendar authTo) {
		this.authTo = authTo;
	}
	public Calendar getAuthCreatedOn() {
		return authCreatedOn;
	}
	public void setAuthCreatedOn(Calendar authCreatedOn) {
		this.authCreatedOn = authCreatedOn;
	}
	public Long getIdAuthority() {
		return idAuthority;
	}
	public void setIdAuthority(Long idAuthority) {
		this.idAuthority = idAuthority;
	}
	public String getAuthorityName() {
		return authorityName;
	}
	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}
	public String getAuthoritySpocUser() {
		return authoritySpocUser;
	}
	public void setAuthoritySpocUser(String authoritySpocUser) {
		this.authoritySpocUser = authoritySpocUser;
	}
	public Boolean getAuthorityPdfRequired() {
		return authorityPdfRequired;
	}
	public void setAuthorityPdfRequired(Boolean authorityPdfRequired) {
		this.authorityPdfRequired = authorityPdfRequired;
	}
	public String getSrqtName() {
		return srqtName;
	}
	public void setSrqtName(String srqtName) {
		this.srqtName = srqtName;
	}
	public String getSrqtDetailParameter() {
		return srqtDetailParameter;
	}
	public void setSrqtDetailParameter(String srqtDetailParameter) {
		this.srqtDetailParameter = srqtDetailParameter;
	}
	public String getSrqtDetailLabel() {
		return srqtDetailLabel;
	}
	public void setSrqtDetailLabel(String srqtDetailLabel) {
		this.srqtDetailLabel = srqtDetailLabel;
	}
	public String getSrqtScriptName() {
		return srqtScriptName;
	}
	public void setSrqtScriptName(String srqtScriptName) {
		this.srqtScriptName = srqtScriptName;
	}
	public String getSrqtFulfilmentMethod() {
		return srqtFulfilmentMethod;
	}
	public void setSrqtFulfilmentMethod(String srqtFulfilmentMethod) {
		this.srqtFulfilmentMethod = srqtFulfilmentMethod;
	}
	public byte[] getSrqtStylesheet() {
		return srqtStylesheet;
	}
	public void setSrqtStylesheet(byte[] srqtStylesheet) {
		this.srqtStylesheet = srqtStylesheet;
	}
	public String getSrqtDateRange() {
		return srqtDateRange;
	}
	public void setSrqtDateRange(String srqtDateRange) {
		this.srqtDateRange = srqtDateRange;
	}
	public Long getSrqtIdServerDetails() {
		return srqtIdServerDetails;
	}
	public void setSrqtIdServerDetails(Long srqtIdServerDetails) {
		this.srqtIdServerDetails = srqtIdServerDetails;
	}
	public String getSrqtDwhQuery() {
		return srqtDwhQuery;
	}
	public void setSrqtDwhQuery(String srqtDwhQuery) {
		this.srqtDwhQuery = srqtDwhQuery;
	}
	public Long getSrqtMaxPDFSize() {
		return srqtMaxPDFSize;
	}
	public void setSrqtMaxPDFSize(Long srqtMaxPDFSize) {
		this.srqtMaxPDFSize = srqtMaxPDFSize;
	}
	public byte[] getSrqtRdhiStylesheet() {
		return srqtRdhiStylesheet;
	}
	public void setSrqtRdhiStylesheet(byte[] srqtRdhiStylesheet) {
		this.srqtRdhiStylesheet = srqtRdhiStylesheet;
	}
	public String getAuthTypeName() {
		return authTypeName;
	}
	public void setAuthTypeName(String authTypeName) {
		this.authTypeName = authTypeName;
	}
	public String getAuthTypeCustom() {
		return authTypeCustom;
	}
	public void setAuthTypeCustom(String authTypeCustom) {
		this.authTypeCustom = authTypeCustom;
	}
	public String getCsvFileName() {
		return csvFileName;
	}
	public void setCsvFileName(String csvFileName) {
		this.csvFileName = csvFileName;
	}
	public String getPdfFileName() {
		return pdfFileName;
	}
	public void setPdfFileName(String pdfFileName) {
		this.pdfFileName = pdfFileName;
	}
	
	public String getJsonFileName() {
		return jsonFileName;
	}
	public void setJsonFileName(String jsonFileName) {
		this.jsonFileName = jsonFileName;
	}
	public byte[] getJsonFile() {
		return jsonFile;
	}
	public void setJsonFile(byte[] jsonFile) {
		this.jsonFile = jsonFile;
	}
	public byte[] getCsvFile() {
		return csvFile;
	}
	public void setCsvFile(byte[] csvFile) {
		this.csvFile = csvFile;
	}
	public byte[] getPdfFile() {
		return pdfFile;
	}
	public void setPdfFile(byte[] pdfFile) {
		this.pdfFile = pdfFile;
	}
	public byte[] getXmlFile() {
		return xmlFile;
	}
	public void setXmlFile(byte[] xmlFile) {
		this.xmlFile = xmlFile;
	}
	public byte[] getResponseFile() {
		return responseFile;
	}
	public void setResponseFile(byte[] responseFile) {
		this.responseFile = responseFile;
	}
	
	public int getSrqIntGrade() {
		return srqIntGrade;
	}
	public void setSrqIntGrade(int srqIntGrade) {
		this.srqIntGrade = srqIntGrade;
	}
	
	
	public byte[] getXmlFileData() {
		return xmlFileData;
	}
	public void setXmlFileData(byte[] xmlFileData) {
		this.xmlFileData = xmlFileData;
	}
	public ServerDetailsDTO getServer() {
		return server;
	}
	public void setServer(ServerDetailsDTO server) {
		this.server = server;
	}
	
	public Boolean getSrqXml() {
		return srqXml;
	}
	public void setSrqXml(Boolean srqXml) {
		this.srqXml = srqXml;
	}
	public Boolean getSrqPdf() {
		return srqPdf;
	}
	public void setSrqPdf(Boolean srqPdf) {
		this.srqPdf = srqPdf;
	}
	public Boolean getSrqCsv() {
		return srqCsv;
	}
	public void setSrqCsv(Boolean srqCsv) {
		this.srqCsv = srqCsv;
	}
	public Boolean getSrqJson() {
		return srqJson;
	}
	public void setSrqJson(Boolean srqJson) {
		this.srqJson = srqJson;
	}
	public byte[] getDataDictionary() {
		return dataDictionary;
	}
	public void setDataDictionary(byte[] dataDictionary) {
		this.dataDictionary = dataDictionary;
	}
	@Override
	public String toString() {
		return "JobDetailsDTO [idJobDetails=" + idJobDetails + ", jobRef="
				+ jobRef + ", createdOn=" + createdOn + ", queueType="
				+ queueType + ", jobStatus=" + jobStatus + ", jobEvents="
				+ Arrays.toString(jobEvents) + ", killed=" + killed
				+ ", retries=" + retries + ", reran=" + reran
				+ ", processStartedOn=" + processStartedOn
				+ ", processStoppedOn=" + processStoppedOn
				+ ", transformStartedOn=" + transformStartedOn
				+ ", transformStoppedOn=" + transformStoppedOn + ", jobUrl="
				+ jobUrl + ", jobProcessorName=" + jobProcessorName
				+ ", heartBeat=" + heartBeat + ", extraParameters="
				+ Arrays.toString(extraParameters) + ", failure_notified="
				+ failure_notified + ", failure_message=" + failure_message
				+ ", idServiceRequest=" + idServiceRequest + ", srqReqRef="
				+ srqReqRef + ", srqGrade=" + srqGrade
				+ ", srqDetailParameter=" + srqDetailParameter
				+ ", srqDueByDate=" + srqDueByDate + ", srqNoDataFound="
				+ srqNoDataFound + ", srqFileNames=" + srqFileNames
				+ ", srqStartDate=" + srqStartDate + ", srqEndDate="
				+ srqEndDate + ", srqFulfilmentText=" + srqFulfilmentText
				+ ", srqSpocRef=" + srqSpocRef + ", srqFieldsList="
				+ srqFieldsList + ", srqTimeZone=" + srqTimeZone
				+ ", srqIntGrade=" + srqIntGrade
				+ ", srqXml=" + srqXml
				+ ", srqPdf=" + srqPdf
				+ ", srqCsv=" + srqCsv
				+ ", srqJson=" + srqJson
				+ ", idAuthorisation="
				+ idAuthorisation + ", authSource=" + authSource + ", authUrn="
				+ authUrn + ", authDesigPerson=" + authDesigPerson
				+ ", authDate=" + authDate + ", authFrom=" + authFrom
				+ ", authTo=" + authTo + ", authCreatedOn=" + authCreatedOn
				+ ", idAuthority=" + idAuthority + ", authorityName="
				+ authorityName + ", authoritySpocUser=" + authoritySpocUser
				+ ", authorityPdfRequired=" + authorityPdfRequired
				+ ", srqtName=" + srqtName + ", srqtDetailParameter="
				+ srqtDetailParameter + ", srqtDetailLabel=" + srqtDetailLabel
				+ ", srqtScriptName=" + srqtScriptName
				+ ", srqtFulfilmentMethod=" + srqtFulfilmentMethod
				+ ", srqtStylesheet=" + Arrays.toString(srqtStylesheet)
				+ ", srqtDateRange=" + srqtDateRange + ", srqtIdServerDetails="
				+ srqtIdServerDetails + ", srqtDwhQuery=" + srqtDwhQuery
				+ ", srqtMaxPDFSize=" + srqtMaxPDFSize
				+ ", srqtRdhiStylesheet=" + Arrays.toString(srqtRdhiStylesheet)
				+ ", server=" + server + ", authTypeName=" + authTypeName
				+ ", authTypeCustom=" + authTypeCustom + ", csvFileName="
				+ csvFileName + ", pdfFileName=" + pdfFileName
				+ ", jsonFileName=" + jsonFileName
				+ ", xmlFileData=" + Arrays.toString(xmlFileData)
				+ ", csvFile=" + Arrays.toString(csvFile) + ", pdfFile="
				+ Arrays.toString(pdfFile) + ", jsonFile="
						+ Arrays.toString(jsonFile)  + ", xmlFile="
				+ Arrays.toString(xmlFile) + ", responseFile="
				+ Arrays.toString(responseFile) + ", dataDictionary="+ Arrays.toString(dataDictionary) + "]";
	}
	public String CustomToString()
	{
		return "JobDetailsDTO \n [idJobDetails=" + idJobDetails + "\n jobRef="
				+ jobRef + "\n createdOn=" + createdOn + "\n queueType="
				+ queueType + "\n jobStatus=" + jobStatus + "\n jobEvents="
				+ jobEvents + "\n isTranformedOne="  
				+ "\n retries=" + retries + "\n reran=" + reran
				+ "\n processStartedOn=" + processStartedOn
				+ "\n transformStartedOn=" + transformStartedOn
				+ "\n processStoppedOn=" + processStoppedOn + "\n jobUrl="
				+ jobUrl + "\n jobProcessorName=" + jobProcessorName
				+ "\n heartBeat=" + heartBeat + "\n extraParameters="
				+ Arrays.toString(extraParameters) + "\n idServiceRequest="
				+ idServiceRequest + "\n srqReqRef=" + srqReqRef + "\n srqGrade="
				+ srqGrade + "\n srqDetailParameter=" + srqDetailParameter
				+ "\n srqDueByDate=" + srqDueByDate + "\n srqNoDataFound="
				+ srqNoDataFound + "\n srqFileNames=" + srqFileNames
				+ "\n srqStartDate=" + srqStartDate + "\n srqEndDate="
				+ srqEndDate + "\n srqFulfilmentText=" + srqFulfilmentText
				+ "\n srqSpocRef=" + srqSpocRef + "\n srqFieldsList="
				+ srqFieldsList + "\n srqTimeZone=" + srqTimeZone
				+ "\n srqXml=" + srqXml
				+ "\n srqPdf=" + srqPdf
				+ "\n srqCsv=" + srqCsv
				+ "\n srqJson=" + srqJson
				+ "\n idAuthorisation=" + idAuthorisation + "\n authSource="
				+ authSource + "\n authUrn=" + authUrn + "\n authDate="
				+ authDate + "\n authFrom=" + authFrom + "\n authTo=" + authTo
				+ "\n authCreatedOn=" + authCreatedOn + "\n idAuthority="
				+ idAuthority + "\n authorityName=" + authorityName
				+ "\n authoritySpocUser=" + authoritySpocUser
				+ "\n authorityPdfRequired=" + authorityPdfRequired
				+ "\n srqtName=" + srqtName + "\n srqtDetailParameter="
				+ srqtDetailParameter + "\n srqtDetailLabel=" + srqtDetailLabel
				+ "\n srqtScriptName=" + srqtScriptName
				+ "\n srqtFulfilmentMethod=" + srqtFulfilmentMethod
				+ "\n srqtStylesheet=" + Arrays.toString(srqtStylesheet)
				+ "\n srqtDateRange=" + srqtDateRange + "\n srqtIdServerDetails="
				+ srqtIdServerDetails + "\n srqtDwhQuery=" + srqtDwhQuery
				+ "\n srqtMaxPDFSize=" + srqtMaxPDFSize
				+ "\n srqtRdhiStylesheet=" + Arrays.toString(srqtRdhiStylesheet)
				+ "\n authTypeName=" + authTypeName + "\n authTypeCustom="
				+ authTypeCustom + "\n csvFileName=" + csvFileName
				+ "\n jsonFileName=" + jsonFileName
				+ "\n pdfFileName=" + pdfFileName + "\n xmlFileName="
				+  "\n csvFile=" + Arrays.toString(csvFile)
				+  "\n jsonFile=" + Arrays.toString(jsonFile)
				+ "\n pdfFile=" + Arrays.toString(pdfFile) + "\n xmlFile="
				+ Arrays.toString(xmlFile) + "\n responseFile="
				+ Arrays.toString(responseFile) + "\n dataDictionary="
				+ Arrays.toString(dataDictionary) + "]";
	}
	
		
}