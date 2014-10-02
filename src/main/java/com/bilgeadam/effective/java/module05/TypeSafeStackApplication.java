package com.bilgeadam.effective.java.module05;

import com.bilgeadam.effective.java.module01.Stack;

public class TypeSafeStackApplication {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("yalcin");
		//stack.push(4);
		String stackElement = (String) stack.pop();
		System.out.println(stackElement);

		com.bilgeadam.effective.java.module05.Stack<String> stringStack = new com.bilgeadam.effective.java.module05.Stack<>();
		stringStack.push("yalcin");
		System.out.println(stringStack.pop());
	}

}
