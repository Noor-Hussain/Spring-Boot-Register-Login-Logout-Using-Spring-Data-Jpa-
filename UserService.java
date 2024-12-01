package com.Form.service;

import com.Form.entity.User;

public interface UserService 
{
	public boolean registerUser(User user );
	public User loginUser(String email, String password);
}
