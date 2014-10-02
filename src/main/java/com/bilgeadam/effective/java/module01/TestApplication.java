package com.bilgeadam.effective.java.module01;

import java.util.ArrayList;

import com.bilgeadam.effective.java.module02.CaseInsensitiveString;

public class TestApplication {

	public static void main(String[] args) {

		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
				.calories(9).fat(5).build();
		ArrayList<String> list = new ArrayList<String>();
		ConnectionFactory factory = ConnectionFactory.getInstance();
		factory.createConnection();

		ConnectionFactoryEnum factoryEnum = ConnectionFactoryEnum.INSTANCE;
		factoryEnum.createConnection();

		Person p = new Person();
		p.isBabyBoomer();
		p.isBabyBoomer();
		p.isBabyBoomer();

		CaseInsensitiveString caseInsensitiveString = new CaseInsensitiveString(
				"yalcin");
		
		CaseInsensitiveString caseInsensitiveString2 = new CaseInsensitiveString(
				"YALCIN");
		
		if(caseInsensitiveString.equals("YALCIN")){
			System.out.println("true");
		}
		
		if("YALCIN".equals(caseInsensitiveString)){
			System.out.println("true");
		}
		
		if(caseInsensitiveString.equals(caseInsensitiveString2)){
			System.out.println("true");
		}

	}

}
