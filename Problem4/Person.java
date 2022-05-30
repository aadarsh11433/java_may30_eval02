package com.Problem4;

public class Person {

	
	String name ;

	String gender ;
	
	

	public Person() {
		super();
	}

	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
	
	
}
