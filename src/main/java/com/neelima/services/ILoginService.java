package com.neelima.services;

import com.neelima.model.LoginModel;

public interface ILoginService {
   public boolean isValidUser(LoginModel loginModel) throws Exception;
}
