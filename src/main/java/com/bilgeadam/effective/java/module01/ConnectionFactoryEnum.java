package com.bilgeadam.effective.java.module01;

public enum ConnectionFactoryEnum {
	
	INSTANCE;
	
	public void createConnection(){
		System.out.println("connection created");
	}

}
