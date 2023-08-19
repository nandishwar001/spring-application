package com.spring.basics.learnspring.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.basics.learnspring.BasicSpringApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = BasicSpringApplication.class)
public class BinaryTest {

	@Autowired
	BinarySearchImpl binarySearchImpl;

	@Test
	public void testBasic() {

		int result = binarySearchImpl.binarySearch(new int[] { 2, 3, 5, 7 }, 5);
		assertEquals(2, result);
	}

}
