package com.bilgeadam.effective.java.module11;

public class LoginService {
	
	private static LoginService INSTANCE;
	
	private LoginService(){
		
	}
	
	public synchronized static LoginService getInstance(){
		if(INSTANCE == null){
			INSTANCE = new LoginService();
		}
		return INSTANCE;
	}
	
	public boolean login(String userName, String password){
		return false;
	}

}
