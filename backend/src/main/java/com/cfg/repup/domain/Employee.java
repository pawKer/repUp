package com.cfg.repup.domain;

public class Employee {

	private String firstName;
	private String lastName;
	
	public Employee(String firstname, String lastname)
	{
		this.firstName = firstname;
		this.lastName = lastname;
	}
	public Employee()
	{
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
