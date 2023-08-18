package com.spring.basics.learnspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics.componentscan.ComponentDao;

@Configuration
@ComponentScan("com.spring.basics.componentscan")
public class ComponentScanSpringApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ComponentScanSpringApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ComponentScanSpringApplication.class);

		ComponentDao componentDao = applicationContext.getBean(ComponentDao.class);

		LOGGER.info("{}", componentDao);

	}

}
