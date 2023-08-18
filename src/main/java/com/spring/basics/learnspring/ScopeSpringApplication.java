package com.spring.basics.learnspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.basics.learnspring.scope.PersonDao;

@SpringBootApplication
public class ScopeSpringApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ScopeSpringApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ScopeSpringApplication.class, args);
		PersonDao personDao = applicationContext.getBean(PersonDao.class);

		PersonDao personDao2 = applicationContext.getBean(PersonDao.class);

		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());

		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());
	}

}
