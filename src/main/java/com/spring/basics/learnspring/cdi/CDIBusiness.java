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

	public int findGreatest() {
		int maxx = Integer.MIN_VALUE;
		int[] arr = cdiDao.getData();
		for (int num : arr) {
			if (num > maxx)
				maxx = num;
		}
		return maxx;
	}
}
