package com.spring.basics.learnspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {

		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] { 25, 10, 15, 11, 2 }, 11);

		if (result != -1) {
			System.out.println(result);
		} else {
			System.out.println("Not found");
		}

		SpringApplication.run(LearnSpringApplication.class, args);

	}

}
