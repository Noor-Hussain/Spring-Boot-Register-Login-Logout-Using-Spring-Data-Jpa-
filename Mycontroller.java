package com.Form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Form.entity.User;
import com.Form.service.UserService;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class Mycontroller 
{
	@Autowired
	private UserService userservice;

	@GetMapping("/regpage")
	public String openRegPage(Model model) 
	{
		model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping("/regform")
	public String submitRegForm(@ModelAttribute("user")User user,Model model) 
	{
	boolean status	= userservice.registerUser(user);
		if(status) 
		{
			model.addAttribute("succesMsg", "User Registerd Successfully");
		}else
		{
			model.addAttribute("errorMsg", "User Not Registerd Due To Some Error ");
		}
		return"register";
	}
	@GetMapping("/loginpage")
	public String openLoginpage(Model model) 
	{
		model.addAttribute("user", new User());
		return "login";
	}
	@PostMapping("/loginform")
	public String submitLoginForm(@ModelAttribute("user")User user, Model model)  
	{
	User validuser = userservice.loginUser(user.getEmail(), user.getPassword());
	if(validuser != null)  
	{
		model.addAttribute("modelname", validuser.getName());
		return "profile";
	}else 
	{
		model.addAttribute("errorMsg", "Email Id And Password Didnt Match ");
		return "login";
	}	
	
	}
	@GetMapping("/logout")
	public String logoutUser(HttpServletRequest request) 
	{
		HttpSession session = request.getSession(false);
		if(session != null) 
		{
			session.invalidate();
		}
		return "login";
		
	}
}
