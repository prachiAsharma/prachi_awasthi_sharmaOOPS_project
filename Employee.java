package com.greatlearning;

public class Employee {
	
	private String  generatePassword;
	private String generateEmailAddress;
	public Employee(String generatePassword, String generateEmailAddress) {
		super();
		this.generatePassword = generatePassword;
		this.generateEmailAddress = generateEmailAddress;
	}
	public String getGeneratePassword() {
		return generatePassword;
	}
	public void setGeneratePassword(String generatePassword) {
		this.generatePassword = generatePassword;
	}
	public String getGenerateEmailAddress() {
		return generateEmailAddress;
	}
	public void setGenerateEmailAddress(String generateEmailAddress) {
		this.generateEmailAddress = generateEmailAddress;
	}
	
	

}
