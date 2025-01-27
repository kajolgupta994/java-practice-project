package Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationTest {

	// Test Case 1
	@Test
	public void testCase1() {
		System.out.println("in @Test1");
	}

	// Test Case 2
	@Test
	public void testCase2() {
		System.out.println("in @Test2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("in @BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("in @AfterMethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("in @BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("in @AfterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("in @BeforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("in @AfterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("in @BeforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("in @AfterSuite");
	}

}