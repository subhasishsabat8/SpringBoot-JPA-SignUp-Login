package com.cts.signup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.signup.bean.Signup;
import com.cts.signup.bean.login;
import com.cts.signup.repository.LoginRepo;
import com.cts.signup.repository.SignupRepo;

@Service
public class SignupService {
	
	@Autowired
	private SignupRepo signupRepo;
	@Autowired
	private LoginRepo loginRepo;

	public void add(Signup signupBean) {
		signupRepo.save(signupBean);
		login l=new login();
		l.setUsername(signupBean.getUsername());
		l.setPassword(signupBean.getPassword());
		
		loginRepo.save(l);
	}
	
	

}
