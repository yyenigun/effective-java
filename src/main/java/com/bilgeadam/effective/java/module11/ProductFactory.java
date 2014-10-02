package com.bilgeadam.effective.java.module11;

public class ProductFactory implements Factory {
	
	private static ProductFactory instance;
	
	private ProductFactory(){
		
	}
	
	public static ProductFactory getInstance(){
		if(instance == null){
			return new ProductFactory();
		}
		return instance;
	}

	public Product createProduct(){
		return new Product();
	}
}
