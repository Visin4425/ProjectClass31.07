package org.test;

import org.testng.annotations.*;

public class Sample {
	
	@BeforeClass
	private void beforeclass() {
	System.out.println("BeforeClass");	
	}
	
	@BeforeMethod
	private void beforeMethod() {
	System.out.println("BeforeMethod");
	}
	
	@AfterClass
	private void afterclass() {
	System.out.println("AfterClass");	
	}
	
	@AfterMethod
	private void afterMethod() {
	System.out.println("AfterMethod");	
	}
	
	@Test()
	private void test3() {
	System.out.println("Test3");	
	}
	
	@Test
	private void test1() {
	System.out.println("Test1");	
	}
	
	@Test
	private void test2() {
	System.out.println("Test2");	
		
	
	}
}
