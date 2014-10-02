package com.bilgeadam.effective.java.module09;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdapterTestApplication {

	@Test
	public void testSorterSuccess() {
		Integer[] numbers = new Integer[] { 34, 2, 4, 12, 1 };
		Sorter sorter = new SortListAdapter();
		numbers = sorter.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			switch (i) {
			case 0:
				assertEquals(numbers[i], (Integer) 1);
				break;
			case 1:
				assertEquals(numbers[i], (Integer) 2);
				break;
			case 2:
				assertEquals(numbers[i], (Integer) 4);
				break;
			case 3:
				assertEquals(numbers[i], (Integer) 12);
				break;
			case 4:
				assertEquals(numbers[i], (Integer) 34);
				break;
			}
		}

	}

}
