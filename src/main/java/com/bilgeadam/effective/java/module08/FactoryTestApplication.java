package com.bilgeadam.effective.java.module08;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryTestApplication {

	@Test
	public void testProductFactorySuccess() throws Exception {
		ProductFactory factory = ShampooFactory.getInstance();
		Product product = factory.createProduct();
		assertNotNull(product);
		assertEquals(1, product.getId());
		assertEquals("Sampuan", product.getName());
		assertEquals("Blendax", product.getBrand());
	}
	
	@Test(expected=Exception.class)
	public void testProductFactoryMaxInstance() throws Exception {
		ProductFactory factory = ShampooFactory.getInstance();
		Product product = factory.createProduct();
		Product product2 = factory.createProduct();
		Product product3 = factory.createProduct();
	}
	
}
