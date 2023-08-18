package com.spring.basics.learnspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.basics.learnspring.cdi.CDIBusiness;

@SpringBootApplication
public class CdiSpringApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(CdiSpringApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(CdiSpringApplication.class, args);
		CDIBusiness cdiBusiness = applicationContext.getBean(CDIBusiness.class);

		LOGGER.info("{}", cdiBusiness);

	}

}
