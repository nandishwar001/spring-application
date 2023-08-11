package com.spring.basics.learnspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(LearnSpringApplication.class, args);
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearchImpl.binarySearch(new int[] { 25, 10, 15, 11, 2 }, 11);

		if (result != -1) {
			System.out.println(result);
		} else {
			System.out.println("Not found");
		}
	}

}
