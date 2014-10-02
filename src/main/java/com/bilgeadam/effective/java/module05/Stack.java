package com.bilgeadam.effective.java.module05;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<T> {
	
	private List<T> elements;
	private int size = 0;
	private static final int DEFAULT_CAPACITY = 16;

	public Stack() {
		elements = new ArrayList<T>(DEFAULT_CAPACITY);
	}

	public void push(T e) {
		elements.add(size++,e);
	}

	public T pop() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		T result = elements.get(--size);
		return result;
	}
}
