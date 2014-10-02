package com.bilgeadam.effective.java.module05;

import java.util.ArrayList;
import java.util.List;

public class RawTypeApplication {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		List strings = new ArrayList<>();
		
		strings.add("yalcin");
		strings.add("yenigun");
		
		String myString = (String)strings.get(0);
		System.out.println(myString);
		

	}

}
