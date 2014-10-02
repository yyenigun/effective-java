package com.bilgeadam.effective.java.module01;

public class ConnectionFactory {
	
	private final static ConnectionFactory INSTANCE = new ConnectionFactory();
	
	private ConnectionFactory(){
		
	}
	
	public static ConnectionFactory getInstance(){
		return INSTANCE;
	}
	
	public void createConnection(){
		System.out.println("connection created!");
	}

}
