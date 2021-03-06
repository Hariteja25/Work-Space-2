package com.myapp;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

//NEED hibernate-validator-5.0.1.Final

public class User {
	@NotEmpty
	@Email
	private String email;
	
	@NotEmpty(message = "Please enter your password.")
	@Size(min = 6, max = 15,message = "Your password must between 6 and 15 characters")
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}


