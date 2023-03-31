package com.ust.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ThirdTest {
  @Test(priority=1,description="this is executed first")
  public void f() {
	  System.out.println("from test method f()");
  }
  @Test(priority=2,description="tests description")
  public void a() {
	  System.out.println("from test method a()");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("from beforeTest()");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("from afterTest()");
  }

}
