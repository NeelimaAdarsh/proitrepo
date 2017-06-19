package com.neelima.model;

public class LoginModel {
	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	@Override
	public String toString() {
		return "LoginPojo [userName=" + userName + ", password=" + password + "]";
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

}
