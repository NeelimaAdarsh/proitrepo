package com.neelima.dao;

import com.neelima.model.LoginModel;

public interface IUserDao {
	public boolean isValidUser(LoginModel loginModel) throws ClassNotFoundException;
}
