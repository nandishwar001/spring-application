package com.spring.basics.learnspring;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm {

	public int[] sort(int[] arr) {
		Arrays.sort(arr);

		return arr;
	}
}
