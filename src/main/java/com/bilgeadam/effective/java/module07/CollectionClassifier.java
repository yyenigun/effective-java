package com.bilgeadam.effective.java.module07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionClassifier {

	/**
	 * This method is for classifying Set implementations
	 * @param s can be HashSet, TreeSet..etc.
	 * @return The type of collection
	 */
	public static String classify(Set<?> s) {
		return "Set";
	}

	public static String classify(List<?> s) {
		return "List";
	}

	public static String classify(Collection<?> s) {
		return "Unknown Collection";
	}

	public static void main(String[] args) throws InterruptedException {
		long start = new Date().getTime();
		Collection<?>[] collections = { new HashSet<String>(),
				new ArrayList<String>(),
				new HashMap<String, String>().values(), new HashSet<String>(),
				new ArrayList<String>(), new HashMap<String, String>().values()};
		for (Collection<?> c : collections) {
			System.out.println(classify(c));
		}
		System.out.println(new Date().getTime() - start);
	}

}
