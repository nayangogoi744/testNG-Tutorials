package test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example {
	@Test
	public void demoTest() {
		System.out.println("Helloq");
	}
	@Test
	public void demoTest1() {
		System.out.println("Hello");
	}
	@Test
	public void demoTest2() {
		System.out.println("Hel");
	}
	@BeforeMethod
	public void demoTest4() {
		System.out.println("BeforeMethod");
	}
}
