package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.form.LoginForm;

@Controller
public class LoginController {

	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginForm() {
		return "login";
	}
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String getMyBio() {
		return "index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)

	public String login(@ModelAttribute (name ="LoginForm")LoginForm loginForm, Model model) {
		String username = loginForm.getUsername();
		String password = loginForm.getPassword();

		
		  if ("sandy".equals(username) && "sandy".equals(password)) {
			  return "home";
		  
		  } model.addAttribute("InvalidCredentials", true);
		 
		return "login";
	}

}
