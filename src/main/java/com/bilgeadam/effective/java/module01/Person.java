package com.bilgeadam.effective.java.module01;

import java.util.Calendar;
import java.util.Date;

public class Person {

	private Date birthDate;
	static Calendar gmtCal;
	
	static{
		gmtCal = Calendar.getInstance();
	}

	public boolean isBabyBoomer() {
		gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		if (gmtCal.getTime() != new Date()) {
			return false;
		}
		return true;
	}

}
