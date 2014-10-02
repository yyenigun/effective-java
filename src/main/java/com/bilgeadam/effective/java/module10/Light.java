package com.bilgeadam.effective.java.module10;

public abstract class Light {
	
	public void turnOn(){
		System.out.println("light is turned on!");
	}
	
	public void turnOff(){
		System.out.println("light is turned off!");
	}
	
	public abstract void changeBulb();
	
	public abstract void fixLight();
	
	public void stopElectricity(){
		System.out.println("Electricity is stopped!");
	}

}
