package com.bilgeadam.effective.java.module08;

import java.lang.reflect.Constructor;

public class TestApplication {

	public static void main(String[] args) {
		LoginService loginService = LoginService.getInstance();
		LoginService loginService2 = null;

		try {
			Constructor[] constructors = LoginService.class
					.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				loginService2 = (LoginService) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (loginService == loginService2) {
			System.out.println("this is Singleton!");
		} else {
			System.err.println("Singleton destroyed!");
		}

		System.out.println(LoginServiceEnum.INSTANCE.login("yalcin", "yalcin"));

	}

}
