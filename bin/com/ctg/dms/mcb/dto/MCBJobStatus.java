package com.ctg.dms.mcb.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The Class MCBJobStatus.
 */
public class MCBJobStatus implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 103175643495216019L;
	
	/** The id. */
	private BigDecimal id;
	
	/** The file name. */
	private String fileName;
	
	/** The status. */
	private Long status;
	
	/** The content. */
	private byte[] content;
	
	/** The purged. */
	private boolean purged;
	
	/** The comments. */
	private String comments;
	
	/** The created by. */
	private String createdBy;
	
	/** The created on. */
	private Date createdOn;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public BigDecimal getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(BigDecimal id) {
		this.id = id;
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
	 * Gets the content.
	 *
	 * @return the content
	 */
	public byte[] getContent() {
		return content;
	}
	
	/**
	 * Sets the content.
	 *
	 * @param content the new content
	 */
	public void setContent(byte[] content) {
		this.content = content;
	}
	
	/**
	 * Checks if is purged.
	 *
	 * @return true, if is purged
	 */
	public boolean isPurged() {
		return purged;
	}
	
	/**
	 * Sets the purged.
	 *
	 * @param purged the new purged
	 */
	public void setPurged(boolean purged) {
		this.purged = purged;
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
}
