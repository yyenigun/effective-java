package com.bilgeadam.effective.java.module07;

public class VarArgs {
	
	static int sum(int first, int... args){
		int result = first;
		for(int arg : args){
			result += arg;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(1));
		System.out.println(sum(1,3));
	}

}
