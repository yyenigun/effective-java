package com.bilgeadam.effective.java.module09;

import org.junit.Test;

public class FacadeTestApplication {
	
	@Test
	public void testFacadeSuccess(){
		OrderFacade orderFacade = new OrderFacade();
		orderFacade.placeOrder("23");
	}

}
