package com.bilgeadam.effective.java.module01;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_CAPACITY = 16;

	public Stack() {
		elements = new Object[DEFAULT_CAPACITY];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		Object result = elements[--size];
		elements[size] = null;
		return result;
	}

	private void ensureCapacity() {
		Object[] copiedArray;
		if (elements.length == size) {
			copiedArray = elements;
			elements = Arrays.copyOf(elements, 2 * size + 1);
			copiedArray = null;
		}
	}
}
