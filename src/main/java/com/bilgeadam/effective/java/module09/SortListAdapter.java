package com.bilgeadam.effective.java.module09;

import java.util.ArrayList;
import java.util.List;

public class SortListAdapter implements Sorter {

	@Override
	public Integer[] sort(Integer[] numbers) {
		// convert the array to a List
		List<Integer> numberList = new ArrayList<Integer>();

		for (int n : numbers) {
			numberList.add(n);
		}

		// call the adapter
		NumberSorter sorter = new NumberSorter();
		numberList = sorter.sort(numberList);

		Integer[] integerArray = new Integer[numberList.size()];
		integerArray = numberList.toArray(integerArray);
		// convert the list back to an array and return
		return integerArray;
	}
	
}
