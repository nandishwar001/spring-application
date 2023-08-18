package com.spring.basics.learnspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics.learnspring.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class BasicSpringApplication {

	public static void main(String[] args) {

		// With Spring Boot
		// ApplicationContext applicationContext =
		// SpringApplication.run(BasicSpringApplication.class, args);

		// Without Spring Boot

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BasicSpringApplication.class)) {

			BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);

			int result = binarySearchImpl.binarySearch(new int[] { 25, 10, 15, 11, 2 }, 11);

			if (result != -1) {
				System.out.println(result);
			} else {
				System.out.println("Not found");
			}
		}
	}

}
