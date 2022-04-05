package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day2 {

	@Test
	public void loginHomeloan() {
		System.out.println("home");
	}
	@Test
	public void loginAgainloan() {
		System.out.println("home");
	}
	@Test
	public void loginNowloan() {
		System.out.println("home");
	}
	@Test
	public void calculateHomeloan() {
		System.out.println("Home1");
	}
	@Test
	public void exitHomeloan() {
		System.out.println("Home3");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am Before Method");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am Before Class");
	}
	@Test(groups= {"Smoke"})
	public void group() {
		System.out.println("Group 2");
	}
}
