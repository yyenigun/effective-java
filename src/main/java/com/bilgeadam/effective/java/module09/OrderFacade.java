package com.bilgeadam.effective.java.module09;

public class OrderFacade {

	private Payment pymt = new Payment();
	private Inventory inventry = new Inventory();

	public void placeOrder(String orderId) {
		String step1 = inventry.checkInventory(orderId);
		String step2 = pymt.deductPayment(orderId);
		System.out.println("Order is placed! Step 1 : " + step1 + " Step 2 : "
				+ step2);
	}

}
