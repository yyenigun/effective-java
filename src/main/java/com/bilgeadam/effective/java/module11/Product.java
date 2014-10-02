package com.bilgeadam.effective.java.module11;

public class Product {

	private long id;

	private String name;
	
	protected Product(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
