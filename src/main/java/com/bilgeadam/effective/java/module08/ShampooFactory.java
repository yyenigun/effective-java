package com.bilgeadam.effective.java.module08;

public class ShampooFactory extends ProductFactory {

	private static int counter = 0;

	private static final int INSTANCE_NUMBER = 2;

	private static ShampooFactory instance;

	private ShampooFactory() {

	}

	public static synchronized ShampooFactory getInstance() {
		if (instance == null) {
			return new ShampooFactory();
		}
		return instance;
	}

	@Override
	public Product createProduct() throws Exception {
		if (counter > INSTANCE_NUMBER) {
			throw new Exception("2'den fazla instance yaratamazsiniz!");
		}
		Product p = new Product();
		p.setId(1);
		p.setName("Sampuan");
		p.setBrand("Blendax");
		counter++;
		return p;
	}

}
