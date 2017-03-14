package com.ibaset.meetup;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.expectThrows;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ExceptionTest {

	@Test 
	void assertException () {
		assertThrows(ArithmeticException.class, () -> divideByZero());
	}
	
	int divideByZero () {
		return 3/0;
	}
	
	@Test
	void verifyMessage () {
		Exception e = assertThrows(ArithmeticException.class, () -> divideByZero());
		assertEquals("/ by zero", e.getMessage());
	}
}
