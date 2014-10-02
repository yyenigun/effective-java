package com.bilgeadam.effective.java.module03;

public class TestApp {
	
	public static void main(String[] args) {
		Complex c = Complex.valueOf(4, 5);
		Complex c2 = Complex.valueOf(4, 5);
		Complex c3 = c;
	}

}
