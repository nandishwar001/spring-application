package com.spring.basics.learnspring.basic;

import java.util.Arrays;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {

	public int[] sort(int[] arr) {
		Arrays.sort(arr);

		return arr;
	}
}
