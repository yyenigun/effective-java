package com.bilgeadam.effective.java.module02;

public class Person {
	
	private String name;
	
	private String surname;

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	

}
