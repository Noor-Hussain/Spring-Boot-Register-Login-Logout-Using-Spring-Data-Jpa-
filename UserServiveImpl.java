package com.Form.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Form.entity.User;
import com.Form.repository.UserRepository;

@Service
public class UserServiveImpl implements UserService
{
	@Autowired
	private UserRepository userRepository;
	@Override
	public boolean registerUser(User user) 
	{
		try 
		{
			userRepository.save(user);
			return true;
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public User loginUser(String email, String password) 
	{
		User validuser = userRepository.findByEmail(email);
		if(validuser != null && validuser.getPassword().equals(password)) 
		{
			return validuser;
		} 
		
		return null;
		 
	}
}
