package com.ust.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTest {
  @Test
  public void f() {
	  System.out.println("from test method");
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
