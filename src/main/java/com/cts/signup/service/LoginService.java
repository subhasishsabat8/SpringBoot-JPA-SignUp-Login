package com.cts.signup.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.signup.bean.login;
import com.cts.signup.repository.LoginRepo;

@Service
public class LoginService {

	@Autowired
	public LoginRepo loginRepo;

	public boolean validate(login bean) {
		
		login l1 = loginRepo.getLogin(bean.getUsername());
		
		return bean.getPassword().equalsIgnoreCase(l1.getPassword());
	}
}
