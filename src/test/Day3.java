package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day3 {
	@Test(enabled = false)
	public void loginCarloan() {
		System.out.println("Hello10");
	}
	@Test(priority=1)
	public void calculateCarloan() {
		System.out.println("Hello11");
	}
	@Test(priority=0)
	public void exitCarloan() {
		System.out.println("Hello12");
	}
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("I am BeforeTest");
		
	}
	@Test(groups= {"Smoke","Test"})
	public void group() {
		System.out.println("Group 3");
	}
}
