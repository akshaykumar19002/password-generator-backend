package com.akshay.gen.model;

/**
 * @author Akshay Kumar
 * 
 * PasswordModel: used to store data for returning back to the user
 *
 */
public class PasswordModel {

	private String websiteUrl;
	
	private String userName;
	
	private String password;
	
	private String userId;
	
	public PasswordModel() {
		
	}
	
	public PasswordModel(String websiteUrl, String userName, String password, String userId) {
		this.websiteUrl = websiteUrl;
		this.userName = userName;
		this.password = password;
		this.userId = userId;
	}

	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "SavePasswordModel [websiteUrl=" + websiteUrl + ", userName=" + userName + ", password=" + password
				+ ", userId=" + userId + "]";
	}
	
}
