/**
 * 
 */
package com.ctg.dms.dto;

import java.io.Serializable;

public class RDHIDataDTO implements Serializable{
	private String status;
	private String disconnectionDate;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDisconnectionDate() {
		return disconnectionDate;
	}
	public void setDisconnectionDate(String disconnectionDate) {
		this.disconnectionDate = disconnectionDate;
	}
	
	

}