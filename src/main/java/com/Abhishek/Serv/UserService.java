package com.Abhishek.Serv;

import com.Abhishek.model.UserDtls;

public interface UserService {

	public UserDtls createUser(UserDtls user);

	public boolean checkEmail(String email);
	
	
}