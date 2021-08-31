package com.cts.signup.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Component
@Data
public class Signup {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	/*
	 * public int getId() { return id; } public void setId(int id) { this.id = id; }
	 */
	private String name;
	private String email;
	private long pno;
	private String dob;
	private String username;
	private String password;
	/*
	 * public String getUsername() { return username; } public void
	 * setUsername(String username) { this.username = username; } public String
	 * getPassword() { return password; } public void setPassword(String password) {
	 * this.password = password; } public String getName() { return name; } public
	 * void setName(String name) { this.name = name; } public String getEmail() {
	 * return email; } public void setEmail(String email) { this.email = email; }
	 * public long getPno() { return pno; } public void setPno(long pno) { this.pno
	 * = pno; } public String getDob() { return dob; } public void setDob(String
	 * dob) { this.dob = dob; }
	 */

}
