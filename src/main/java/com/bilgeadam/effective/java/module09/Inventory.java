package com.bilgeadam.effective.java.module09;

/**@link http://www.javacodegeeks.com/2012/11/facade-design-pattern-design-standpoint.html */
public class Inventory {
	
	public String checkInventory(String orderId) {
		return "Inventory checked";
	}
	
	public String addInventory(String orderId) {
		return "Inventory added";
	}

}
