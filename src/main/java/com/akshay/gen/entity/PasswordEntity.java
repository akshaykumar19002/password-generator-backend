package com.akshay.gen.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="password")
public class PasswordEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(name = "url")
	private String url;
	
	@NotBlank
	@Column(name = "userName")
	private String userName;
	
	@NotBlank
	@Column(name = "userId")
	private String userId;
	
	@NotBlank
	@Column(name = "password")
	private String password;
	
	public PasswordEntity() {
		
	}
	
	public PasswordEntity(String url, String userName, String userId, String password) {
		this.url = url;
		this.userName = userName;
		this.userId = userId;
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "PasswordEntity [id=" + id + ", url=" + url + ", userName=" + userName + ", userId=" + userId
				+ ", password=" + password + "]";
	}

}
