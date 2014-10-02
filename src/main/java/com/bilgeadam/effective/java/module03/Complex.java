package com.bilgeadam.effective.java.module03;

public final class Complex {
	
	private final int x;
	
	private final int y;
	
	private Complex(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public static Complex valueOf(int x, int y){
		return new Complex(x,y);
	}

}
