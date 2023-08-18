package com.spring.basics.learnspring.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Component;

@Named
@Component
public class CDIBusiness {

	@Inject
	CDIDao cdiDao;

	public CDIDao getCdiDao() {
		return cdiDao;
	}

	public void setCdiDao(CDIDao cdiDao) {
		this.cdiDao = cdiDao;
	}

}
