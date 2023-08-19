package com.spring.basics.learnspring.cdi;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Named
@Component
public class CDIDao {

	public int[] getData() {
		return new int[] { 1, 2, 3 };
	}
}
