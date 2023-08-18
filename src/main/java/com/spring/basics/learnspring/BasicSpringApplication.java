package com.spring.basics.learnspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics.learnspring.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class BasicSpringApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(BasicSpringApplication.class);

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
				LOGGER.info("Found at ", result);
			} else {
				System.out.println("Not found");
			}
		}
	}

}
