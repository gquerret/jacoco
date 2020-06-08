package eu.rssw;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class FooBarTest {

	@Test
	public void test1() {
		FooBar foo = new FooBar(0);
		assertEquals(foo.getSomething(), 4);
	}
}
