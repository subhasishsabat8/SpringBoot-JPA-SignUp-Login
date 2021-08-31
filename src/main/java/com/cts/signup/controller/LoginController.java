package com.cts.signup.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.signup.bean.Signup;
import com.cts.signup.bean.login;
import com.cts.signup.service.LoginService;
import com.cts.signup.service.SignupService;

import lombok.extern.slf4j.Slf4j;
 
//@CrossOrigin(origins = "*",allowedHeaders="*")
@Controller
@Slf4j
//@RestController()

public class LoginController { 
	@Autowired 
	private LoginService loginService;

	@Autowired
	private SignupService signupService; 

	//@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginpage(@ModelAttribute("login") login loginBean) {		
		return "login";
	}
	
	@RequestMapping(value = "/submitLogin", method = {RequestMethod.POST,RequestMethod.GET})
	public String checkLoginDetails(@ModelAttribute("login") login loginBean, BindingResult result) {
		if (loginService.validate(loginBean)) {
			return "success";
		}
		return "invalid";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String showSignuppage(@ModelAttribute("signup") Signup signupbean) {
		logger.debug("Debug message");
		logger.info("Logger info");
		return "signup"; 

	}

	@RequestMapping(value = "/register", method = {RequestMethod.POST,RequestMethod.GET})
	public String addLoginDetails(@ModelAttribute("signup") Signup signupBean, BindingResult result) {
		signupService.add(signupBean);
		return "success";
	}

	 Logger logger= (Logger) LoggerFactory.getLogger(LoginController.class); 
	
}
