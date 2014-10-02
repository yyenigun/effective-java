package com.bilgeadam.effective.java.lab01;

public class TestApplication {

	public static void main(String[] args) {
		
		Point p1 = new Point(2,2);
		Point p2 = new Point(2,2);
		Point p3 = new Point(2,2);
		
		if(p1.equals(p2) && p2.equals(p1)){
			System.out.println("the equality is Symetric");
		}else{
			System.err.println("the equality is Non Symetric");
		}
		
		if(p1.equals(p2) && p2.equals(p3)){
			if(p1.equals(p3)){
				System.out.println("the equality is Transitive");
			}else{
				System.err.println("the equality is Non Transitive");
			}
		}

	}

}
