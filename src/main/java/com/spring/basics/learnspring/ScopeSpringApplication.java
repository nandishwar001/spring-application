package com.spring.basics.learnspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics.learnspring.scope.PersonDao;

@Configuration
@ComponentScan
public class ScopeSpringApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ScopeSpringApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeSpringApplication.class);
		PersonDao personDao = applicationContext.getBean(PersonDao.class);

		PersonDao personDao2 = applicationContext.getBean(PersonDao.class);

		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());

		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());
	}

}
