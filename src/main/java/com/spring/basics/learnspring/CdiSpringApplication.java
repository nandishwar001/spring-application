package com.spring.basics.learnspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics.learnspring.cdi.CDIBusiness;

@Configuration
@ComponentScan
public class CdiSpringApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(CdiSpringApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CdiSpringApplication.class);
		CDIBusiness cdiBusiness = applicationContext.getBean(CDIBusiness.class);

		LOGGER.info("{}", cdiBusiness);

	}

}
