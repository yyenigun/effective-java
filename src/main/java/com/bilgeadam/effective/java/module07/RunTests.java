package com.bilgeadam.effective.java.module07;

import java.lang.reflect.Method;

public class RunTests {

	public static void main(String[] args) throws Exception {
		int tests = 0;
		int passed = 0;
		Class testClass = Class
				.forName("com.bilgeadam.effective.java.module7.MyTestClass");
		for (Method m : testClass.getDeclaredMethods()) {
			if (m.isAnnotationPresent(Test.class)) {
				tests++;
				try {
					m.invoke(null);
					passed++;
				} catch (Exception e) {
					System.out.println("INVALID @Test : " + m);
				}
			}
		}

		System.out.println("Passed : " + passed + " Failed : "
				+ (tests - passed));

	}

}
