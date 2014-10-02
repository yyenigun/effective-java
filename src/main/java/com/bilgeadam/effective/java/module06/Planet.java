package com.bilgeadam.effective.java.module06;

public enum Planet {
	
	/** this represents Mercury planet */
	MERCURY(5335523), 
	
	/** this represents Venus planet */
	VENUS(5335525);
	
	int radius;
	
	
	Planet(int radius){
		
		this.radius = radius;
	}


}
