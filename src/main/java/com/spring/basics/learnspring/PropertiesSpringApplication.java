package com.spring.basics.learnspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spring.basics.learnspring.properties.ExternalService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class PropertiesSpringApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ScopeSpringApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				PropertiesSpringApplication.class)) {

			ExternalService externalService = applicationContext.getBean(ExternalService.class);

			LOGGER.info("{}", externalService.returnServiceUrl());

		}
	}

}
