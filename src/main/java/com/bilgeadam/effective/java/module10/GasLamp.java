package com.bilgeadam.effective.java.module10;

public class GasLamp extends Light {

	@Override
	public void changeBulb() {
		System.out.println("bulb does not exist!");
		
	}

	@Override
	public void fixLight() {
		System.out.println("fire the light!");
	}
	
	@Override
	public void turnOff(){
		System.out.println("you can close gas lamp by suffling!");
	}

}
