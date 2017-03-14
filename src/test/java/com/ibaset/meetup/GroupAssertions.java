package com.ibaset.meetup;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class GroupAssertions {
	
	private Queue<String> list = new LinkedList<String>();

	@Test
	void grouppedAssertionsAreFine() {
		assertAll(
				() -> {assertEquals(0, list.size());},
				() -> {assertThrows(NoSuchElementException.class, list::remove);}
		);
	}
	
	@Test
	void anotherGroupAssertions() {
		list.add("One Element");
		assertAll(
				() -> {assertEquals(1, list.size());},
				() -> {assertEquals("One Element", list.peek());},
				() -> {assertThrows(NoSuchElementException.class, list::remove);}
				
		);
	}
}
