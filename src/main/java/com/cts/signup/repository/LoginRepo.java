package com.cts.signup.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cts.signup.bean.login;

@Repository
public interface LoginRepo extends CrudRepository<login, Integer> {

	@Query("SELECT u FROM login u WHERE u.username= :username")
	public login getLogin(@Param("username") String username);
}
