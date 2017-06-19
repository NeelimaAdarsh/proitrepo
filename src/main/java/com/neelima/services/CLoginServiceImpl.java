package com.neelima.services;

import com.neelima.dao.CUserDaoImpl;
import com.neelima.model.LoginModel;

public class CLoginServiceImpl implements ILoginService {

	public boolean isValidUser(LoginModel loginModel) throws ClassNotFoundException {
	    CUserDaoImpl cUserDaoIml = new CUserDaoImpl();
	    return cUserDaoIml.isValidUser(loginModel);
	}

}
