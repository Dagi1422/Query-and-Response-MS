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
@Table(name = "response")
public class Response {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long responseId;

	    @ManyToOne
	    @JoinColumn(name = "query_id")
	    private Query query;

	    @ManyToOne
	    @JoinColumn(name = "sender_id")
	    private User sender;

	    @ManyToOne
	    @JoinColumn(name = "receiver_id")
	    private User receiver;
	    
	    private String answeringAuthority;
	    private String certificateNum;
	    private String answeringOffice;
		private LocalDateTime timestamp;
	    private String content;
	    
	    
	    
	    
	    
	    //getters and setters
	    
	    public Long getResponseId() {
			return responseId;
		}
		public void setResponseId(Long responseId) {
			this.responseId = responseId;
		}
		public Query getQuery() {
			return query;
		}
		public void setQuery(Query query) {
			this.query = query;
		}
		public User getSender() {
			return sender;
		}
		public void setSender(User sender) {
			this.sender = sender;
		}
		public User getReceiver() {
			return receiver;
		}
		public void setReceiver(User receiver) {
			this.receiver = receiver;
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
		
}
