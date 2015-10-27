/**
 * 
 */
package com.ctg.dms.dto;

import com.ctg.dms.dto.validator.DtoValidationException;
import com.ctg.dms.dto.validator.DtoValidationSource;

public class FileDataDTO extends BaseDTO {
	private String mimeType;
	private String fileName;
	private byte[] data;
	private byte[] hashKey;
	
	public FileDataDTO(){}
	public FileDataDTO(String mimeType, String fileName, byte[] data) {
		this.mimeType = mimeType;
		this.fileName = fileName;
		this.data = data;
	}
	
	public FileDataDTO(byte[] data){
		this.data = data;
	}
	
	public String getMimeType() {
		return mimeType;
	}
	
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public byte[] getData() {
		return data;
	}
	
	public void setData(byte[] data) {
		this.data = data;
	}
	public void setHashKey(byte[] hashKey) {
		this.hashKey = hashKey;
	}
	public byte[] getHashKey() {
		return hashKey;
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