package com.ctg.dms.dto;

import java.util.Arrays;

import com.ctg.dms.dto.validator.DtoValidationException;
import com.ctg.dms.dto.validator.DtoValidationSource;

public class ServerDetailsDTO extends BaseDTO {
	private Long id;
	private String alias;
	private String name;
	private String ip;
	private long port;
	private String userName;
	private String password;
	private String details;
	private Long source;
	private boolean isPrimary;
	
	private String jdbcUrl;
	private String jdbcDriver ;
	
	private byte[] queryXml;
	
	public ServerDetailsDTO(Long id){
		this.id=id;
	}
	public ServerDetailsDTO(Long id,boolean isPrimary)
	{
		this.id = id;
		this.setPrimary(isPrimary);
	}
	
	public ServerDetailsDTO(){}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public long getPort() {
		return port;
	}
	public void setPort(long port) {
		this.port = port;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	public Long getSource() {
		return source;
	}

	public void setSource(Long source) {
		this.source = source;
	}

	public boolean equals(Object object){
		if (object instanceof ServerDetailsDTO && object!=null &&
				((ServerDetailsDTO) object).getId() != null && getId() != null) {
			if (((ServerDetailsDTO) object).getId().longValue() == getId().longValue())
				return true;
		}
		return false;
	}

	public boolean isPrimary() {
		return isPrimary;
	}

	public void setPrimary(boolean isPrimary) {
		this.isPrimary = isPrimary;
	}
	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}
	public String getJdbcUrl() {
		return jdbcUrl;
	}
	public void setJdbcDriver(String jdbcDriver) {
		this.jdbcDriver = jdbcDriver;
	}
	public String getJdbcDriver() {
		return jdbcDriver;
	}
	public byte[] getQueryXml() {
		return queryXml;
	}
	public void setQueryXml(byte[] queryXml) {
		this.queryXml = queryXml;
	}
	@Override
	public String toString() {
		return "ServerDetailsDTO [id=" + id + ", alias=" + alias + ", name="
				+ name + ", ip=" + ip + ", port=" + port + ", userName="
				+ userName + ", password=" + password + ", details=" + details
				+ ", source=" + source + ", isPrimary=" + isPrimary
				+ ", jdbcUrl=" + jdbcUrl + ", jdbcDriver=" + jdbcDriver
				+ ", queryXml=" + Arrays.toString(queryXml) + "]";
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
