package com.ecc.QueryManagement.models;

import jakarta.validation.constraints.NotEmpty;

public class QueryDto {
	@NotEmpty (message = "The Querying Authority is required")
	private String queryingAuthority;
	@NotEmpty (message = "The Certificate number is required")
	private String certificateNum;
	@NotEmpty (message = "The Querying office is required")
	private String queryingOffice;
	@NotEmpty (message = "The Querying detail is required")
	private String content;
	
	
	//getters and setters
	public String getQueryingAuthority() {
		return queryingAuthority;
	}
	public void setQueryingAuthority(String queryingAuthority) {
		this.queryingAuthority = queryingAuthority;
	}
	public String getCertificateNum() {
		return certificateNum;
	}
	public void setCertificateNum(String certificateNum) {
		this.certificateNum = certificateNum;
	}
	public String getQueryingOffice() {
		return queryingOffice;
	}
	public void setQueryingOffice(String queryingOffice) {
		this.queryingOffice = queryingOffice;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
