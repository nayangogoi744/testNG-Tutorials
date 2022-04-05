package test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {

	@Parameters("URL")
	@Test(groups= {"Smoke"})
	public void pTest(String url) {
		System.out.println(url);
	}
	@BeforeSuite
	public void loginCarloan() {
		System.out.println("I am Before Suite");
	}
	@AfterSuite
	public void calculateCarloan() {
		System.out.println("I am After Suite");
	}
	@AfterTest
	public void exitCarloan() {
		System.out.println("I am AfterTest");
	}
	@Test(groups= {"Smoke"})
	public void grop1() {
		System.out.println("Group 1");
	}
	
	@Test(dependsOnMethods = {"grop1"})
	public void dep() {
		System.out.println("Depend Metod");
	}
	@DataProvider
	public Object[][] dataProv() {
		Object[][] obj = new Object[3][2];
		obj[0][0]="username";
		obj[0][1]="password";
		obj[1][0]="usernameexist";
		obj[1][1]="passwordexist";
		obj[2][0]="usernamelastexist";
		obj[2][1]="passwordexistlatest";
		return obj;
	}
	
	@Test(dataProvider = "dataProv")
	public void acceptProv(String us,String pas) {
		System.out.println("Username"+us+"Password"+pas);
	}
	
	@Test
	public void failedTest() {
		assertTrue(false);
	}
}
