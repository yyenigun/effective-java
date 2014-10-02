package com.bilgeadam.effective.java.module10;

import java.util.ArrayList;
import java.util.List;

public class TemplateApplication {

	public static void main(String[] args) {
		List<Light> lights = new ArrayList<Light>();
	    lights.add(new Florasan());
	    lights.add(new GasLamp());
	    
		for(Light light : lights){
			light.changeBulb();
			light.fixLight();
			light.stopElectricity();
			light.turnOn();
			light.turnOff();
		}

	}

}
