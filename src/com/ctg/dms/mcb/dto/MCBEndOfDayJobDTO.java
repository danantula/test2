package com.ctg.dms.mcb.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.ctg.dms.dto.BaseDTO;
import com.ctg.dms.dto.validator.DtoValidationException;
import com.ctg.dms.dto.validator.DtoValidationSource;

/**
 * The Class MCBEndOfDayJobDTO.
 */
public class MCBEndOfDayJobDTO extends BaseDTO {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3133233774482778887L;
	
	/** The id. */
	private BigDecimal id;	
	
	/** The file name. */
	private String fileName;
	
	/** The case number. */
	private String caseNumber;
	
	/** The msisdn. */
	private Long msisdn;
    
    /** The crime ref no. */
    private String crimeRefNo;
    
    /** The case notes. */
    private String caseNotes;
    
    /** The police force. */
    private String policeForce;
    
    /** The police contact. */
    private String policeContact;
    
    /** The officer. */
    private String officer;
    
    /** The case date. */
    private Date caseDate;
    
    /** The status. */
    private Long status;
    
    /** The comments. */
    private String comments;
    
    /** The created by. */
    private String createdBy;
    
    /** The completed on. */
    private Date createdOn;
    
    /** The referral details. */
    private String referralDetails;
                
    /**
     * Instantiates a new MCB end of day job dto.
     */
    public MCBEndOfDayJobDTO() {
		super();
	}

	/**
     * Instantiates a new mCB end of day job dto.
     *
     * @param caseDate the case date
     * @param caseNotes the case notes
     * @param caseNumber the case number
     * @param comments the comments
     * @param createdOn the Created On Timestamp
     * @param createdBy the created by
     * @param crimeRefNo the crime ref no
     * @param fileName the file name
     * @param msisdn the msisdn
     * @param officer the officer
     * @param policeContact the police contact
     * @param policeForce the police force
     * @param status the status
     */
    public MCBEndOfDayJobDTO(Date caseDate, String caseNotes,
			String caseNumber, String comments, Date createdOn,
			String createdBy, String crimeRefNo, String fileName, Long msisdn,
			String officer, String policeContact, String policeForce,
			Long status) {
		super();
		this.caseDate = caseDate;
		this.caseNotes = caseNotes;
		this.caseNumber = caseNumber;
		this.comments = comments;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.crimeRefNo = crimeRefNo;
		this.fileName = fileName;
		this.msisdn = msisdn;
		this.officer = officer;
		this.policeContact = policeContact;
		this.policeForce = policeForce;
		this.status = status;
	}

	/**
	 * Gets the referral details.
	 *
	 * @return the referral details
	 */
	public String getReferralDetails() {
		return referralDetails;
	}

	/**
	 * Sets the referral details.
	 *
	 * @param referralDetails the new referral details
	 */
	public void setReferralDetails(String referralDetails) {
		this.referralDetails = referralDetails;
	}

	/**
     * Gets the id.
     *
     * @return the id
     */
    public BigDecimal getId() {
		return id;
	}
    
	/**
	 * Gets the file name.
	 *
	 * @return the file name
	 */
	public String getFileName() {
		return fileName;
	}
	
	/**
	 * Sets the file name.
	 *
	 * @param fileName the new file name
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	/**
	 * Gets the case number.
	 *
	 * @return the case number
	 */
	public String getCaseNumber() {
		return caseNumber;
	}
	
	/**
	 * Sets the case number.
	 *
	 * @param caseNumber the new case number
	 */
	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}
	
	/**
	 * Gets the msisdn.
	 *
	 * @return the msisdn
	 */
	public Long getMsisdn() {
		return msisdn;
	}
	
	/**
	 * Sets the msisdn.
	 *
	 * @param msisdn the new msisdn
	 */
	public void setMsisdn(Long msisdn) {
		this.msisdn = msisdn;
	}
	
	/**
	 * Gets the crime ref no.
	 *
	 * @return the crime ref no
	 */
	public String getCrimeRefNo() {
		return crimeRefNo;
	}
	
	/**
	 * Sets the crime ref no.
	 *
	 * @param crimeRefNo the new crime ref no
	 */
	public void setCrimeRefNo(String crimeRefNo) {
		this.crimeRefNo = crimeRefNo;
	}
	
	/**
	 * Gets the case notes.
	 *
	 * @return the case notes
	 */
	public String getCaseNotes() {
		return caseNotes;
	}
	
	/**
	 * Sets the case notes.
	 *
	 * @param caseNotes the new case notes
	 */
	public void setCaseNotes(String caseNotes) {
		this.caseNotes = caseNotes;
	}
	
	/**
	 * Gets the police force.
	 *
	 * @return the police force
	 */
	public String getPoliceForce() {
		return policeForce;
	}
	
	/**
	 * Sets the police force.
	 *
	 * @param policeForce the new police force
	 */
	public void setPoliceForce(String policeForce) {
		this.policeForce = policeForce;
	}
	
	/**
	 * Gets the police contact.
	 *
	 * @return the police contact
	 */
	public String getPoliceContact() {
		return policeContact;
	}
	
	/**
	 * Sets the police contact.
	 *
	 * @param policeContact the new police contact
	 */
	public void setPoliceContact(String policeContact) {
		this.policeContact = policeContact;
	}
	
	/**
	 * Gets the officer.
	 *
	 * @return the officer
	 */
	public String getOfficer() {
		return officer;
	}
	
	/**
	 * Sets the officer.
	 *
	 * @param officer the new officer
	 */
	public void setOfficer(String officer) {
		this.officer = officer;
	}
	
	/**
	 * Gets the case date.
	 *
	 * @return the case date
	 */
	public Date getCaseDate() {
		return caseDate;
	}
	
	/**
	 * Sets the case date.
	 *
	 * @param caseDate the new case date
	 */
	public void setCaseDate(Date caseDate) {
		this.caseDate = caseDate;
	}
	
	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public Long getStatus() {
		return status;
	}
	
	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(Long status) {
		this.status = status;
	}
	
	/**
	 * Gets the comments.
	 *
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	
	/**
	 * Sets the comments.
	 *
	 * @param comments the new comments
	 */
	public void setComments(String comments) {
		this.comments = comments;
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
	 * Gets the completed on.
	 *
	 * @return the completed on
	 */
	public Date getCreatedOn() {
		return createdOn;
	}
	
	/**
	 * Sets the completed on.
	 *
	 * @param completedOn the new completed on
	 */
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
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
