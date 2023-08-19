package com.spring.basics.learnspring.cdi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CDIBusinessTest {

	@Mock
	CDIDao cdiDaoMock;

	@InjectMocks
	CDIBusiness cdiBusiness;

	@Test
	public void scenario1() {

		Mockito.when(cdiDaoMock.getData()).thenReturn(new int[] { 1, 5, 3, 2 });
		assertEquals(5, cdiBusiness.findGreatest());
	}

	@Test
	public void scenario2() {

		Mockito.when(cdiDaoMock.getData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, cdiBusiness.findGreatest());
	}

}
