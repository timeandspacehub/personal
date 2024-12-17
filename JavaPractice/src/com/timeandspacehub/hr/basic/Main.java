package com.timeandspacehub.hr.basic;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {

		System.out.println("*** Welcome to Sai Banking App");

		// john is a reference to memory address
		Employee john = new Employee(101, "John", "Doe", "JD"); // default constructor

		System.out.println("John ID: " + john.getId());
		System.out.println("John FirstName: " + john.getFirstName());
		System.out.println("John LastName: " + john.getLastName());
		
		Optional<String> opt = john.fancyNickName();
		
		if(opt.isPresent()) {
			System.out.println("Only executed if data exists"+ opt.get());
		}

	}

}
