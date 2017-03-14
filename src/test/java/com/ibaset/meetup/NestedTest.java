package com.ibaset.meetup;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class NestedTest {

	private Queue<String> list;
	
	@Nested
	@DisplayName("When list is empty")
	class whenEmpty {
		@BeforeEach
		void setup () {
			list = new LinkedList<String>();
		}

		@Test
		@DisplayName("Remove should throw exception")
		void removeShouldThrowException () {
			Assertions.assertThrows(NoSuchElementException.class, list::remove);
		}
		
		@Test
		@DisplayName("Size must be zero")
		void sizeShouldBeZero () {
			Assert.assertEquals(0, list.size());
		}
	}
	
}