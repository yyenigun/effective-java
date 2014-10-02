package com.bilgeadam.effective.java.module04;

public class Rectangle implements HasArea {

	double length;
	double width;

	public double area() {
		return length * width;
	}

}
