package com.bilgeadam.effective.java.module08;

public enum LoginServiceEnum {
	
	INSTANCE;
	
	public boolean login(String userName, String password){
		if(userName == null || password == null){
			return false;
		}
		if(userName.equals(password)){
			return true;
		}
		return false;
	}

}
