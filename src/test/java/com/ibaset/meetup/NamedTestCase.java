package com.ibaset.meetup;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("This is awesome test class")
@RunWith(JUnitPlatform.class)
public class NamedTestCase {

	@DisplayName("This is the lonely testcase")
	@Test
	void simpleTestCase () {
		assertTrue(true);
	}
	
}
