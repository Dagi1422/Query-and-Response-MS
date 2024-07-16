package com.ecc.QueryManagement.models;

import jakarta.validation.constraints.NotEmpty;

public class UserDto {

	
	@NotEmpty (message = "The User Name is required")
	private String userName;
	
	@NotEmpty (message = "The Email address is required")
	private String Email;
	
	@NotEmpty (message = "Password is required")
	 private String password;
	
	@NotEmpty (message = "role is required")
	private String role;

	
	
	
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
