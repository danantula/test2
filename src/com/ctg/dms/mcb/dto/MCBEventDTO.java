package com.ctg.dms.mcb.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.ctg.dms.dto.BaseDTO;
import com.ctg.dms.dto.validator.DtoValidationException;
import com.ctg.dms.dto.validator.DtoValidationSource;

/**
 * The Class MCBEvent.
 */
public class MCBEventDTO extends BaseDTO {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -9183187910492505002L;

	/** The id. */
	private Long id; 
	
	/** The mcb service request. */
	private Long serviceRequestId;
	
	/** The event time. */
	private Date eventTime;
	
	/** The event time from. */
	private Date eventTimeFrom;
	
	/** The event time to. */
	private Date eventTimeTo;
	
	/** The target phone. */
	private String targetPhone;
	
	/** The acknowledged. */
	private String acknowledged;
	
	/** The created on. */
	private Date createdOn;
	
	/** The created by. */
	private String createdBy; 
	
//	private AuditEntryDTO auditEntryDTO;
	
	private String eventType;
	
	/** Job id for the event	 */
	private BigDecimal jobId;
	
	/** Job stattus for each event 	*/
	private String jobStatus;
	
	/**
	 * Instantiates a new MCB event.
	 */
	public MCBEventDTO() {
		super();
	}

	/**
	 * Instantiates a new mCB event.
	 *
	 * @param acknowledged the acknowledged
	 * @param createdBy the created by
	 * @param createdOn the created on
	 * @param eventTime the event time
	 * @param eventTimeFrom the event time from
	 * @param eventTimeTo the event time to
	 * @param mcbServiceRequest the mcb service request
	 * @param targetPhone the target phone
	 * @param eventType 
	 * @param jobId 
	 */
	public MCBEventDTO(String acknowledged, String createdBy,
			Date createdOn, Date eventTime, Date eventTimeFrom,
			Date eventTimeTo, Long mcbServiceRequest,
			String targetPhone, String eventType, BigDecimal jobId) {
		super();
		this.acknowledged = acknowledged;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.eventTime = eventTime;
		this.eventTimeFrom = eventTimeFrom;
		this.eventTimeTo = eventTimeTo;
		this.serviceRequestId = mcbServiceRequest;
		this.targetPhone = targetPhone;
		this.eventType = eventType;
		this.jobId= jobId;
	}
	
	/**
	 * @return serviceRequestId
	 */
	public Long getServiceRequestId() {
		return serviceRequestId;
	}

	/**
	 * @param serviceRequestId
	 */
	public void setServiceRequestId(Long serviceRequestId) {
		this.serviceRequestId = serviceRequestId;
	}

	
	/**
	 * Gets the event time.
	 *
	 * @return the event time
	 */
	public Date getEventTime() {
		return eventTime;
	}
	
	/**
	 * Sets the event time.
	 *
	 * @param eventTime the new event time
	 */
	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}
	
	/**
	 * Gets the event time from.
	 *
	 * @return the event time from
	 */
	public Date getEventTimeFrom() {
		return eventTimeFrom;
	}
	
	/**
	 * Sets the event time from.
	 *
	 * @param eventTimeFrom the new event time from
	 */
	public void setEventTimeFrom(Date eventTimeFrom) {
		this.eventTimeFrom = eventTimeFrom;
	}
	
	/**
	 * Gets the event time to.
	 *
	 * @return the event time to
	 */
	public Date getEventTimeTo() {
		return eventTimeTo;
	}
	
	/**
	 * Sets the event time to.
	 *
	 * @param eventTimeTo the new event time to
	 */
	public void setEventTimeTo(Date eventTimeTo) {
		this.eventTimeTo = eventTimeTo;
	}
	
	/**
	 * Gets the target phone.
	 *
	 * @return the target phone
	 */
	public String getTargetPhone() {
		return targetPhone;
	}
	
	/**
	 * Sets the target phone.
	 *
	 * @param targetPhone the new target phone
	 */
	public void setTargetPhone(String targetPhone) {
		this.targetPhone = targetPhone;
	}
	
	/**
	 * Gets the acknowledged.
	 *
	 * @return the acknowledged
	 */
	public String getAcknowledged() {
		return acknowledged;
	}
	
	/**
	 * Sets the acknowledged.
	 *
	 * @param acknowledged the new acknowledged
	 */
	public void setAcknowledged(String acknowledged) {
		this.acknowledged = acknowledged;
	}
	
	/**
	 * Gets the created on.
	 *
	 * @return the created on
	 */
	public Date getCreatedOn() {
		return createdOn;
	}
	
	/**
	 * Sets the created on.
	 *
	 * @param createdOn the new created on
	 */
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	/**
	 * Gets the created by.
	 *
	 * @return the created by
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	
	/**
	 * Sets the created by.
	 *
	 * @param createdBy the new created by
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}		
	
    @Override
    public boolean equals(Object compareObj)
    {
	if (this == compareObj) 
           return true;
 
	if (compareObj == null) 
	    return false;
 
	if (!(compareObj instanceof MCBEventDTO))
	    return false;
 
	MCBEventDTO compareEvent = (MCBEventDTO)compareObj; 
 
	return this.serviceRequestId.equals(compareEvent.serviceRequestId); 
	
    }
 
    @Override
    public int hashCode()
    {
	int primeNumber = 31;
	return primeNumber + this.serviceRequestId.hashCode();
    }

	/**
	 * @param auditEntryDTO
	 */
/*	public void setAuditEntryDTO(AuditEntryDTO auditEntryDTO) {
		this.auditEntryDTO = auditEntryDTO;
	}
	
	*//**
	 * @return auditEntryDTO
	 *//*
	public AuditEntryDTO getAuditEntryDTO() {
		return auditEntryDTO;
	}
*/
	/**
	 * @param eventType
	 */
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	/**
	 * @return  eventType
	 */
	public String getEventType() {
		return eventType;
	}

	/**
	 * @return jobId
	 */
	public BigDecimal getJobId() {
		return jobId;
	}

	/**
	 * @param jobId
	 */
	public void setJobId(BigDecimal jobId) {
		this.jobId = jobId;
	}
	
	/**
	 * @return jobStatus
	 */
	public String getJobStatus() {
		return jobStatus;
	}

	/**
	 * @param jobStatus
	 */
	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}

	@Override
	public void validateCommons() throws DtoValidationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validateBusiness() throws DtoValidationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validateSourceSpecific() throws DtoValidationException {
		// TODO Auto-generated method stub
		
	}

}
