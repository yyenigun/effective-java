package com.bilgeadam.effective.java.module10;

public class Florasan extends Light {

	@Override
	public void changeBulb() {
		System.out.println("Florasan changed!");
	}

	@Override
	public void fixLight() {
		System.out.println("Florasan fixed!");
	}
	
	@Override
	public void turnOn(){
		System.out.println("Florasan turn on is different!");
	}

}
