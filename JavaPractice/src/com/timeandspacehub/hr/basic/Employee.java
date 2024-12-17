package com.timeandspacehub.hr.basic;

import java.util.Optional;

public class Employee {
	// 1. properties
	private int id;
	private String firstName;
	private String lastName;
	private String nickName;

	// 2. default constructor
	public Employee() {
	}

	// 3. parameterized constructor contains parameters
	public Employee(int inputId, String firstName, String lName, String nickName) {
		this.id = inputId;
		this.firstName = firstName;
		this.lastName = lName;
		this.nickName = nickName;
	}

	//4. Getter/Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	//5. Provide method
	public Optional<String> fancyNickName() {
		return Optional.ofNullable(this.nickName);
	}
}
