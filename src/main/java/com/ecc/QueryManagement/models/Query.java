package com.ecc.QueryManagement.models;



import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "query")
public class Query {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long queryId;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private User receiver;
    
    
    private String queryingAuthority;
    private String certificateNum;
	private String queryingOffice;
    private LocalDateTime timestamp;
    private String content;
    
    
    
    //getters and setters
    public Long getQueryId() {
		return queryId;
	}
	public void setQueryId(Long queryId) {
		this.queryId = queryId;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
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
	
}
