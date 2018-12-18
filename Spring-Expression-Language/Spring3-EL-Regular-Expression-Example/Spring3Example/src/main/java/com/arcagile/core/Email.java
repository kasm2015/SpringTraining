package com.arcagile.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emailBean")
public class Email {

	@Value("nospam@abc.com")
	String emailAddress;

	@Value("asfkjgas@cin.in")
	String checkEmailisValid;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getCheckEmailisValid() {
		return checkEmailisValid;
	}

	public void setCheckEmailisValid(String checkEmailisValid) {
		this.checkEmailisValid = checkEmailisValid;
	}
}
