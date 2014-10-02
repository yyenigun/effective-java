package com.bilgeadam.effective.java.module08;

/** @link http://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-with-examples*/
public class LoginService {
	
	private static LoginService instance;
	
	private LoginService(){
	}
	
/** static block initialization */
//	static{
//		try{
//			instance = new LoginService();
//		}catch(Exception e){
//		    System.err.println(e);
//		}
//	}
	
	/** lazy initialization */
	public static synchronized LoginService getInstance(){
		if(instance == null){
			instance = new LoginService();
		}
		return instance;
	}
	
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
