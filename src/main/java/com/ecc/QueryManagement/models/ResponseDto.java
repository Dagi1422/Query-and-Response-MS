package com.ecc.QueryManagement.models;

import jakarta.validation.constraints.NotEmpty;

public class ResponseDto {

	@NotEmpty (message = "The Responding Authority is required")
	private String answeringAuthority;
	@NotEmpty (message = "The Certificate number is required")
	private String certificateNum;
	@NotEmpty (message = "The Responding office is required")
	private String answeringOffice;
	@NotEmpty (message = "The Response detail is required")
	private String content;
	
	
	
	
	
	//getters and setters

	public String getAnsweringAuthority() {
		return answeringAuthority;
	}
	public void setAnsweringAuthority(String answeringAuthority) {
		this.answeringAuthority = answeringAuthority;
	}
	public String getCertificateNum() {
		return certificateNum;
	}
	public void setCertificateNum(String certificateNum) {
		this.certificateNum = certificateNum;
	}
	public String getAnsweringOffice() {
		return answeringOffice;
	}
	public void setAnsweringOffice(String answeringOffice) {
		this.answeringOffice = answeringOffice;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
