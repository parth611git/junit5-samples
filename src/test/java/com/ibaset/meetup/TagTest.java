package com.ibaset.meetup;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.IncludeTags;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@IncludeTags({"critical"})
public class TagTest {

	@Tag("critical")
	@Test
	void basicFunctionalityTestcase () {
		assertTrue(true);
	}
	
	@Tag("normal")
	@Test
	void advanceFunctionalityTestcase () {
		assertTrue(true);
	}
}
