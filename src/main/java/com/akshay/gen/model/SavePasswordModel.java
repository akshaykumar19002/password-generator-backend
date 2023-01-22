package com.akshay.gen.model;

/**
 * @author Akshay Kumar
 * 
 * SavePasswordModel: used to store data when save api is called
 *
 */
public class SavePasswordModel {

	private String websiteUrl;
	
	private String userName;
	
	private String password;
	
	private String userId;
	
	public SavePasswordModel() {
		
	}
	
	public SavePasswordModel(String websiteUrl, String userName, String password, String userId) {
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
