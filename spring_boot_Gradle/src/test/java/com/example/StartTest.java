package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StartTest {
	@Test public void testSomeStartMethod() {
        Start classUnderTest = new Start();
        assertTrue("someStartMethod should return 'true'", classUnderTest.someStartMethod());
    }
}
