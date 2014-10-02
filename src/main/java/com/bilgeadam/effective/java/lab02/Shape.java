package com.bilgeadam.effective.java.lab02;

public abstract class Shape {
	
	public abstract double getArea();
	
	private Color color;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	

}
