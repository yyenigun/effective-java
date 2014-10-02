package com.bilgeadam.effective.java.lab02;

import java.util.ArrayList;
import java.util.List;

public class TestApplication {

	public static void main(String[] args) {

		List<Shape> shapes = new ArrayList<Shape>();

		shapes.add(new Rectangle(10, 20));
		shapes.add(new Rectangle(11.5, 24.5));
		shapes.add(new Circle(5));

		for (Shape shape : shapes) {
			System.out.println(shape.getArea());
		}

	}

}
