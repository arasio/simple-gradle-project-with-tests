package com.example.project;

import org.junit.Test;
import static org.junit.Assert.*;

public class Sample3Test {
	@Test
	public void test() throws InterruptedException {
		assertEquals(3, 1 + 2);
		Thread.sleep(30000);
	}
}
