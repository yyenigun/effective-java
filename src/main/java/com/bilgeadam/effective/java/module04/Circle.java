package com.bilgeadam.effective.java.module04;

public class Circle implements HasArea {

	double radius;

	public double area() {
		return Math.PI * radius * radius;
	}

}
