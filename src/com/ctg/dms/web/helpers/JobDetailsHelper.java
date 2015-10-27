package com.ctg.dms.web.helpers;

import java.util.Calendar;

import org.apache.commons.lang.StringUtils;

import com.ctg.dms.common.DateRangeType;
import com.ctg.dms.common.JobEventType;
import com.ctg.dms.config.DMSPropertiesUtil;
import com.ctg.dms.dao.impl.sql.COMMON_CONSTANTS;
import com.ctg.dms.dto.JobDetailsDTO;
import com.ctg.dms.util.DateUtils;

public class JobDetailsHelper {
	
	
	public static boolean isValidJobDetailsDTO(JobDetailsDTO jobDetailsDto){
	
		if(StringUtils.isBlank(jobDetailsDto.getQueueType()))
			return false;
		if(jobDetailsDto.getJobEvents() == null)
			return false;
		if(StringUtils.isBlank(jobDetailsDto.getJobStatus()))
			return false;
		if(jobDetailsDto.getIdServiceRequest() == null)
			return false;
		if(StringUtils.isBlank(jobDetailsDto.getSrqReqRef()))
			return false;
		if(StringUtils.isBlank(jobDetailsDto.getSrqGrade()))
			return false;
		if(StringUtils.isBlank(jobDetailsDto.getSrqDetailParameter()))
			return false;
		if(jobDetailsDto.getSrqDueByDate() == null)
			return false;
		if(jobDetailsDto.getSrqIntGrade() == 0)
			return false;
		if(jobDetailsDto.getIdAuthorisation() == null)
			return false;
		if(StringUtils.isBlank(jobDetailsDto.getAuthSource()))
			return false;
		if(StringUtils.isBlank(jobDetailsDto.getAuthUrn()))
			return false;
		/*//		if(jobDetailsDto.getAuthDate() == null)
		//		return false;
			if(jobDetailsDto.getAuthFrom() == null)
				return false;
			if(jobDetailsDto.getAuthTo() == null)
				return false;
			if(jobDetailsDto.getAuthCreatedOn() == null)
				return false;*/
		if(jobDetailsDto.getIdAuthority() == null)
			return false;
		if(StringUtils.isBlank(jobDetailsDto.getAuthorityName()))
			return false;
		if(StringUtils.isBlank(jobDetailsDto.getAuthoritySpocUser()))
			return false;
		if(StringUtils.isBlank(jobDetailsDto.getSrqtName()))
			return false;
		if(StringUtils.isBlank(jobDetailsDto.getSrqtDetailParameter()))
			return false;
		if(StringUtils.isBlank(jobDetailsDto.getSrqtDetailLabel()))
			return false;
		if(StringUtils.isBlank(jobDetailsDto.getSrqtFulfilmentMethod()))
			return false;
		if(jobDetailsDto.getSrqtStylesheet() == null)
			return false;
		if(StringUtils.isBlank(jobDetailsDto.getSrqtDateRange()))
			return false;
		if(!DateRangeType.DATE_RANGE_NO.getDbValue().equalsIgnoreCase(jobDetailsDto.getSrqtDateRange()) && StringUtils.isBlank(jobDetailsDto.getSrqtRetainedTimeZone()))
			return false;
		if (!jobDetailsDto.getSrqtFulfilmentMethod().equalsIgnoreCase(COMMON_CONSTANTS.FULFILMENT_METHOD_PEOPLESOFT))
		{
		if(jobDetailsDto.getSrqtIdServerDetails() == null)
			return false;
		}
		if(StringUtils.isBlank(jobDetailsDto.getAuthTypeName()))
			return false;
		if(jobDetailsDto.getAuthTypeCustom() == null) {
			//at least one file attachments must be selected
			if((jobDetailsDto.getSrqXml() == null && jobDetailsDto.getSrqPdf() == null && jobDetailsDto.getSrqCsv() == null && jobDetailsDto.getSrqJson() == null) ||
					!(jobDetailsDto.getSrqXml() || jobDetailsDto.getSrqPdf() || jobDetailsDto.getSrqCsv() || jobDetailsDto.getSrqJson())) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isDTOValid(JobDetailsDTO job){
	if(!isValidJobDetailsDTO(job))
		return false;
	if (!job.getSrqtFulfilmentMethod().equalsIgnoreCase(COMMON_CONSTANTS.FULFILMENT_METHOD_PEOPLESOFT))
	if(job.getServer()==null)
		return false;
	
	return true;
	}

	public static byte[] getJobEvent(JobEventType event, String comments, String user){

		String s="";
		/*	
		switch (event) {
		case JOB_EVENT_NEW:
				s="New job created";
				break;
				
		case JOB_EVENT_FAILED:
			s="Job Failed :";
			break;
		case JOB_EVENT_CLOSED:
			s="Closed the job :";
			break;
		case JOB_EVENT_RUNNING:
			s="Job marked as running :";
			break;
		case JOB_EVENT_RERAN:
			s="User re ran job :";
			break;
			
		case JOB_EVENT_NO_DATA_FOUND:
			s="Updated No Data Found flag for job";
			break;
			
		case JOB_EVENT_KILLED:
			s="Killing the job :";
			break;
			

		case JOB_EVENT_CSV_FILE_UPDATED:
			s="Updated the CSV file ";
			break;

		case JOB_EVENT_RDHI_FILE_UPDATED:
			s="updated the RDHI file Data";
			break;
			

		case JOB_EVENT_XML_FILE_UPDATED:
			s="updated the XML File";
			break;

		case JOB_EVENT_PDF_FILE_UPDATED:
			s="updated the PDF File";
			break;

		case JOB_EVENT_TRANSFORM:
			s="Started the transformation process";
			break;

		case JOB_EVENT_QUEUED_TO_TRANSFORM:
			s="Job queued for transformation :";
			break;

		case JOB_EVENT_READY_TO_TRANSFORM:
			s="Job ready to transform ";
			break;
			
			
		case JOB_EVENT_DONE:
			s="Job updated as DONE:";
			break;
		case JOB_EVENT_RESPONSE_FILE_UPDATED:
			s="updated the response file";
			break;
			
			
		case JOB_EVENT_SRQ_FULFILMENT_TEXT_UPDATED:
			s="Updated the Fulfilment Text";
			break;

		case JOB_EVENT_AUTO_RETRY:
			s="Auto re-trying the Job";
			break;
			
		case JOB_EVENT_RETRY:
			s="re-trying the Job";
			break;
			

		case JOB_EVENT_FAILURE_NOTFIED:
			s="Email notification triggered";
			break;
			
			
		}
*/
		
		
			s="<tr><td>"+ DateUtils.formatDateTime(Calendar.getInstance())+"</td><td>"+
//			event.toString() +"</td><td>"+ user +"</td><td>"+ s +  " "+ comments+"</td></tr>";
			DMSPropertiesUtil.getProperty(event.toString()) +"</td><td>"+ user +"</td><td>"+ DMSPropertiesUtil.getProperty(event.toString()+".MSG") +  " "+ comments+"</td></tr>";
		return s.getBytes();
		
		
	}

	
}
