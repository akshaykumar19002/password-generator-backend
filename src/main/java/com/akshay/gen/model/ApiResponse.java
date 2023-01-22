package com.akshay.gen.model;

/**
 * 
 *
 */
public class ApiResponse {

	private String response;
	private boolean isSuccess = true;
	
	public ApiResponse() {
		
	}
	
	public ApiResponse(String response) {
		this.response = response;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

}
