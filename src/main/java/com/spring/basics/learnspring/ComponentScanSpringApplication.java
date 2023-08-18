package com.spring.basics.learnspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.basics.componentscan.ComponentDao;

@SpringBootApplication
@ComponentScan("com.spring.basics.componentscan")
public class ComponentScanSpringApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ComponentScanSpringApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ComponentScanSpringApplication.class, args);

		ComponentDao componentDao = applicationContext.getBean(ComponentDao.class);

		LOGGER.info("{}", componentDao);

	}

}
