package com.spring.basics.learnspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm sortAlgorithm;

	/*
	 * Constructor Injection
	 */
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}

	/*
	 * Setter Injection
	 */
//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}

	public int binarySearch(int[] arr, int searchKey) {

		int[] sortedArray = sortAlgorithm.sort(arr);

		int l = 0, r = sortedArray.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			// Check if x is present at mid
			if (sortedArray[m] == searchKey)
				return m;

			// If x greater, ignore left half
			if (sortedArray[m] < searchKey)
				l = m + 1;

			// If x is smaller, ignore right half
			else
				r = m - 1;
		}
		return -1;

	}
}
