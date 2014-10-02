package com.bilgeadam.effective.java.module11;

public class FactoryPatternTest {

	public static void main(String[] args) {
		LoginService.getInstance().login("yalcin", "yalcin");
		
		Factory productFactory = ProductFactory.getInstance();
		Product product = productFactory.createProduct();
		
	}

}
