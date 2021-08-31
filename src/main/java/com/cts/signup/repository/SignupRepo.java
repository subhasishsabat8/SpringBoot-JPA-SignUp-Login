package com.cts.signup.repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.signup.bean.Signup;

public interface SignupRepo extends CrudRepository<Signup, Integer> {

}
